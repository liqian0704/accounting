package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.daemon.VipDaemonFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 *  补发成为VIP信息给商户系统
 */
public class MA32_VipDaemonFacade_notifyVipMerchant {
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
            //第一个是小时
            //第二个是条数
            //第三个是商户编号
            vipDaemonFacade.notifyVipMerchant(Integer.valueOf(2),Integer.valueOf(1),"11050941433947");

            System.out.println("000");

//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }









        };


