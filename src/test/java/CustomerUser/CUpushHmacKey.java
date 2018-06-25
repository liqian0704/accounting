package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.BaseResDTO;
import com.miitang.facade.merchant.dto.merchant.QueryHmacKeyRequestDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/1/17.
 */
public class CUpushHmacKey {
    HessianProxyFactory hessianProxyFactory=new HessianProxyFactory();
    QueryHmacKeyRequestDTO queryHmacKeyRequestDTO=new QueryHmacKeyRequestDTO();
    String envFlag=CommPro.env;
    String envuri=CommPro.getEnvURI(envFlag);
    @Test(dataProvider ="dp")
    public void pushHmacKey(String merchantNo,String outMerchantNo,String outParentMerchantNo,String parentMerchantNo){
        try {
            MerchantFacade merchantFacade=(MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,envuri+"/mt-merchant-hessian/hessian/MerchantFacade");
            queryHmacKeyRequestDTO.setMerchantName("李倩");
            queryHmacKeyRequestDTO.setMerchantNo(merchantNo);
            queryHmacKeyRequestDTO.setOutMerchantNo(outMerchantNo);
            queryHmacKeyRequestDTO.setOutParenMerchantNo(outParentMerchantNo);
            queryHmacKeyRequestDTO.setParentMerchantNo(parentMerchantNo);
            BaseResDTO repson= merchantFacade.pushHmacKey(queryHmacKeyRequestDTO);
            System.out.println(JSONUtils.toJsonString(repson));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    @DataProvider(name ="dp")
    public Object [][] dp(){
        return  new Object[][]{
            //{"11050941432177","10040052165","10040040565","1042781335"},
                //{"11050988131825","10040052162","10040040565","1042781335"},
               // {"11050988131605","10040052123","10040040565","1042781335"}
                {"11070927913185","10019005208","10015688925","1013243273"}
        };
    }
}
