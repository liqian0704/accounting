package account_verifyNew;
import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.common.enums.PayCompanyCode;
import com.miitang.facade.accounting.dto.TotalBillNoReqDTO;
import com.miitang.facade.accounting.dto.TotalBillNoResDTO;
import com.miitang.facade.accounting.enumtype.BillTypeEnum;
import com.miitang.facade.accounting.facade.TotalBillFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Date;


public class Account01_queryTotalBillNo {
   static String envFlag=CommPro.env;
   static String envuri=CommPro.getEnvURI(envFlag);
   static TotalBillFacade totalBillFacade;
    static TotalBillNoReqDTO reqDTO=new TotalBillNoReqDTO();
   static {
       HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();


       try {
           totalBillFacade= (TotalBillFacade) hessianProxyFactory.create(TotalBillFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/TotalBillFacade");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } finally {
       }
   }
    /**
     * Created by yp-tc-2646 on 18/3/5.
     * 增加支付公司计费模版
     */

@Test(dataProvider = "dp")
    public void queryTotalBillNo(String parentMerchantNo, String bizSystem, BillTypeEnum billTypeEnum, PayCompanyCode payCompany, Date orderDate,String verify ){
    System.out.println(envuri);
    reqDTO.setParentMerchantNo(parentMerchantNo);
    reqDTO.setBizSystemNo(bizSystem);
    reqDTO.setBillType(billTypeEnum);
    reqDTO.setPayCompany(payCompany);
    reqDTO.setOrderDate(orderDate);
    TotalBillNoResDTO respose=totalBillFacade.queryTotalBillNo(reqDTO);
    System.out.println(JSONUtils.toJsonString(respose));
}

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
              // {"1042781335","TRADE",BillTypeEnum.PROMOTER_BILL,PayCompanyCode.YEEPAY,new Date(118, 3, 8),"按批次号查询"},
                //{"1042781335","TRADE",BillTypeEnum.PROMOTER_BILL,PayCompanyCode.YEEPAY,new Date(118, 3, 9),"按批次号查询"},
                {"1042781335","TRADE",BillTypeEnum.PROMOTER_BILL,PayCompanyCode.YEEPAY,new Date(118, 4, 10),"按批次号查询"},




        };
    }
//    @Test(dataProvider = "dpE")
//    public void queryTotalBillNoException(String parentMerchantNo, String bizSystem, BillTypeEnum billTypeEnum, PayCompanyCode payCompany, Date date){
//        System.out.println(envuri);
//        reqDTO.setParentMerchantNo(parentMerchantNo);
//        reqDTO.setBizSystemNo(bizSystem);
//        reqDTO.setBillType(billTypeEnum);
//        reqDTO.setPayCompany(payCompany);
//        reqDTO.setOrderDate(date);
//        TotalBillNoResDTO respose=totalBillFacade.queryTotalBillNo(reqDTO);
//        System.out.println(JSONUtils.toJsonString(respose));
//    }
//
//    @DataProvider(name = "dpE")
//    public Object[][] dpE() {
//        return new Object[][]{
//                {"1042781335","C1803120301","2018-01-04 :00:00:00","2018-04-04 :00:00:00","按批次号查询"},
//
//
//
//        };
//    }
}
