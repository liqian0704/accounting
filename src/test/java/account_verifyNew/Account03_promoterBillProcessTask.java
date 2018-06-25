package account_verifyNew;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.accounting.daemon.PromoterBillDaemonFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Account03_promoterBillProcessTask {
   static String envFlag=CommPro.env;
   static String envuri=CommPro.getEnvURI(envFlag);
   static PromoterBillDaemonFacade promoterBillDaemonFacade;
   static {
       HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();


       try {
           promoterBillDaemonFacade= (PromoterBillDaemonFacade) hessianProxyFactory.create(PromoterBillDaemonFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/PromoterBillDaemonFacade");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } finally {
       }
   }
    /**
     * Created by yp-tc-2646 on 18/3/5.
     * 生成推广人账单
     */

@Test()
    public void promoterBillProcess(){
    System.out.println(envuri);
    promoterBillDaemonFacade.promoterBillProcess(null,null,100,null,null,null,null);

    System.out.println("promoterBillProcess执行完成");
}


}
