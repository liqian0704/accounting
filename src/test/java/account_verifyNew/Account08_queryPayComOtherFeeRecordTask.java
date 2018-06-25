package account_verifyNew;

import accounting_verify.CommPro;
import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.accounting.daemon.PayComOtherFeeDaemonFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Account08_queryPayComOtherFeeRecordTask {
   static String envFlag=CommPro.env;
   static String envuri=CommPro.getEnvURI(envFlag);
   static PayComOtherFeeDaemonFacade facade;
   static {
       HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();


       try {
           facade= (PayComOtherFeeDaemonFacade) hessianProxyFactory.create(PayComOtherFeeDaemonFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/PayComOtherFeeDaemonFacade");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } finally {
       }
   }
    /**
     * Created by yp-tc-2646 on 18/3/5.
     * 增加支付公司计费模版
     */

@Test()
    public void queryPayComOtherFeeRecord(){
    System.out.println(envuri);
    facade.queryPayComOtherFeeRecord(null,null,100,null,null,null,null);
    System.out.println("totalBillToPayRecordTask执行完成");
}

}
