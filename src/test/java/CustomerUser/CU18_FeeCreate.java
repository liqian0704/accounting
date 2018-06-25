package CustomerUser;


import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.common.enums.FeeTypeEnum;
import com.miitang.facade.merchant.dto.BaseResDTO;
import com.miitang.facade.merchant.dto.fee.FeeRequestDTO;
import com.miitang.facade.merchant.enums.product.FeeProduct;
import com.miitang.facade.merchant.facade.FeeInfoFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU18_FeeCreate {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    FeeInfoFacade  feeInfoFacade;
    FeeRequestDTO feeRequestDTO=new FeeRequestDTO();

@Test(dataProvider = "dp")//http://10.151.32.27:30241
    public void feeCreate(String parentMerchantNo,String parentMerchantName,String merchantNo,String merchantName,BigDecimal feeAmount,String feeBizCode
                , String feeEfectiveDate  ,String feeExpiryDate,FeeProduct feeProduct,BigDecimal feeRate,FeeTypeEnum feeType){
        try {
            feeInfoFacade=(FeeInfoFacade)hessianProxyFactory.create(FeeInfoFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/FeeInfoFacade");
            feeRequestDTO.setParentMerchantNo(parentMerchantNo);
            feeRequestDTO.setParentMerchantName(parentMerchantName);
            feeRequestDTO.setMerchantNo(merchantNo);
            feeRequestDTO.setMerchantName(merchantName);
            feeRequestDTO.setAgentMerchantNo("1042781335");
            feeRequestDTO.setFeeAmount(feeAmount);
            feeRequestDTO.setFeeBizCode(feeBizCode);
            feeRequestDTO.setFeeEffectiveDate(feeEfectiveDate);
            feeRequestDTO.setFeeExpiryDate(feeExpiryDate);
            feeRequestDTO.setFeeProduct(feeProduct);
            feeRequestDTO.setFeeRate(feeRate);
            feeRequestDTO.setFeeType(feeType);
            BaseResDTO  feeRes=(BaseResDTO)feeInfoFacade.addFee(feeRequestDTO);
            System.out.println(JSONUtils.toJsonString(feeRes));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @DataProvider(name = "dp")
    public Object [][] dp(){
        return new Object [][] {
               // {"1042781335","测试代理商","11050953278259","测试商户",BigDecimal.valueOf(0),"ZR","2018-01-24 22:00:00",""},
//                //生效日期小于当前日期
//                {"10427813359","测试代理商","0123","测试商户",BigDecimal.valueOf(0),"ZR","2016-01-01 00:00:00","2017-01-01 00:00:00"},
//                {"","测试代理商","0123","测试商户",BigDecimal.valueOf(0),"ZR","2018-01-24 00:00:00","2018-02-02 00:00:00"},
              //  {"10427813359","","0123","测试商户",BigDecimal.valueOf(0),"ZR","2018-01-24 00:00:00","2018-02-02 00:00:00"},
               // {"10427813359","测试代理商","","测试商户",BigDecimal.valueOf(0),"ZR","2018-01-24 00:00:00","2018-02-02 00:00:00"},
                //{"10427813359","测试代理商","0123","",BigDecimal.valueOf(0),"ZR","2018-01-24 00:00:00","2018-02-02 00:00:00"},
                //当feeType为FIXED_RATE时，费率为空
//                {"1042781335","测试代理商","11070943378139","",null,"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.PAY_STANDARD,BigDecimal.valueOf(0.1),FeeTypeEnum.FIXED_RATE},
////                //生效时间早于当前时间,固定金额0.1,比例为null,验证返回日期有误
//                {"1042781335","测试代理商","11070943378139","",BigDecimal.valueOf(0.1),"ZR","2018-01-25 00:00:00","2018-01-28 00:00:00",FeeProduct.PAY_STANDARD,null,FeeTypeEnum.FIXED_AMOUNT},
//                //当为固定金额时,费率为空,金额为0,验证返回费率金额有误
//                {"1042781335","测试代理商","11070943378139","",BigDecimal.valueOf(0),"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.PAY_STANDARD,null,FeeTypeEnum.FIXED_AMOUNT},
//                //固定加比例时,费率为空,金额为0.1,验证返回费率金额有误
//                {"1042781335","测试代理商","11070943378139","",BigDecimal.valueOf(0.1),"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.PAY_STANDARD,null,FeeTypeEnum.RATE_AMOUNT},
//                //固定加比例时,费率为1,金额为0.1,验证返回费率金额有误
//                {"1042781335","测试代理商","11070943378139","",BigDecimal.valueOf(0.1),"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.PAY_STANDARD,null,FeeTypeEnum.RATE_AMOUNT},
//                //固定加比利时,金额为空,验证返回费率金额有误
//                {"1042781335","测试代理商","11070943378139","",null,"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.PAY_STANDARD,BigDecimal.valueOf(0.2),FeeTypeEnum.RATE_AMOUNT},
//                //商户状态失效,验证新增失败,商户状态有误
//                {"1042781335","测试代理商","11070943378139","",BigDecimal.valueOf(0.1),"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.PAY_STANDARD,BigDecimal.valueOf(0.2),FeeTypeEnum.RATE_AMOUNT},
//                //商户和运营商关系不存在,验证新增失败
//                {"10427813359","测试代理商","11070943378139","",BigDecimal.valueOf(0.1),"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.QUICK_CASH,BigDecimal.valueOf(0.2),FeeTypeEnum.RATE_AMOUNT},
//                //正常流程
//                //{"1042781335","测试代理商","11050953278271","",BigDecimal.valueOf(0.1),"ZR","2018-01-27 00:00:00","2018-01-28 10:00:00",FeeProduct.QUICK_CASH,BigDecimal.valueOf(0.2),FeeTypeEnum.RATE_AMOUNT},
//                //日期时间有交集,验证已经有一条生效记录,新增失败
//               // {"1042781335","测试代理商","11050953278271","",BigDecimal.valueOf(0.1),"ZR","2018-02-06 22:00:00","2018-09-09 00:00:00",FeeProduct.QUICK_CASH,BigDecimal.valueOf(0.2),FeeTypeEnum.RATE_AMOUNT},
//                {"1042781335","测试代理商","11070943378139","",BigDecimal.valueOf(0.2),"ZR","","",FeeProduct.QUICK_CASH,BigDecimal.valueOf(0.3),FeeTypeEnum.RATE_AMOUNT},
                {"1013243273","测试代理商","11070943378139","",BigDecimal.valueOf(0),"ZR","2018-03-16 19:21:00","2098-09-09 00:00:00",FeeProduct.PAY_STANDARD,BigDecimal.valueOf(0.006),FeeTypeEnum.FIXED_RATE},


        };

    }
}

