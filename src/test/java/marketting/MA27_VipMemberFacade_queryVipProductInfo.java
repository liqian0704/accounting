package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerBaseRequestDTO;
import com.miitang.facade.marketing.dto.vip.QueryVipProductResDTO;
import com.miitang.facade.marketing.facade.VipMemberFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 * VIP运营商会员产品配置接口
 */
public class MA27_VipMemberFacade_queryVipProductInfo {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryVipMemberInfo(String parentMerchantNo,String merchantNo,String message) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        VipMemberFacade vipMemberFacade;
        ParentMerBaseRequestDTO parentMerBaseRequestDTO=new ParentMerBaseRequestDTO();




        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            vipMemberFacade = (VipMemberFacade) hessianProxyFactory.create(VipMemberFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/VipMemberFacade");

            parentMerBaseRequestDTO.setParentMerchantNo(parentMerchantNo);
            parentMerBaseRequestDTO.setMerchantNo(merchantNo);
            QueryVipProductResDTO queryVipProductResDTO= vipMemberFacade.queryVipProductInfo(parentMerBaseRequestDTO);

            System.out.println(message+JSONUtils.toJsonString(queryVipProductResDTO));

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
                {"1042781335","110509414339471","已开通会员"},
//                {"1042781335","110509414339472","会员已过期"},
//
//                {"1042781335","11050941433947","优惠券已使用0个"},
//                {"1042781335","11050937814305","优惠券已使用2个"},
//                {"1042781335","11050953279391","优惠券已使用3个"},
//
//                {"1042781335","11050924327260","商户未开通VIP"},
//                {"10427813356","11050924327260","商户和运营商均未开通vip"},
//                {null,"110509414339471","运营商编号为空"},
//                {"1042781335",null,"商户编号为空"},
//                {"234","","运营商编号不存在"},








        };
    }









        };


