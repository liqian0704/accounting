package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.common.enums.FeeTypeEnum;
import com.miitang.facade.merchant.dto.BaseResDTO;
import com.miitang.facade.merchant.dto.fee.FeeInfo;
import com.miitang.facade.merchant.dto.fee.FeeListRequestDTO;
import com.miitang.facade.merchant.enums.product.FeeProduct;
import com.miitang.facade.merchant.facade.FeeInfoFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU19_FeeUpdate {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    FeeInfoFacade feeInfoFacade;
    FeeListRequestDTO feeListRequestDTO=new FeeListRequestDTO();
    FeeInfo feeInfo=new FeeInfo();

    List<FeeInfo> feeInfoList=new ArrayList<FeeInfo>();
    @Test(dataProvider = "dp")
    public void feeUpdate(String parentMerchantNo,String merchantNo,String feeBizCode,FeeTypeEnum feeTypeEnum,BigDecimal feeAmount,String feeEffectiveDate,
                          String feeExpiryDate,FeeProduct feeProduct,BigDecimal feeRate){
        try {
            feeInfoFacade=(FeeInfoFacade)hessianProxyFactory.create(FeeInfoFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/FeeInfoFacade");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        feeListRequestDTO.setParentMerchantName("运营商户");
        feeListRequestDTO.setParentMerchantNo(parentMerchantNo);
        feeListRequestDTO.setAgentMerchantNo("1013243273");
        feeListRequestDTO.setMerchantNo(merchantNo);
        feeListRequestDTO.setFeeBizCode(feeBizCode);
        feeInfo.setFeeType(feeTypeEnum);
        feeInfo.setFeeAmount(feeAmount);
        feeInfo.setFeeEffectiveDate(feeEffectiveDate);
        feeInfo.setFeeExpiryDate(feeExpiryDate);
        feeInfo.setFeeProduct(FeeProduct.PAY_STANDARD);
        feeInfo.setFeeRate(feeRate);
        feeInfoList.add(feeInfo);
        feeListRequestDTO.setFeeInfoList(feeInfoList);
        BaseResDTO feeAddResp= feeInfoFacade.updateFee(feeListRequestDTO);
        System.out.println(JSONUtils.toJsonString(feeAddResp));


    }
    @DataProvider(name ="dp")
    public Object [][] dp(){
        return new Object[][]{
              //  String parentMerchantNo,String merchantNo,String feeBizCode,FeeTypeEnum feeTypeEnum,BigDecimal feeAmount,String feeEffectiveDate,
               // String feeExpiryDate,FeeProduct feeProduct,BigDecimal feeRate
            //修改生效时间和失效时间、金额、比例
               // {"1042781335","11050937813255","ZR",FeeTypeEnum.RATE_AMOUNT,BigDecimal.valueOf(0.1),"2018-01-27 00:00:00","2018-01-28 10:00:00",FeeProduct.PAY_STANDARD,BigDecimal.valueOf(0.2),},
                //修改费率类型
                {"1013243273","11070943378139","ZR",FeeTypeEnum.FIXED_RATE,BigDecimal.valueOf(0),"2018-03-16 19:05:00","2028-02-28 10:00:00",FeeProduct.PAY_STANDARD,BigDecimal.valueOf(0.0060),},


        };
    }

}
