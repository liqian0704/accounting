package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.BaseResDTO;
import com.miitang.facade.merchant.dto.user.SendSmsRequestDTO;
import com.miitang.facade.merchant.enums.user.RequestSource;
import com.miitang.facade.merchant.facade.AppUserFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU00_SendMessage {


        String envFlag=CommPro.env;
        String envuri=CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void sendMessage(String phoneNumber,String merchantNo,Enum requestSource,String verionId,String respect,String responseCode){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        AppUserFacade appUserFacade;
        SendSmsRequestDTO sendSmsRequestDTO = new SendSmsRequestDTO();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.getEnvURI(envFlag)+"/mt-merchant-hessian/hessian/AppUserFacade");
            sendSmsRequestDTO.setLoginName(phoneNumber);
            sendSmsRequestDTO.setRequestSource(RequestSource.APP);
            sendSmsRequestDTO.setVersionId(verionId);
            sendSmsRequestDTO.setParentMerchantNo(merchantNo);
            BaseResDTO baseResponse= appUserFacade.sendLoginSms(sendSmsRequestDTO);
            System.out.println(JSONUtils.toJsonString(baseResponse));
            String code=baseResponse.getCode();
            if(code.equals("MT00000")){
                responseCode="发送成功";
            }else if (code.equals("MER20057")){
                responseCode="短信发送失败";

            }

            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    @DataProvider(name="dp")
    public Object [][] dp(){
        return  new Object[][] {
            //正常流程 注册来源为app和网页
               // {"13000000008","1042781335",RequestSource.APP,"v0.1","发送成功",""},
//                {"13000000000","10040011560",RequestSource.H5,"v0.1","发送成功",""},
//                //异常流程 手机号为空
               // {"13000000000","1013243273",RequestSource.H5,"v0.1","发送成功",""},
//                //异常流程 父商户编号为空
               // {"13000000000","",RequestSource.H5,"v0.1","短信发送失败",""},
//                //异常流程,父商户编号不存在
//                {"13000000000","123",RequestSource.H5,"v0.1","短信发送失败",""},
               // {"13000000010","1042781335",RequestSource.APP,"v0.1","发送成功",""},
              //  {"13000000011","1042781335",RequestSource.APP,"v0.1","发送成功",""},
               // {"13000000012","1042781335",RequestSource.APP,"v0.1","发送成功",""},
               // {"13000000013","1042781335",RequestSource.APP,"v0.1","发送成功",""},
                //{"13000000014","1042781335",RequestSource.APP,"v0.1","发送成功",""},
               // {"13000000015","1042781335",RequestSource.APP,"v0.1","发送成功",""},
                //{"13100000000","1013243273",RequestSource.APP,"v0.1","发送成功",""},
                //{"15901298830","1013243273",RequestSource.APP,"v0.1","发送成功",""},
                //{"13000000019","1042781335",RequestSource.APP,"v0.1","发送成功",""},
                {"13000000021","1042781335",RequestSource.APP,"v0.1","发送成功",""},


        };
    }
}
