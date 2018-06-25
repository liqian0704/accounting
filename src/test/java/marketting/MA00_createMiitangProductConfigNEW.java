package marketting;


import com.caucho.hessian.client.HessianProxyFactory;
import com.google.common.collect.Lists;
import com.miitang.common.upload.UploadFile;
import com.miitang.facade.marketing.Consts;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.miitang.MiitangProductConfigReqDTO;
import com.miitang.facade.marketing.enumtype.*;
import com.miitang.facade.marketing.facade.MiitangConfigFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.net.URISyntaxException;

/**新建蜜蜂联盟产品配置
 * Created by yp-tc-2646 on 17/12/18.
 */
public class MA00_createMiitangProductConfigNEW {
       // String path1 = MA00_createMiitangProductConfig.class.getClassLoader().getResource("").toURI().getPath();

        String envFlag=CommPro.env;
        String envuri=CommPro.getEnvURI(envFlag);
//        InputStream allianceProtocolTempate=null;
//        InputStream promoterProtocolTemplate=null;
//        InputStream [] postTemplate=null;
//        InputStream [] productTemplate=null;
    String path = MA00_createMiitangProductConfigNEW.class.getClassLoader().getResource("image/pic.jpeg").getPath();
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    MiitangConfigFacade miitangConfigFacade;
    ;
    String[] strArr;
    public MA00_createMiitangProductConfigNEW() throws URISyntaxException {
    }
//    String path = MA00_createMiitangProductConfig.class.getClassLoader().getResource("image/pic.jpeg").getPath();

    @Test()
    public void createMiitangProductConfig() throws Exception {

        File file = new File(path);
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

        byte[] bytes = null;
        bytes = new byte[is.available()];
        is.read(bytes);
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(bytes);
        strArr = new String[]{encode,encode,encode,encode,encode};
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        hessianProxyFactory.setOverloadEnabled(true);
        MiitangConfigFacade miitangConfigFacade;
        System.out.println(path);
        MiitangProductConfigReqDTO reqDTO = new MiitangProductConfigReqDTO();
        reqDTO.setProductName("蜜蜂联盟222");
        reqDTO.setAllianceProtocolTempate("蜜蜂联盟协议模版");
        reqDTO.setPromoterProtocolTemplate("这是推广人协议模板");
        reqDTO.setPostTemplate(strArr);
        reqDTO.setProductTemplate("产品说明啊这是");
        reqDTO.setBusinessProduct(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        reqDTO.setMaxLevel(15);
        reqDTO.setMaxProfitNum(6);
        reqDTO.setUpgradeConditon(Lists.newArrayList(UpgradeConditonEnum.AUTH_MERCHANT_NUM));
        reqDTO.setProfitTool(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        reqDTO.setProfitPeriod(Lists.newArrayList(PlayMoneyPeriodEnum.DAY, PlayMoneyPeriodEnum.MONTH));
        reqDTO.setProfitCondition(Lists.newArrayList(ProfitConditionEnum.AUTO_CONFIRM));
        reqDTO.setTaxTool(Lists.newArrayList(TaxToolEnum.INCOME_TAX));
        miitangConfigFacade= (MiitangConfigFacade) hessianProxyFactory.create(MiitangConfigFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangConfigFacade");
        MTResponse<String> miitangProductConfig = miitangConfigFacade.createMiitangProductConfig(reqDTO);
        System.out.println(JSONUtils.toJsonString(miitangProductConfig));

    }

    @Test(dataProvider ="dp")
    public void createMiitangProductConfigException(String productName,String allianceprotocolT,String promoterProtocolTemplate,String [] postTemplate,
    String productTemplate,Integer maxLevel,Integer maxProfitNum) throws Exception {

        File file = new File(path);
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

        byte[] bytes = null;
        bytes = new byte[is.available()];
        is.read(bytes);
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(bytes);
        strArr = new String[]{encode,encode,encode,encode,encode};
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        hessianProxyFactory.setOverloadEnabled(true);
        MiitangConfigFacade miitangConfigFacade;
        System.out.println(path);
        MiitangProductConfigReqDTO reqDTO = new MiitangProductConfigReqDTO();
        reqDTO.setProductName(productName);
        reqDTO.setAllianceProtocolTempate(allianceprotocolT);
        reqDTO.setPromoterProtocolTemplate(promoterProtocolTemplate);
        reqDTO.setPostTemplate(postTemplate);
        reqDTO.setProductTemplate(productTemplate);
        reqDTO.setBusinessProduct(Lists.newArrayList(BussinessTypeEnum.PAY_STANDARD));
        reqDTO.setMaxLevel(maxLevel);
        reqDTO.setMaxProfitNum(maxProfitNum);
        reqDTO.setUpgradeConditon(Lists.newArrayList(UpgradeConditonEnum.AUTH_MERCHANT_NUM));
        reqDTO.setProfitTool(Lists.newArrayList(SaleToolEnum.MULTISTAGE_RATIO));
        reqDTO.setProfitPeriod(Lists.newArrayList(PlayMoneyPeriodEnum.DAY, PlayMoneyPeriodEnum.MONTH));
        reqDTO.setProfitCondition(Lists.newArrayList(ProfitConditionEnum.AUTO_CONFIRM));
        reqDTO.setTaxTool(Lists.newArrayList(TaxToolEnum.INCOME_TAX));
        miitangConfigFacade= (MiitangConfigFacade) hessianProxyFactory.create(MiitangConfigFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangConfigFacade");
        MTResponse<String> miitangProductConfig = miitangConfigFacade.createMiitangProductConfig(reqDTO);
        System.out.println(JSONUtils.toJsonString(miitangProductConfig));

    }
    @DataProvider(name = "dp")
    //
    public Object[][] dp() {
        return new Object[][]{
                {"蜜蜂联盟11","蜜蜂联盟协议模版","这是推广人协议模板",strArr,"产品说明啊这是",15,6},
                {"","蜜蜂联盟协议模版","这是推广人协议模板",strArr,"产品说明啊这是",15,6},
                {"蜜蜂联盟20","","这是推广人协议模板",strArr,"产品说明啊这是",15,6},
                {"蜜蜂联盟20","蜜蜂联盟协议模版","",strArr,"产品说明啊这是",15,6},
                {"蜜蜂联盟20","蜜蜂联盟协议模版","这是推广人协议模板",null,"产品说明啊这是",15,6},
                {"蜜蜂联盟20","蜜蜂联盟协议模版","这是推广人协议模板",strArr,"null",15,6},


        };
    }
    @Test
    public void  showFilePath(){

        //ProductConfig config = configMapper.selectByPrimaryKey("1235");
        //String protocolTemplate = config.getPromoterProtocolTemplate();

        String protocolTemplate = "fe45b7bdf04d4a3792f87b243d80ebd4;";
        InputStream inputStream = null;
        try {
            inputStream = UploadFile.downLoadFile(Consts.MT_BUCKET_NAME, protocolTemplate);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
        }
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println(sb.toString());
    }

}
