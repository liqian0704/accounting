package account_verifyNew;

import accounting_verify.CommPro;
import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.accounting.daemon.PayCompanyBillDaemonFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Account04_payCompanyBillProcessTask {
   static String envFlag=CommPro.env;
   static String envuri=CommPro.getEnvURI(envFlag);
   static PayCompanyBillDaemonFacade promoterBillDaemonFacade;
   static {
       HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();


       try {
           promoterBillDaemonFacade= (PayCompanyBillDaemonFacade) hessianProxyFactory.create(PayCompanyBillDaemonFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/PayCompanyBillDaemonFacade");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } finally {
       }
   }
    /**
     * Created by yp-tc-2646 on 18/3/5.
     * 生成支付公司账单
     */

@Test()
    public void promoterBillProcessTask(){
    System.out.println(envuri);
    promoterBillDaemonFacade.payCompanyBillProcess(null,null,100,null,null,null,null);

    System.out.println("promoterBillProcess执行完成");
}


}
