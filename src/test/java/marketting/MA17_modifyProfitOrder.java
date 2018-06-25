package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.MTResponse;
import com.miitang.facade.marketing.dto.order.ModifyPaymentReqDTO;
import com.miitang.facade.marketing.enumtype.PaymentStatusEnum;
import com.miitang.facade.marketing.facade.ProfitOrderFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA17_modifyProfitOrder {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void modifyProfitOrder(String parentMerchantNo,String billBatchNo,String promoterNo,PaymentStatusEnum paymentStatusEnum,String verify) {
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
            ModifyPaymentReqDTO reqDTO = new ModifyPaymentReqDTO();
            reqDTO.setParentMerchantNo(parentMerchantNo);
            reqDTO.setBillBatchNo(billBatchNo);
            reqDTO.setPromoterNo(promoterNo);
            reqDTO.setPaymentStatus(PaymentStatusEnum.PAYMENT_SUCCESS);
            MTResponse mtResponse=profitOrderFacade.modifyProfitOrder(reqDTO);
            System.out.println(verify+JSONUtils.toJsonString(mtResponse));
            String code = mtResponse.getCode();
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
                {"1042781335","C1804090300","11050991314821",PaymentStatusEnum.PAYMENT_ING,"修改分润"},
              //  {"1042781335","11050953278631",PaymentStatusEnum.PAYMENT_ING,"修改分润"},
                {null,"C1804090300","11050991314821",PaymentStatusEnum.PAYMENT_ING,"运营商为空"},
                {"1042781335",null,"11050991314821",PaymentStatusEnum.PAYMENT_ING,"批次号为空"},
                {"1042781335","C1804090300","",PaymentStatusEnum.PAYMENT_ING,"推广人为空"},
                {"1042781335","C1804090300","11050991314821",PaymentStatusEnum.PAYMENT_FAIL,"改为失败"},
                {"1042781335","C1804090300","11050991314821",PaymentStatusEnum.PAYMENT_SUCCESS,"改为成功"},




        };
    }
}
