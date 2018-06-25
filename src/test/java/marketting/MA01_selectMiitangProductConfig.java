package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.miitang.MiitangProductConfigRespDTO;
import com.miitang.facade.marketing.facade.MiitangConfigFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**查询蜜蜂联盟产品配置
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA01_selectMiitangProductConfig {
    String envFlag=CommPro.env;
    String envuri=CommPro.getEnvURI(envFlag);


    @Test()
    public void selectMiitangProductConfig(){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        MiitangConfigFacade miitangConfigFacade;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            miitangConfigFacade= (MiitangConfigFacade) hessianProxyFactory.create(MiitangConfigFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangConfigFacade");
            MTResponse<MiitangProductConfigRespDTO> respDTOMTResponse = miitangConfigFacade.selectMiitangProductConfig();
            System.out.println(JSONUtils.toJsonString(respDTOMTResponse));
            String code=respDTOMTResponse.getCode();
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
    //接口改动,已废弃
    @Test(dataProvider = "dp")
    public void selectMiitangProductConfigException(String miitangProductConfig ){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        MiitangConfigFacade miitangConfigFacade;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            miitangConfigFacade= (MiitangConfigFacade) hessianProxyFactory.create(MiitangConfigFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangConfigFacade");
            MTResponse<MiitangProductConfigRespDTO> respDTOMTResponse = miitangConfigFacade.selectMiitangProductConfig();
            System.out.println(JSONUtils.toJsonString(respDTOMTResponse));
            String code=respDTOMTResponse.getCode();
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
    @DataProvider(name="dp")
    public Object [][] dp(){
        return  new Object[][] {
                {null},
                {"333"},
                {""}

        };
    }
}
