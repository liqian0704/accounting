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
public class MA13_applyShareProfit {
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
//                {"1042781335","11050953278631","TR1001010720180131001428","成功订单,p1,分润层级为1级","01"},
//                {"1042781335","11050953278631","TR1001040020180131001468","成功订单,p1,分润层级为1级","02"},
//                {"1042781335","11050953278631","TR1001040020180131001496","成功订单,p1,分润层级为1级","03"},
//                {"1042781335","11050953278631","TR1001040020180131001506","成功订单,p1,分润层级为1级","04"},
//                {"1042781335","11050953278631","TR1001040020180131001513","成功订单,p1,分润层级为1级","05"},


//                {"1042781335","11050953278631","TR1001010720180131001429","失败订单,不产生分润","06"},
//                {"1042781335","11050953278529","TR1001010720180131001430","失败订单,不产生分润","07"},
//                //{"1042781335","11050941432287","TR1001010720180131001431"},
//                {"1042781335","11050923143713","TR1001010720180131001431","成功订单,p4,分润层级为4","01"},
//                //{"1042781335","11050923143713","TR1001010720180131001437","成功订单,p4,分润层级为4","02"},
//                {"1042781335","11050923143713","TR1001010720180131001434","成功订单,p4,分润层级为4","02"},
//               // {"1042781335","11050923143713","TR1001010720180131001443","成功订单,p4,分润层级为4","05"},
//                {"1042781335","11050923143713","TR1001010720180205001953","成功订单,p4,分润层级为4","03"},
//                {"1042781335","11050923143713","TR1001030720180201001930","成功订单,p4,分润层级为4","04"},
//                {"1042781335","11050923143713","TR1001030720180201001931","成功订单,p4,分润层级为4","05"},
//                {"1042781335","11050923143713","TR1001040020180131001422","成功订单,p4,分润层级为4","06"},
//                {"1042781335","11050923143713","TR1001040020180131001451","成功订单,p4,分润层级为4","07"},
//                {"1042781335","11050923143713","TR1001040020180131001454","成功订单,p4,分润层级为4","08"},
//                {"1042781335","11050923143713","TR1001040020180131001457","成功订单,p4,分润层级为4","09"},
//                {"1042781335","11050923143713","TR1001040020180131001463","成功订单,p4,分润层级为4","10"},
//                {"1042781335","11050923143713","TR1001040020180131001467","成功订单,p4,分润层级为4","11"},
//                {"1042781335","11050923143713","TR1001040020180131001497","成功订单,p4,分润层级为4","12"},
//                {"1042781335","11050923143713","TR1001040020180131001498","成功订单,p4,分润层级为4","13"},
//                {"1042781335","11050923143713","TR1001040020180131001503","成功订单,p4,分润层级为4","14"},



//                {"1042781335","11050988131975","TR1001010720180131001437","成功订单,p4,分润层级为1","01"},
//                {"1042781335","11050988131975","TR1001010720180330002272","成功订单,p4,分润层级为1","02"},
//                {"1042781335","11050988131975","TR1001010720180330002274","成功订单,p4,分润层级为1","03"},
//                {"1042781335","11050988131975","TR1001060420180314002220","成功订单,p4,分润层级为1","04"},
//                {"1042781335","11050988131975","TR1001060420180314002238","成功订单,p4,分润层级为1","05"},
//                {"1042781335","11050988131975","TR1001060420180314002240","成功订单,p4,分润层级为1","06"},
//                {"1042781335","11050988131975","TR1001060420180314002249","成功订单,p4,分润层级为1","07"},
//                {"1042781335","11050988131975","TR1001060420180314002250","成功订单,p4,分润层级为1","08"},
//
//                {"1042781335","11050953278529","TR1001010720180131001440","成功订单,p4,分润层级为1","09"},

                {"1042781335","11050923143713","TR1001010620180416002352","成功订单,p4,分润层级为4","14"},


        };
    }
}
