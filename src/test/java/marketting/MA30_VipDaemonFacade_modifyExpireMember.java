package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.daemon.VipDaemonFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 * 修改过期会员
 */
public class MA30_VipDaemonFacade_modifyExpireMember {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test()
    public void vipOrderProfit() {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        VipDaemonFacade vipDaemonFacade;




        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            vipDaemonFacade = (VipDaemonFacade) hessianProxyFactory.create(VipDaemonFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/VipDaemonFacade");

            vipDaemonFacade.modifyExpireMember(Integer.valueOf(100));

            System.out.println("000");

//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }









        };


