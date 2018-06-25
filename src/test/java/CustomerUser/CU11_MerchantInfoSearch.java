package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.merchant.QueryMerchantInfoRequestDTO;
import com.miitang.facade.merchant.dto.merchant.QueryMerchantInfoResponseDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU11_MerchantInfoSearch {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    MerchantFacade merchantFacade;
    QueryMerchantInfoRequestDTO queryMerchantInfoRequestDTO;
    @Test
    public void merchantInfoSearch(){
        try {
            queryMerchantInfoRequestDTO = new QueryMerchantInfoRequestDTO();
            merchantFacade=(MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,"http://10.151.32.27:30241/mt-merchant-hessian/hessian/MerchantFacade");
            queryMerchantInfoRequestDTO.setMerchantNo("11050953278271");
            queryMerchantInfoRequestDTO.setParentMerchantNo("1042781335");
            QueryMerchantInfoResponseDTO queryMerchantInfoResponseDTO=merchantFacade.getMerchantInfo(queryMerchantInfoRequestDTO);
            System.out.println(JSONUtils.toJsonString(queryMerchantInfoResponseDTO));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
