package account_verifyNew;

import accounting_verify.CommPro;
import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.accounting.facade.InitDataFacade;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Account09_updateTotalBillNo {
   static String envFlag=CommPro.env;
   static String envuri=CommPro.getEnvURI(envFlag);
   static InitDataFacade initDataFacade;
   static {
       HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();


       try {
           initDataFacade= (InitDataFacade) hessianProxyFactory.create(InitDataFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/InitDataFacade");
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
    public void updateParentMerchantPeriodRule(){
    System.out.println(envuri);
    boolean result=initDataFacade.updateTotalBillNo("C1805220301",false);
    System.out.println(result);
}

}
