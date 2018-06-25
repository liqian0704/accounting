package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.facade.MerchantFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/1/17.
 */
public class CUsupplyMerchant {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    String envFlag=CommPro.env;
    String envuri=CommPro.getEnvURI(envFlag);
    @Test
    public void supplyMerchant(){
        try {
            MerchantFacade merchantFacade=(MerchantFacade)hessianProxyFactory.create(MerchantFacade.class,envuri+"/mt-merchant-hessian/hessian/MerchantFacade");
           // BaseResDTO responseSupplyMerchant=merchantFacade.supplyMerchant("11070943378101");
            //System.out.println(JSONUtils.toJsonString(responseSupplyMerchant));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
