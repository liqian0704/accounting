package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.daemon.OrderDaemonFacade;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA21_modifyExpireOrder {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void modifyExpireOrder(Integer withinHours,Integer minutesAgo,String parentMerchantNo) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        OrderDaemonFacade orderDaemonFacade;


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            orderDaemonFacade = (OrderDaemonFacade) hessianProxyFactory.create(OrderDaemonFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/OrderDaemonFacade");

             orderDaemonFacade.modifyExpireOrder(withinHours,minutesAgo,50, null, null,parentMerchantNo);
            System.out.println("patchOrder执行完成");

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
                //{1,null,null},
                //{1,30,null},
               // {1,30,"10427813356"},
               {8,30,"1042781335"},
                //{null,null,null}




        };
    }
}
