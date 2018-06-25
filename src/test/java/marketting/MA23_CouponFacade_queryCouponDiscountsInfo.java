package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.coupon.ParentCouponResponsetDTO;
import com.miitang.facade.marketing.facade.CouponFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 * 获取运营商优惠券的相关优惠信息
 */
public class MA23_CouponFacade_queryCouponDiscountsInfo {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryCouponDiscountsInfo(String parentMerchantNo,String expect) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        CouponFacade couponFacade;




        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            couponFacade = (CouponFacade) hessianProxyFactory.create(CouponFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/CouponFacade");

            ParentCouponResponsetDTO parentCounponResponsetDTO= couponFacade.queryCouponDiscountsInfo(parentMerchantNo);

            System.out.println(JSONUtils.toJsonString(parentCounponResponsetDTO));

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
                {"1042781335","获取运营商优惠券的配置信息"},
                {"104278133599","运营商未开通"},
                {null,"运营商编号为空"},
                {"234","运营商编号为空"},








        };
    }
}
