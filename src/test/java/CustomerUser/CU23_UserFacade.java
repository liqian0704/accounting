package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.user.dto.UserDTO;
import com.miitang.facade.user.facade.UserFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * 获取邀请信息
 * Created by yp-tc-2646 on 18/1/17.
 */
public class CU23_UserFacade {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    String envFlag=CommPro.env;
    String envURI=CommPro.getEnvURI(envFlag);
    UserFacade userFacade;
    UserDTO userDTO = new UserDTO();
    //"http://10.151.32.27:30241
    @Test(dataProvider = "dp")
    public void registOcrUser(String userName,String loginName,String mobile,String email,String merchantNo){
        try {
            System.out.println(envURI);
            userFacade=(UserFacade)hessianProxyFactory.create(UserFacade.class,envURI+"/mt-user-hessian/hessian/UserFacade");
            //运营商编号
            userDTO.setUserName(userName);//用户名
            userDTO.setLoginName(loginName);//登录名
            userDTO.setMobile(mobile);//手机号
            userDTO.setEmail(email);//邮箱
            userDTO.setMerchantNo(merchantNo);
           // log.info("注册ocr账户入参{}:",userDTO);
            UserDTO userDTOres=userFacade.registOcrUser(userDTO);
            System.out.println(JSONUtils.toJsonString(userDTOres));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @DataProvider(name = "dp")
    public Object [][]dp(){
        return new Object[][]{
                {"李倩老板","qian.li-113","13100000007","qian.li-3@miitang.com","100000000011"},
        };
    }
}
