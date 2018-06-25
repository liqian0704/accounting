//package marketting;
//
//
//import com.caucho.hessian.client.HessianProxyFactory;
//import com.google.common.collect.Lists;
//import com.miitang.facade.marketing.MTResponse;
//import com.miitang.facade.marketing.dto.miitang.MiitangProductConfigReqDTO;
//import com.miitang.facade.marketing.enumtype.*;
//import com.miitang.facade.marketing.facade.MiitangConfigFacade;
//import com.yeepay.g3.utils.common.json.JSONUtils;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//
///**新建蜜蜂联盟产品配置
// * Created by yp-tc-2646 on 17/12/18.
// */
//public class MA00_createMiitangProductConfig {
//        String path1 = MA00_createMiitangProductConfig.class.getClassLoader().getResource("").toURI().getPath();
//
//        String envFlag=CommPro.env;
//        String envuri=CommPro.getEnvURI(envFlag);
//        InputStream allianceProtocolTempate=null;
//        InputStream promoterProtocolTemplate=null;
//        InputStream [] postTemplate=null;
//        InputStream [] productTemplate=null;
//
//    public MA00_createMiitangProductConfig() throws URISyntaxException {
//    }
////    String path = MA00_createMiitangProductConfig.class.getClassLoader().getResource("image/pic.jpeg").getPath();
//
//    @Test(dataProvider = "dp")
//    public void createMiitangProductConfig(String productName,InputStream allianceProtocolTempate,InputStream promoterProtocolTemplate,InputStream [] postTemplate,
//                                           InputStream [] productTemplate,Integer maxLevel,Integer maxProfitNum) throws URISyntaxException {
////        InputStream is=null;
////        InputStream [] isList=null;
//        //String path1 = MA00_createMiitangProductConfig.class.getClassLoader().getResource("").toURI().getPath();
//        System.err.println("111    " +path1);
////        String path = MA00_createMiitangProductConfig.class.getClassLoader().getResource("image/pic.jpeg").getPath();
//        String path = "/Users/yp-tc-2646/Workspaces/mine/src/test/resources/image/pic.jpeg";
//        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
//        hessianProxyFactory.setOverloadEnabled(true);
//        MiitangConfigFacade miitangConfigFacade;
//        System.out.println(path);
//        MiitangProductConfigReqDTO reqDTO = new MiitangProductConfigReqDTO();
//      //  String path = MA00_createMiitangProductConfig.class.getClassLoader().getResource("image/pic.jpeg").getPath();
//        File file = new File(path);
//        //File[] files = {file};
//        try {
//            allianceProtocolTempate=new FileInputStream(file);
//            promoterProtocolTemplate=new FileInputStream(file);
//            postTemplate=new InputStream[]{allianceProtocolTempate};
//            productTemplate=new InputStream[]{allianceProtocolTempate};
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }///mt-merchant-hessian/hessian/AppUserFacade
//
//        try {
//            System.out.println(envuri);
//            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");//mt-marketing-facade
//            miitangConfigFacade= (MiitangConfigFacade) hessianProxyFactory.create(MiitangConfigFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangConfigFacade");
//            reqDTO.setProductName("蜜蜂联盟11");
//            reqDTO.setAllianceProtocolTempate(allianceProtocolTempate);
//            reqDTO.setPromoterProtocolTemplate(promoterProtocolTemplate);
//            reqDTO.setPostTemplate(postTemplate);
//            reqDTO.setProductTemplate(productTemplate);
//            reqDTO.setBusinessProduct(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
//            reqDTO.setMaxLevel(maxLevel);
//            reqDTO.setMaxProfitNum(maxProfitNum);
//            reqDTO.setUpgradeConditon(Lists.newArrayList(UpgradeConditonEnum.AUTH_MERCHANT_NUM));
//            reqDTO.setProfitTool(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
//            reqDTO.setProfitPeriod(Lists.newArrayList(PlayMoneyPeriodEnum.MONTH, PlayMoneyPeriodEnum.MONTH));
//            reqDTO.setProfitCondition(Lists.newArrayList(ProfitConditionEnum.AUTO_CONFIRM));
//            reqDTO.setTaxTool(Lists.newArrayList(TaxToolEnum.INCOME_TAX));
//            MTResponse<String> response = miitangConfigFacade.createMiitangProductConfig(reqDTO);
//            System.out.println(JSONUtils.toJsonString(response));
//            String code=response.getCode();
////            if(code.equals("MT00000")){
////                responseCode="发送成功";
////            }else if (code.equals("MER20057")){
////                responseCode="短信发送失败";
////
////            }
//
//           // Assert.assertTrue(responseCode.equals(respect));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    @DataProvider(name="dp")
//    public Object [][] dp(){
//        return  new Object[][] {
//                //String ProductName,File [] AllianceProtocolTempate,File [] PromoterProtocolTemplate,File [] PostTemplate,File [] ProductTemplate,Integer maxLevel,Integer MaxProfitNum
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,0,6},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,5,0},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,5,6},
//
//        };
//    }
//    @Test(dataProvider = "dpE")
//    public void createMiitangProductConfigException(String productName,InputStream allianceProtocolTempate,InputStream promoterProtocolTemplate,InputStream [] postTemplate,
//    InputStream [] productTemplate,Integer maxLevel,Integer maxProfitNum ) throws URISyntaxException {
//
//        String path1 = MA00_createMiitangProductConfig.class.getClassLoader().getResource("").toURI().getPath();
//        System.err.println("111    " +path1);
//        String path = MA00_createMiitangProductConfig.class.getClassLoader().getResource("image/pic.jpeg").getPath();
//
//        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
//        MiitangConfigFacade miitangConfigFacade;
////        InputStream is=null;
////        InputStream [] isList=null;
//        System.out.println(path);
//        MiitangProductConfigReqDTO reqDTO = new MiitangProductConfigReqDTO();
//        //  String path = MA00_createMiitangProductConfig.class.getClassLoader().getResource("image/pic.jpeg").getPath();
//        File file = new File(path);
//        try {
//            allianceProtocolTempate=new FileInputStream(file);
//            promoterProtocolTemplate=new FileInputStream(file);
//            postTemplate=new InputStream[]{allianceProtocolTempate};
//            productTemplate=new InputStream[]{allianceProtocolTempate};
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//        }
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }///mt-merchant-hessian/hessian/AppUserFacade
//
//        try {
//            System.out.println(envuri);
//            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");//mt-marketing-facade
//            miitangConfigFacade= (MiitangConfigFacade) hessianProxyFactory.create(MiitangConfigFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangConfigFacade");
//            reqDTO.setProductName("蜜蜂联盟1");
//            reqDTO.setAllianceProtocolTempate(allianceProtocolTempate);
//            reqDTO.setPromoterProtocolTemplate(promoterProtocolTemplate);
//            reqDTO.setPostTemplate(postTemplate);
//            reqDTO.setProductTemplate(productTemplate);
//            reqDTO.setBusinessProduct(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
//            reqDTO.setMaxLevel(maxLevel);
//            reqDTO.setMaxProfitNum(maxProfitNum);
//            reqDTO.setUpgradeConditon(Lists.newArrayList(UpgradeConditonEnum.AUTH_MERCHANT_NUM));
//            reqDTO.setProfitTool(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
//            reqDTO.setProfitPeriod(Lists.newArrayList(PlayMoneyPeriodEnum.MONTH, PlayMoneyPeriodEnum.MONTH));
//            reqDTO.setProfitCondition(Lists.newArrayList(ProfitConditionEnum.AUTO_CONFIRM));
//            reqDTO.setTaxTool(Lists.newArrayList(TaxToolEnum.INCOME_TAX));
//            MTResponse<String> response = miitangConfigFacade.createMiitangProductConfig(reqDTO);
//            System.out.println(JSONUtils.toJsonString(response));
//            String code=response.getCode();
////            if(code.equals("MT00000")){
////                responseCode="发送成功";
////            }else if (code.equals("MER20057")){
////                responseCode="短信发送失败";
////
////            }
//
//            // Assert.assertTrue(responseCode.equals(respect));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    @DataProvider(name="dpE")
//    public Object [][] dpE(){
//        return  new Object[][] {
//            //String ProductName,File [] AllianceProtocolTempate,File [] PromoterProtocolTemplate,File [] PostTemplate,File [] ProductTemplate,Integer maxLevel,Integer MaxProfitNum
//                {null,allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,5,6},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,5,6},
//                {"产品名称01",null,promoterProtocolTemplate,postTemplate,productTemplate,5,6},
//                {"产品名称01",allianceProtocolTempate,null,postTemplate,productTemplate,5,6},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,null,productTemplate,5,6},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,null,5,6},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,0,6},
//                {"产品名称01",allianceProtocolTempate,promoterProtocolTemplate,postTemplate,productTemplate,5,0},
//
//        };
//    }
//}
