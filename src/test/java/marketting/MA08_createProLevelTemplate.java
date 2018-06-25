package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.google.common.collect.Lists;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.parentMerchant.AddProfitModelReqDTO;
import com.miitang.facade.marketing.dto.parentMerchant.ProfitModelDetailDTO;
import com.miitang.facade.marketing.enumtype.BussinessTypeEnum;
import com.miitang.facade.marketing.enumtype.SaleToolEnum;
import com.miitang.facade.marketing.enumtype.UpgradeConditonEnum;
import com.miitang.facade.marketing.facade.PromoterLevelTemplateFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA08_createProLevelTemplate {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    PromoterLevelTemplateFacade promoterLevelTemplateFacade = (PromoterLevelTemplateFacade) hessianProxyFactory.create(PromoterLevelTemplateFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/PromoterLevelTemplateFacade");

    public MA08_createProLevelTemplate() throws MalformedURLException {
    }


    @Test()
    public void createProLevelTemplate() {




        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        System.out.println(envuri);

        AddProfitModelReqDTO modelReqDTO= new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781335");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);
        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();
        ProfitModelDetailDTO detailDTO1 = new ProfitModelDetailDTO();
        detailDTO1.setLevelValue(1);
        detailDTO1.setLevelName("xiaoliu");
        detailDTO1.setUpgradeValue(5);
        detailDTO1.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO1.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO1.setProfitLevel(3);
        detailDTO1.setProfitRateValue("0.2;0.1;0.005");

        ProfitModelDetailDTO detailDTO2 = new ProfitModelDetailDTO();
        detailDTO2.setLevelValue(2);
        detailDTO2.setLevelName("liuzong");
        detailDTO2.setUpgradeValue(5);
        detailDTO2.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO2.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO2.setProfitLevel(3);
        detailDTO2.setProfitRateValue("0.2;0.1;0.05");

        ProfitModelDetailDTO detailDTO3 = new ProfitModelDetailDTO();
        detailDTO3.setLevelValue(3);
        detailDTO3.setLevelName("liudong");
        detailDTO3.setUpgradeValue(5);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(3);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05");


        detailDTOS.add(detailDTO1);
        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        modelReqDTO.setDetails(detailDTOS);

        MTResponse<String> response = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
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


    }

    /**
     * 添加推广人等级模板
     * 用例：测试等级不连续，通过修改levelValue可以测试是否从1等级开始，最大等级结束
     * @throws Exception
     */
    @Test
    public void addProfitModelCaseError1() throws Exception {

        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781243");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();

//        ProfitModelDetailDTO a = new ProfitModelDetailDTO();

        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(2);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(5);
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
        detailDTO3.setLevelValue(5);
        detailDTO3.setLevelName("小蜜蜂");
        detailDTO3.setUpgradeValue(5);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(3);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }


    /**
     * 添加推广人等级模板
     * 用例：测试费率是否超过了最大费率
     * @throws Exception
     */
    @Test
    public void addProfitModelCaseError2() throws Exception {
        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781243");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();

        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(1);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(5);
        detailDTO.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO.setProfitLevel(3);
        detailDTO.setProfitRateValue("0.35;0.1;0.06");

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
        detailDTO3.setUpgradeValue(5);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(3);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }


    /**
     * 添加推广人等级模板
     * 用例：测试等级模板是否匹配（例如profitLevel是3，但profitRateValue却有2级或者是4级）
     * @throws Exception
     */
    @Test
    public void addProfitModelCaseError3() throws Exception {
        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781243");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();


        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(1);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(5);
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
        detailDTO2.setProfitRateValue("0.2;0.1;");

        ProfitModelDetailDTO detailDTO3 = new ProfitModelDetailDTO();
        detailDTO3.setLevelValue(3);
        detailDTO3.setLevelName("小蜜蜂");
        detailDTO3.setUpgradeValue(5);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(3);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }


    /**
     * 添加推广人等级模板
     * 用例：测试高等级分润层数必须小于等于低等级的
     *
     * @throws Exception
     */
    @Test
    public void addProfitModelCaseError4() throws Exception {
        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781243");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();
        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(1);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(0);
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
        detailDTO3.setUpgradeValue(5);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(4);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05;0.02");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }

    /**
     * 最高级别为-1，其他等级升级值必须>0
     * @throws Exception
     */
    @Test
    public void addProfitModelCaseError5() throws Exception {
        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781243");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();
        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(1);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(0);
        detailDTO.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO.setProfitLevel(3);
        detailDTO.setProfitRateValue("0.2;0.1;0.05");

        ProfitModelDetailDTO detailDTO2 = new ProfitModelDetailDTO();
        detailDTO2.setLevelValue(2);
        detailDTO2.setLevelName("小蜜蜂");
        detailDTO2.setUpgradeValue(0);
        detailDTO2.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO2.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO2.setProfitLevel(3);
        detailDTO2.setProfitRateValue("0.2;0.1;0.05");

        ProfitModelDetailDTO detailDTO3 = new ProfitModelDetailDTO();
        detailDTO3.setLevelValue(3);
        detailDTO3.setLevelName("小蜜蜂");
        detailDTO3.setUpgradeValue(0);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(3);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }

    /**
     *每个等级的各层分润比例从第一个值逐级递减
     * @throws Exception
     */
    @Test
    public void addProfitModelCaseError6() throws Exception {
        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781243");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();
        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(1);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(0);
        detailDTO.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO.setProfitLevel(3);
        detailDTO.setProfitRateValue("0.2;0.3;0.05");

        ProfitModelDetailDTO detailDTO2 = new ProfitModelDetailDTO();
        detailDTO2.setLevelValue(2);
        detailDTO2.setLevelName("小蜜蜂");
        detailDTO2.setUpgradeValue(1);
        detailDTO2.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO2.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO2.setProfitLevel(3);
        detailDTO2.setProfitRateValue("0.2;0.1;0.05");

        ProfitModelDetailDTO detailDTO3 = new ProfitModelDetailDTO();
        detailDTO3.setLevelValue(3);
        detailDTO3.setLevelName("小蜜蜂");
        detailDTO3.setUpgradeValue(2);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(3);
        detailDTO3.setProfitRateValue("0.2;0.1;0.05");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }
    @Test
    public void addProfitModelTestData() throws Exception {

        AddProfitModelReqDTO modelReqDTO = new AddProfitModelReqDTO();
        modelReqDTO.setParentMerchantNo("1042781335");
        modelReqDTO.setMaxProfitRate(new BigDecimal("0.5"));
        modelReqDTO.setUpgradeConditon(UpgradeConditonEnum.AUTH_MERCHANT_NUM);


        ArrayList<ProfitModelDetailDTO> detailDTOS = Lists.newArrayList();

//        ProfitModelDetailDTO a = new ProfitModelDetailDTO();

        ProfitModelDetailDTO detailDTO = new ProfitModelDetailDTO();
        detailDTO.setLevelValue(1);
        detailDTO.setLevelName("小蜜蜂");
        detailDTO.setUpgradeValue(0);
        detailDTO.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO.setProfitLevel(4);
        detailDTO.setProfitRateValue("0.2;0.15;0.1;0.05");

        ProfitModelDetailDTO detailDTO2 = new ProfitModelDetailDTO();
        detailDTO2.setLevelValue(2);
        detailDTO2.setLevelName("小蜜蜂");
        detailDTO2.setUpgradeValue(5);
        detailDTO2.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO2.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO2.setProfitLevel(2);
        detailDTO2.setProfitRateValue("0.2;0.15");

        ProfitModelDetailDTO detailDTO3 = new ProfitModelDetailDTO();
        detailDTO3.setLevelValue(3);
        detailDTO3.setLevelName("小蜜蜂");
        detailDTO3.setUpgradeValue(5);
        detailDTO3.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO3.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO3.setProfitLevel(1);
        detailDTO3.setProfitRateValue("0.3");


        ProfitModelDetailDTO detailDTO4 = new ProfitModelDetailDTO();
        detailDTO4.setLevelValue(4);
        detailDTO4.setLevelName("小蜜蜂");
        detailDTO4.setUpgradeValue(5);
        detailDTO4.setBussinessProductType(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        detailDTO4.setProfitToolType(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        detailDTO4.setProfitLevel(1);
        detailDTO4.setProfitRateValue("0.4");

        detailDTOS.add(detailDTO2);
        detailDTOS.add(detailDTO3);
        detailDTOS.add(detailDTO);
        detailDTOS.add(detailDTO4);

        modelReqDTO.setDetails(detailDTOS);
        MTResponse<String> proLevelTemplate = promoterLevelTemplateFacade.createProLevelTemplate(modelReqDTO);
        System.out.println(ToStringBuilder.reflectionToString(proLevelTemplate));
    }


}
