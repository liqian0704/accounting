package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.user.VerifySmsRequestDTO;
import com.miitang.facade.merchant.dto.user.VerifySmsResponseDTO;
import com.miitang.facade.merchant.enums.user.LoginType;
import com.miitang.facade.merchant.enums.user.RequestSource;
import com.miitang.facade.merchant.facade.AppUserFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU01_MessageConfirm {
    String envFlag=CommPro.env;
    String envuri=CommPro.getEnvURI(envFlag);
@Test(dataProvider = "dp")
    public void MessageConfirm(String parentMerchantNo,RequestSource requestSource,String loginName,String inviteCode,String smsCode,LoginType loginType,String respect,String response) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        AppUserFacade appUserFacade;
        try {
           // appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.getEnvURI(envFlag)+"/mt-merchant-hessian/hessian/AppUserFacade");
            VerifySmsRequestDTO verifySmsRequestDTO = new VerifySmsRequestDTO();
            verifySmsRequestDTO.setParentMerchantNo(parentMerchantNo);
            verifySmsRequestDTO.setRequestSource(requestSource);
            verifySmsRequestDTO.setLoginName(loginName);
            verifySmsRequestDTO.setInviteCode(inviteCode);
            verifySmsRequestDTO.setSmsCode(smsCode);
            verifySmsRequestDTO.setLoginType(loginType);
            VerifySmsResponseDTO verifySmsResponseDTO=appUserFacade.verifyLoginSms(verifySmsRequestDTO);
            System.out.println(JSONUtils.toJsonString(verifySmsResponseDTO));
            String code=verifySmsResponseDTO.getCode();
            if(code.equals("MER20066")){

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @DataProvider(name="dp")
    public Object [][]dp(){
        return new Object[][]{
                //{"父商户编号","请求来源","登陆名","邀请码","验证码","登陆类型","预期结果","实际结果"}
            //请求来源为app正常流程验证
               // {"1042781335",RequestSource.APP,"13000000009","11111","731560",LoginType.PHONE,"",""},
               // 验证码为空
               // {"1042781335",RequestSource.APP,"13000000002","11111","",LoginType.PHONE,"",""},
              //  {"1042781335",RequestSource.APP,"13000000002","11111","NULL",LoginType.PHONE,"",""},
                //验证码格式错误
               // {"1042781335",RequestSource.APP,"13000000002","11111","KKKKKDJHEHH098",LoginType.PHONE,"",""},

//                //异常流程 验证码已过有效期
//                {"123321",RequestSource.APP,"13000000000","450743","",LoginType.PHONE},
//                //异常流程 手机号未注册
  //              {"123321",RequestSource.APP,"13000000005","123321","",LoginType.PHONE,"",""},
//                //异常流程 请求来源为空
//                {"123321",RequestSource.APP,"13000000005","123321","",LoginType.PHONE},
//                //异常流程 邀请码为空
//                {"123321",RequestSource.APP,"13000000000","123321","",LoginType.PHONE},
//                //异常流程 邀请码不存在
//                {"123321",RequestSource.APP,"13000000000","123321","",LoginType.PHONE},
//                //异常流程 登陆类型为空
               //{"1042781335",RequestSource.APP,"13000000000","11111","123321",null,"",""},//
               // {"1042781335",RequestSource.APP,"13000000010","11111","209356",LoginType.PHONE,"",""},
               // {"1042781335",RequestSource.APP,"13000000013","11111","017218",LoginType.PHONE,"",""},
               // {"1042781335",RequestSource.APP,"13100000000","11111","615903",LoginType.PHONE,"",""},
               // {"1013243273",RequestSource.APP,"1300000000","231432730709","695641",LoginType.PHONE,"",""},
               // {"1013243273",RequestSource.APP,"13100000000","231432730709","576083",LoginType.PHONE,"",""},
                //{"1042781335",RequestSource.APP,"13000000019","378134850509","183162",LoginType.PHONE,"",""},
                {"1042781335",RequestSource.APP,"13000000021","378134850509","338417",LoginType.PHONE,"",""},

        };
    }
}
