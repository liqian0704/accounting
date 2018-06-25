package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.order.PromoterProfitFeeReqDTO;
import com.miitang.facade.marketing.dto.order.PromoterProfitFeeRespDTO;
import com.miitang.facade.marketing.facade.ProfitOrderFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

/**按批次号查询推广人汇总明细(给账单用的)
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA18_selectPromoterProfitFee {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void selectPromoterProfitFee(String parentMerchantNo,String billBatchNo,String beginTime,String endTime,String verify) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        ProfitOrderFacade profitOrderFacade;



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            profitOrderFacade = (ProfitOrderFacade) hessianProxyFactory.create(ProfitOrderFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/ProfitOrderFacade");
            PromoterProfitFeeReqDTO reqDTO = new PromoterProfitFeeReqDTO();
            reqDTO.setParentMerchantNo(parentMerchantNo);
            reqDTO.setBillBatchNo(billBatchNo);
            reqDTO.setBeginTime(beginTime);
            reqDTO.setEndTime(endTime);
            MTResponse<List<PromoterProfitFeeRespDTO>> response = profitOrderFacade.selectPromoterProfitFee(reqDTO);
            System.out.println(JSONUtils.toJsonString(response));
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
                {"1042781335","C1804090301","2018-01-04 :00:00:00","2018-04-04 :00:00:00","按批次号查询"},



        };
    }
}
