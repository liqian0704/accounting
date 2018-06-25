package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.vip.VipOrderReqDTO;
import com.miitang.facade.marketing.dto.vip.VipOrderResDTO;
import com.miitang.facade.marketing.facade.VipMemberFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 * VIP运营商会员产品配置接口
 */
public class MA28_VipMemberFacade_createVipOrder {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryVipMemberInfo(String parentMerchantNo, String merchantNo,  Long couponId, Integer number
                                   ,String payCardId,long productId,String setttleCardId,String terminalMsg,String message) {

        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        VipMemberFacade vipMemberFacade;
        VipOrderReqDTO vipOrderReqDTO = new VipOrderReqDTO();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            vipMemberFacade = (VipMemberFacade) hessianProxyFactory.create(VipMemberFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/VipMemberFacade");

            vipOrderReqDTO.setParentMerchantNo(parentMerchantNo);
            vipOrderReqDTO.setMerchantNo(merchantNo);
            vipOrderReqDTO.setCouponId(couponId);
            vipOrderReqDTO.setNumber(number);

            vipOrderReqDTO.setPayCardId(payCardId);
            vipOrderReqDTO.setProductId(productId);
            vipOrderReqDTO.setSettleCardId(setttleCardId);
            vipOrderReqDTO.setTerminalMsg(terminalMsg);



            VipOrderResDTO vipOrderResDTO = vipMemberFacade.createVipOrder(vipOrderReqDTO);

            System.out.println(message + JSONUtils.toJsonString(vipOrderResDTO));

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
                {"1042781335","11050941433947", Long.valueOf("260"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","此号已废"},
              //  {"1042781335","11050953279589", Long.valueOf("244"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","正常下单"},
                //{"1042781335","11050941433197", Long.valueOf("216"),Integer.valueOf("1"),"BDID79351043014732", Long.valueOf("199"),"BDID79351043014731","msg","正常下单"},
               // {"1042781335","11050991315611", Long.valueOf("216"),Integer.valueOf("1"),"BDID79351043014740", Long.valueOf("199"),"BDID79351043014741","msg","正常下单"},
                //{"1042781335","110509414339471", Long.getLong("844"),null,"BDID79351043014704", Long.valueOf("198"),"BDID79351043014705","msg","产品id不存在"},








        };
    }
    @DataProvider(name ="dpe")
    public Object[][] dpE() {
        return new Object[][]{
                {null,"11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","运营商编号为空"},
                {"1042781335",null, Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","商户编号为空"},
                {"1042781335","11050941433947", null,Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","优惠券id为空下单成功"},
                {"1042781335","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),null, Long.valueOf("199"),"BDID79351043014704","msg","支付卡id为空"},
                {"1042781335","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", null,"BDID79351043014704","msg","产品id为空"},
                {"1042781335","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),null,"msg","结算卡id为空"},
                {"1042781335","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014705","msg","绑卡id相同"},
                {"1042781335","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID793510430147", Long.valueOf("199"),"BDID79351043014704","msg","支付卡id不存在"},
                {"1042781335","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014","msg","结算卡id不存在"},
                {"1042781335","11050991315571", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","未领取优惠券,使用优惠券"},
                {"10427813356","11050941433947", Long.valueOf("89"),Integer.valueOf("1"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","运营商未开通vip产品"},









        };
    }









        };


