package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.common.dto.BaseResponseDTO;
import com.miitang.facade.marketing.dto.miitang.MiitangProductRecordReqDTO;
import com.miitang.facade.marketing.facade.MiitangRecordFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**运营商开通蜜蜂联盟
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA03_openMiitangProduct {

    String envFlag=CommPro.env;
    String envuri=CommPro.getEnvURI(envFlag);


    @Test()
    public void openMiitangProduct(){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        MiitangRecordFacade recordFacade;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            recordFacade= (MiitangRecordFacade) hessianProxyFactory.create(MiitangRecordFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangRecordFacade");
            MiitangProductRecordReqDTO recordReqDTO = new MiitangProductRecordReqDTO();
            recordReqDTO.setProductNo("1040");
            //recordReqDTO.setProductNo("");
           // recordReqDTO.setParentMerchantNo(null);
            recordReqDTO.setParentMerchantNo("1042781243");
            BaseResponseDTO baseResponseDTO = recordFacade.openMiitangProduct(recordReqDTO);
            System.out.println(JSONUtils.toJsonString(baseResponseDTO));
            String code=baseResponseDTO.getCode();
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
    public void openMiitangProductException(String productNo,String parentMerchantNo){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        MiitangRecordFacade recordFacade;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            recordFacade= (MiitangRecordFacade) hessianProxyFactory.create(MiitangRecordFacade.class,CommPro.getEnvURI(envFlag)+"/mt-marketing-hessian/hessian/MiitangRecordFacade");
            MiitangProductRecordReqDTO recordReqDTO = new MiitangProductRecordReqDTO();
            recordReqDTO.setProductNo(productNo);
            recordReqDTO.setParentMerchantNo(parentMerchantNo);
            BaseResponseDTO baseResponseDTO = recordFacade.openMiitangProduct(recordReqDTO);
            System.out.println(JSONUtils.toJsonString(baseResponseDTO));
            String code=baseResponseDTO.getCode();
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

                {"1040",null},
                {"1040",""},
                {"1040","104278133"},
                {"","104278133"},
                {null,"104278133"},



        };
    }
}
