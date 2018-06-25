package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.BaseResDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * 获取邀请信息
 * Created by yp-tc-2646 on 18/1/17.
 */
public class CUsupplyPayCompanyOp {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    String envFlag=CommPro.env;
    String envURI=CommPro.getEnvURI(envFlag);
    //"http://10.151.32.27:30241
    @Test
    public void cusupplyPayCompanyOp(){
        try {
            System.out.println(envURI);
            MerchantFacade merchantFacade=(MerchantFacade)hessianProxyFactory.create(MerchantFacade.class,envURI+"/mt-merchant-hessian/hessian/MerchantFacade");
            BaseResDTO responsecusupplyPayCompanyOp =merchantFacade.supplyPayCompanyOp("11070981414351");
            System.out.println(JSONUtils.toJsonString(responsecusupplyPayCompanyOp));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
