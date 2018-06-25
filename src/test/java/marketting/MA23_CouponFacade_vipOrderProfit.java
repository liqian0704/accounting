package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.facade.CouponFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA23_CouponFacade_vipOrderProfit {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test()
    public void vipOrderProfit() {
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

            couponFacade.vipOrderProfit();

            System.out.println("000");

//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }









        };


