package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.shareProfit.ApplyShareProfitReqDTO;
import com.miitang.facade.marketing.dto.shareProfit.ApplyShareProfitResDTO;
import com.miitang.facade.marketing.facade.OrderFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA13_applyShareProfitNew {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void applyShareProfit(String parentMerchantNo,String merchantNo,String uniqueOrderNo,String verify,String xuhao) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        OrderFacade orderFacade;


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            orderFacade = (OrderFacade) hessianProxyFactory.create(OrderFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/OrderFacade");
            ApplyShareProfitReqDTO request= new ApplyShareProfitReqDTO();
            request.setParentMerchantNo(parentMerchantNo);
            request.setUniqueOrderNo(uniqueOrderNo);
            request.setMerchantNo(merchantNo);
            ApplyShareProfitResDTO response = orderFacade.applyShareProfit(request);
            System.out.println(xuhao+verify+JSONUtils.toJsonString(response));
            String code = response.getCode();
//            if(code.equals("MT00000")){
//                responseCode="发送成功";
//            }else if (code.equals("MER20057")){
//                responseCode="短信发送失败";
//
//            }
//
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
//                {"1042781335","11050942781843","TR1001060420180131001538","成功订单,p1,分润层级为4级","0"},
//                {"1042781335","11050941432257","TR1001030720180322002270","成功订单,p1,分润层级为4级","2"},


//                {"1042781335","11050942781235","TR1001070320180416002318","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002319","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002320","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002321","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002322","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002324","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002332","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002343","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050942781235","TR1001070320180416002345","成功订单,p1,分润层级为4级","2"},
//
//
//                {"1042781335","11050953278909","TR1001030020180416002327","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002328","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002329","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002330","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002331","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002333","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002334","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002335","PROCESSING,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002336","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002339","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002340","成功订单,p1,分润层级为4级","2"},
//                {"1042781335","11050953278909","TR1001030020180416002344","成功订单,p1,分润层级为4级","2"},//
//                {"1042781335","11050953278909","TR1001010720180131001428","上级为运营商,不分","2"},
//                {"1042781335","11050953278909","TR1001040020180131001468","上级为运营商,p1,不分","2"},
//                {"1042781335","11050953278909","TR1001040020180131001496","上级为运营商,p1,不分","2"},
//                {"1042781335","11050953278909","TR1001010720180131001434","商户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001010720180131001443","商户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001010720180131001430","推广人开户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001010720180227002008","订单未成功","2"},
//                {"1042781335","11050953278909","TR1001010720180315002256","推广人开户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001030320180516002405","推广人开户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001030320180516002406","推广人开户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001030320180516002407","推广人开户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001030320180516002408","推广人开户信息不存在","2"},
//                {"1042781335","11050953278909","TR1001030320180516002410","推广人开户信息不存在","2"},
                {"1042781335","11070932881263","TR1001070820180611001948","推广人开户信息不存在","2"},
                {"1042781335","11070932881263","TR1001070820180611001948","推广人开户信息不存在","2"},
                {"1042781335","11070932881263","TR1001070820180611001948","推广人开户信息不存在","2"},
                {"1042781335","11070932881263","TR1001070820180611001948","推广人开户信息不存在","2"},





        };
    }
}
