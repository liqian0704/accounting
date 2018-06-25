package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.merchant.OpInfoRequestDTO;
import com.miitang.facade.merchant.dto.merchant.OpInfoResponseDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/1/17.
 */
public class CUGetOpInfo {
    HessianProxyFactory hessianProxyFactory=new HessianProxyFactory();
    OpInfoRequestDTO opInfoRequestDTO=new OpInfoRequestDTO();
    @Test(dataProvider ="dp")
    public void getOpInfo(String parentMerchantNo,String merchantNo){
        try {
            MerchantFacade merchantFacade=(MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,"http://10.151.32.27:30241/mt-merchant-hessian/hessian/MerchantFacade");
            opInfoRequestDTO.setParentMerchantNo(parentMerchantNo);
            opInfoRequestDTO.setMerchantNo(merchantNo);
            OpInfoResponseDTO opInfoResponseDTO= (OpInfoResponseDTO)merchantFacade.getOpInfo(opInfoRequestDTO);
            System.out.println(JSONUtils.toJsonString(opInfoResponseDTO));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    @DataProvider(name ="dp")
    public Object [][] dp(){
        return  new Object[][]{
            {"1042781335","11050941432177"},

        };
    }
}
