package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerBaseRequestDTO;
import com.miitang.facade.marketing.dto.parentMerchant.ProProtocolQueryResDTO;
import com.miitang.facade.marketing.facade.OperatorProductManageFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA06_queryProProtocol {

    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryPostList(String parentMerchantNo) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        OperatorProductManageFacade operatorProductManageFacade;


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            operatorProductManageFacade = (OperatorProductManageFacade) hessianProxyFactory.create(OperatorProductManageFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/OperatorProductManageFacade");
            ParentMerBaseRequestDTO request= new ParentMerBaseRequestDTO();
            request.setParentMerchantNo(parentMerchantNo);
            request.setMerchantNo("00");
            ProProtocolQueryResDTO response = operatorProductManageFacade.queryProProtocol(request);
            System.out.println(JSONUtils.toJsonString(response));
            String code = response.getCode();
//            if(code.equals("MT00000")){
//                responseCode="发送成功";
//            }else if (code.equals("MER20057")){
//                responseCode="短信发送失败";
//
//            }
//
//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
                {"111111"},
                {null},
                {""},
                {"104278133512"}

        };
    }
}
