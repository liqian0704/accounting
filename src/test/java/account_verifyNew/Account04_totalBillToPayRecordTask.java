package account_verifyNew;

import accounting_verify.CommPro;
import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.accounting.daemon.TotalBillDaemonFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Account04_totalBillToPayRecordTask {
   static String envFlag=CommPro.env;
   static String envuri=CommPro.getEnvURI(envFlag);
   static TotalBillDaemonFacade totalBillDaemonFacade;
   static {
       HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();


       try {
           totalBillDaemonFacade= (TotalBillDaemonFacade) hessianProxyFactory.create(TotalBillDaemonFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/TotalBillDaemonFacade");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } finally {
       }
   }
    /**
     * Created by yp-tc-2646 on 18/3/5.
     * 打款
     */

@Test()
    public void totalBillToPayRecordTask(){
    System.out.println(envuri);
    totalBillDaemonFacade.totalBillToPayRecord(null,null,null,null,null,"1042781335",null);

    System.out.println("totalBillToPayRecordTask执行完成");
}

    @Test()
    public void testTotalBillProcessByBillNoRecord(){
        System.out.println(envuri);
        totalBillDaemonFacade.totalBillToPayRecord(null,null,100,null,null,null,null);

        System.out.println("totalBillToPayRecordTask执行完成");
    }

}
