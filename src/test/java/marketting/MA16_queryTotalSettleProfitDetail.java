

package marketting;
import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerBaseRequestDTO;
import com.miitang.facade.marketing.dto.shareProfit.QueryTotalProfitResDTO;
import com.miitang.facade.marketing.facade.ProfitFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**查询分润按月汇总
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA16_queryTotalSettleProfitDetail {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryTotalSettleProfitDetail(String parentMerchantNo,String merchantNo,String verify) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        ProfitFacade profitFacade;


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            profitFacade = (ProfitFacade) hessianProxyFactory.create(ProfitFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/ProfitFacade");
            ParentMerBaseRequestDTO reqDTO = new ParentMerBaseRequestDTO();
            reqDTO.setParentMerchantNo(parentMerchantNo);
            reqDTO.setMerchantNo(merchantNo);
            QueryTotalProfitResDTO response = profitFacade.queryTotalSettleProfitDetail(reqDTO);
            System.out.println(verify+JSONUtils.toJsonString(response));
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
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
                //{"1042781335","11050953278631","查询详情"},
                {"1042781335","11050991314821","查询详情"},



        };
    }
}
