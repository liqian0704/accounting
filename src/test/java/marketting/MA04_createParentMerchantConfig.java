package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerchantConfigReqDTO;
import com.miitang.facade.marketing.enumtype.PlayMoneyPeriodEnum;
import com.miitang.facade.marketing.enumtype.ProfitConditionEnum;
import com.miitang.facade.marketing.enumtype.SaleToolEnum;
import com.miitang.facade.marketing.enumtype.TaxToolEnum;
import com.miitang.facade.marketing.facade.OperatorProductManageFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA04_createParentMerchantConfig {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test()
    public void MA04_createParentMerchantConfig() {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        OperatorProductManageFacade operatorProductManageFacade;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            operatorProductManageFacade = (OperatorProductManageFacade) hessianProxyFactory.create(OperatorProductManageFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/OperatorProductManageFacade");
            ParentMerchantConfigReqDTO reqDTO = new ParentMerchantConfigReqDTO();
            reqDTO.setDate(null);
            reqDTO.setParentMerchantNo("1042781335");
            reqDTO.setProductName("小蜜");
            reqDTO.setProductDesc("xiaomifeng01");
            reqDTO.setProfitTool(SaleToolEnum.PRICE_GAP);
            reqDTO.setProfitPeriod(PlayMoneyPeriodEnum.DAY);
            reqDTO.setTaxTool(TaxToolEnum.INCOME_TAX);
            reqDTO.setProfitCondition(ProfitConditionEnum.AUTO_CONFIRM);

            MTResponse response = operatorProductManageFacade.createParentMerchantConfig(reqDTO);
            System.out.println(JSONUtils.toJsonString(response));
            String code = response.getCode();
//            if(code.equals("MT00000")){
//                responseCode="发送成功";
//            }else if (code.equals("MER20057")){
//                responseCode="短信发送失败";
//
//            }
//
//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    @Test(dataProvider = "dp")
    public void MA04_createParentMerchantConfigException(String parentMerchantNo,String productName,String productDesc) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        OperatorProductManageFacade operatorProductManageFacade;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            operatorProductManageFacade = (OperatorProductManageFacade) hessianProxyFactory.create(OperatorProductManageFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/OperatorProductManageFacade");
            ParentMerchantConfigReqDTO reqDTO = new ParentMerchantConfigReqDTO();
            reqDTO.setDate(28);
            reqDTO.setParentMerchantNo(parentMerchantNo);
            reqDTO.setProductName(productName);
            reqDTO.setProductDesc(productDesc);
            reqDTO.setProfitTool(SaleToolEnum.PRICE_GAP);
            reqDTO.setProfitPeriod(PlayMoneyPeriodEnum.MONTH);
            reqDTO.setTaxTool(TaxToolEnum.INCOME_TAX);
            reqDTO.setProfitCondition(ProfitConditionEnum.AUTO_CONFIRM);

            MTResponse response = operatorProductManageFacade.createParentMerchantConfig(reqDTO);
            System.out.println(JSONUtils.toJsonString(response));
            String code = response.getCode();
//            if(code.equals("MT00000")){
//                responseCode="发送成功";
//            }else if (code.equals("MER20057")){
//                responseCode="短信发送失败";
//
//            }
//
//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
//                {null,"xiaomifeng","xiaomifengDesc"},
//                {"","xiaomifeng","xiaomifengDesc"},
//                {"1042781335",null,"xiaomifengDesc"},
//                {"1042781335","","xiaomifengDesc"},
//               {"1042781335","xiaomifeng",null},
//                {"1042781335","xiaomifeng",""},
                //{"1042781335","xiaomifengDDD","xiaomifengDesc"},
                {"1053278041","xiaomifengDDD","xiaomifengDesc"},
        };
    }
}