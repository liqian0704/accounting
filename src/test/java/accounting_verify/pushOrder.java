//package accounting_verify;
//
//import com.caucho.hessian.client.HessianProxyFactory;
//import com.miitang.facade.accounting.daemon.TotalBillDaemonFacade;
//import com.miitang.facade.accounting.dto.OrderCreateReqDTO;
//import com.miitang.facade.accounting.dto.PayCompanyFeeFormulaCreateReqDTO;
//import com.miitang.facade.accounting.facade.OrderInfoFacade;
//import com.miitang.facade.accounting.facade.ParentMerchantPeriodRuleFacade;
//import com.yeepay.g3.utils.common.json.JSONUtils;
//
//import java.net.MalformedURLException;
//
///**
// * Created by yp-tc-2646 on 18/3/5.
// */
//public class pushOrder {
//    String envFlag=CommPro.env;
//    String envuri=CommPro.getEnvURI(envFlag);
//
//    public void TotalBill(){
//        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
//        OrderInfoFacade orderInfoFacade;
//        OrderCreateReqDTO reqDTO=new OrderCreateReqDTO();
//        try {
//            System.out.println(envuri);
//            try {
//                orderInfoFacade= (OrderInfoFacade) hessianProxyFactory.create(ParentMerchantPeriodRuleFacade.class,CommPro.getEnvURI(envFlag)+"/mt-accounting-hessian/hessian/OrderCreateReqDTO");
//
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } finally {
//            }
//
//
//            boolean result=OrderInfoFacade.totalBillProcess(null, null, 100, 1, 0, null, null);
//            System.out.println(JSONUtils.toJsonString(respose));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//}}
