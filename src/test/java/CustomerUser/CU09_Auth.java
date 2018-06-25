package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.customer.dto.auth.AuthRequestDTO;
import com.miitang.facade.customer.dto.auth.AuthResponseDTO;
import com.miitang.facade.customer.enumtype.IDTypeEnum;
import com.miitang.facade.customer.facade.AuthFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU09_Auth {

    private HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    private AuthFacade authFacade;
    private AuthRequestDTO request= new AuthRequestDTO();

    @Test
    public void authIdCard(){//"http://10.151.32.27:30240/
        try {
            hessianProxyFactory = new HessianProxyFactory();
            authFacade=(AuthFacade) hessianProxyFactory.create(AuthFacade.class,CommPro.innerCustomerURI+"/mt-customer-hessian/hessian/AuthFacade");
            request.setBizRequestNo("001");
            request.setBizSystemNo("001");
            request.setName("姚培飞");
            request.setIdNo("320582198604135110");
            request.setIdType(IDTypeEnum.ID_CARD);
            AuthResponseDTO responseDTOId= authFacade.authIdCard(request);
            System.out.println(JSONUtils.toJsonString(responseDTOId));
            Assert.assertTrue(responseDTOId.getAuthStatus().equals("SUCCESS"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void authBankCard(){
         hessianProxyFactory=new HessianProxyFactory();
        try {
            authFacade=(AuthFacade)hessianProxyFactory.create(AuthFacade.class,"http://10.151.32.27:30240/mt-customer-hessian/hessian/AuthFacade");
            request.setBizRequestNo("002");
            request.setBizSystemNo("002");
            request.setName("李倩");
            request.setIdNo("220183198807041860");
            request.setIdType(IDTypeEnum.ID_CARD);
            request.setBankCardNo("6226620202862331");
            request.setBankCode("CEB");
            AuthResponseDTO responseDTOBank=authFacade.authBankCard(request);
            System.out.println(JSONUtils.toJsonString(responseDTOBank));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void authPhone(){
        try {
            authFacade=(AuthFacade)hessianProxyFactory.create(AuthFacade.class,CommPro.innerCustomerURI+"/mt-customer-hessian/hessian/AuthFacade");
            request.setBizRequestNo("002");
            request.setBizSystemNo("002");
            request.setName("纪柏涛");
            request.setIdNo("370921198706011539");
            request.setIdType(IDTypeEnum.ID_CARD);
            request.setPhoneNumber("18511620062");
            AuthResponseDTO responseDTOPhone=authFacade.authPhoneNumber(request);
            System.out.println(JSONUtils.toJsonString(responseDTOPhone));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
        }
    }
    //@Test
//    public void authCompany(){
//        try {
//            authFacade=(AuthFacade)hessianProxyFactory.create(AuthFacade.class,"http://10.151.32.27:30240/mt-customer-hessian/hessian/AuthFacade");
//            request.setBizRequestNo("002");
//            request.setBizSystemNo("002");
//             request.setIdType(IDTypeEnum.ID_CARD);
//            request.setName("姚培飞");
//            request.setIdNo("320582198604135110");
//            //request.setCompanyName("青海韩都忆餐饮管理有限公司");
//            //request.setRegNo("630104063037404");
//            //request.setRegNo("");
//           // AuthResponseDTO responseDTOcompany=authFacade.authCompany(request);
//            System.out.println(JSONUtils.toJsonString(responseDTOcompany));
//            Assert.assertTrue(responseDTOcompany.getAuthStatus().equals("FAILURE"));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
}
