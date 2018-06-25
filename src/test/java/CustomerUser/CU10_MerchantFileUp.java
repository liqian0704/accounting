package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.facade.MerchantFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU10_MerchantFileUp {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    MerchantFacade merchantFacade;
    @Test
    public void merchantFileUp(){
        try {
            merchantFacade=(MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,"http://10.151.32.27:30241/mt-merchant-hessian/hessian/MerchantFacade");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
