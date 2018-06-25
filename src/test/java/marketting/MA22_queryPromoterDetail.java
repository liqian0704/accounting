package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.alliancePromoter.PromoterDetailResDTO;
import com.miitang.facade.marketing.dto.parentMerchant.ParentMerBaseRequestDTO;
import com.miitang.facade.marketing.facade.AlliancePromoterFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA22_queryPromoterDetail {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryPromoterDetail(String parentMerchantNo,String  merchantNo,String expect) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        AlliancePromoterFacade alliancePromoterFacade;
        ParentMerBaseRequestDTO parentMerBaseRequestDTO= new ParentMerBaseRequestDTO();



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            alliancePromoterFacade = (AlliancePromoterFacade) hessianProxyFactory.create(AlliancePromoterFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/AlliancePromoterFacade");
            parentMerBaseRequestDTO.setMerchantNo(merchantNo);
            parentMerBaseRequestDTO.setParentMerchantNo(parentMerchantNo);
            PromoterDetailResDTO promoterDetailResDTO= alliancePromoterFacade.queryPromoterDetail(parentMerBaseRequestDTO);

            System.out.println(JSONUtils.toJsonString(promoterDetailResDTO));

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
                {"1042781335","11050991314821","最高级别,验证下一级别奖励为敬请期待"},
                {"1042781255","11020488131385","不是推广人,验证默认为当前运营商等级配置"},
                {"1042781255","11020491314211","当前等级为1级,最高级别为3级"},
                {"10427812","11020488131","运营商配置等级信息不存在"},






        };
    }
}
