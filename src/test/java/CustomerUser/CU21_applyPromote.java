package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.BaseResDTO;
import com.miitang.facade.merchant.dto.merchant.ApplyPromoteRequestDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU21_applyPromote {


        String envFlag=CommPro.env;
        String envuri=CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void applyPromote(String merchantNo,String verify){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        MerchantFacade merchantFacade;
        ApplyPromoteRequestDTO applyPromoteRequestDTO = new ApplyPromoteRequestDTO();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            merchantFacade= (MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,CommPro.getEnvURI(envFlag)+"/mt-merchant-hessian/hessian/MerchantFacade");
            applyPromoteRequestDTO.setMerchantNo(merchantNo);
            applyPromoteRequestDTO.setParentMerchantNo("1042781335");
            BaseResDTO baseResponse= merchantFacade.applyPromote(applyPromoteRequestDTO);
            System.out.println(verify+JSONUtils.toJsonString(baseResponse));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    @DataProvider(name="dp")
    public Object [][] dp(){
        return  new Object[][] {

//              {"","商户编号为空"},
//              {null,"商户编号为null"},
//               {"1042781335","正常的商户编号"},
//              {"11050988","不存在的商户编号"},
//               {"11050953278169","正常的商户编号"},
//               {"11050953278631","A"},
//                {"11050953278529","A"},
//               // {"11050941432287","B"},
//
//               // {"11050923143713","a"},
//                {"11050988131975","d"}
                {"11111111","d"},
              //  {"11050942781843","d"}
                {"11050942781853","d"}
        };
    }
}
