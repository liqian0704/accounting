package marketting;


import com.caucho.hessian.client.HessianProxyFactory;
import com.google.common.collect.Lists;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.miitang.MiitangProductRecordReqDTO;
import com.miitang.facade.marketing.dto.parentMerchant.AddProfitModelReqDTO;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerchantConfigAddReqDTO;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerchantConfigReqDTO;
import com.miitang.facade.marketing.dto.parentMerchant.ProfitModelDetailDTO;
import com.miitang.facade.marketing.enumtype.*;
import com.miitang.facade.marketing.facade.OperatorProductManageFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**按批次号查询推广人汇总明细(给账单用的)
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA19_ParentMerchantOpenConfigCreatelevel {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test()
    public void selectPromoterProfitFee() {
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
            ParentMerchantConfigAddReqDTO configAddReqDTO = new ParentMerchantConfigAddReqDTO();

            MiitangProductRecordReqDTO recordReqDTO = new MiitangProductRecordReqDTO();
            recordReqDTO.setProductNo("1040");
            recordReqDTO.setParentMerchantNo("1042781243");

            ParentMerchantConfigReqDTO parentMerchantConfigReqDTO = new ParentMerchantConfigReqDTO();
            parentMerchantConfigReqDTO.setParentMerchantNo("1042781243");
            parentMerchantConfigReqDTO.setProductName("测试运营商产品名称");
            parentMerchantConfigReqDTO.setProfitCondition(ProfitConditionEnum.AUTO_CONFIRM);
            parentMerchantConfigReqDTO.setTaxTool(TaxToolEnum.INCOME_TAX);

            //parentMerchantConfigReqDTO.setProfitPeriod(PlayMoneyPeriodEnum.DAY);

           // parentMerchantConfigReqDTO.setProfitPeriod(PlayMoneyPeriodEnum.MONTH);
            //parentMerchantConfigReqDTO.setDate(Integer.parseInt("3"));

            parentMerchantConfigReqDTO.setProfitPeriod(PlayMoneyPeriodEnum.WEEK);
            parentMerchantConfigReqDTO.setDate(Integer.parseInt("3"));

            parentMerchantConfigReqDTO.setProductDesc("产品说明名称");
            parentMerchantConfigReqDTO.setProfitTool(SaleToolEnum.MULTISTAGE_RATIO);


            AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
            modelReqDTO.setParentMerchantNo("1042781243");
            modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
            modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


            ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();
            ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
            detailDTO.setLevelValue(1);
            detailDTO.setLevelName("小蜜蜂");
            detailDTO.setUpgradeValue(2);
            detailDTO.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
            detailDTO.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
            detailDTO.setProfitLevel(3);
            detailDTO.setProfitRateValue("0.2;0.1;0.05");

            ProfitModelDetailDTO detailDTO2 = new ProfitModelDetailDTO();
            detailDTO2.setLevelValue(2);
            detailDTO2.setLevelName("小蜜蜂");
            detailDTO2.setUpgradeValue(5);
            detailDTO2.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
            detailDTO2.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
            detailDTO2.setProfitLevel(3);
            detailDTO2.setProfitRateValue("0.2;0.1;0.05");

            ProfitModelDetailDTO detailDTO3 = new ProfitModelDetailDTO();
            detailDTO3.setLevelValue(3);
            detailDTO3.setLevelName("小蜜蜂");
            detailDTO3.setUpgradeValue(-1);
            detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
            detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
            detailDTO3.setProfitLevel(3);
            detailDTO3.setProfitRateValue("0.2;0.1;0.05");


            detailDTOS.add(detailDTO2);
            detailDTOS.add(detailDTO3);
            detailDTOS.add(detailDTO);

            modelReqDTO.setDetails(detailDTOS);

            configAddReqDTO.setConfigReqDTO(parentMerchantConfigReqDTO);
            configAddReqDTO.setProductRecordReqDTO(recordReqDTO);
            configAddReqDTO.setProfitModelReqDTO(modelReqDTO);

            MTResponse<String> response = operatorProductManageFacade.createParentMerchantProductConfig(configAddReqDTO);
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
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
                {"1042781335","C1803120301","2018-01-04 :00:00:00","2018-04-04 :00:00:00","按批次号查询"},



        };
    }
}
