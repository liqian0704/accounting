package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.facade.AppUserFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU03_RegStatusSearch {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    AppUserFacade appUserFacade;
    @Test
    public void regStatusSearch(){
        try {
            appUserFacade=(AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,"http://10.151.32.27:30241/mt-merchant-hessian/hessian/AppUserFacade");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
