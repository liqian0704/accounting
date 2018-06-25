package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.AllianceBaseResponse;
import com.miitang.facade.marketing.dto.alliancePromoter.UpgradePromoterReqDTO;
import com.miitang.facade.marketing.enumtype.UpgradeConditonEnum;
import com.miitang.facade.marketing.facade.AlliancePromoterFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA11_upgradePromoter {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryPostList(String parentMerchantNo,String merchantNo,String verify) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        AlliancePromoterFacade alliancePromoterFacade;


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            alliancePromoterFacade = (AlliancePromoterFacade) hessianProxyFactory.create(AlliancePromoterFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/AlliancePromoterFacade");
            UpgradePromoterReqDTO request= new UpgradePromoterReqDTO();
            request.setParentMerchantNo(parentMerchantNo);
            request.setMerchantNo(merchantNo);
            //request.setUpgrade(UpgradeConditonEnum.INVITE_MERCHANT_NUM);//邀请商户数量(不按照此规则)
            request.setUpgrade(UpgradeConditonEnum.AUTH_MERCHANT_NUM);//认证商户数量
            AllianceBaseResponse response = alliancePromoterFacade.upgradePromoter(request);
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
        }


    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
//                {"1042781335","1042781335","正常升级"},
//                {null,"1042781335","运营商编号为空"},
//                {"1042781335",null,"商户编号为空"},
                {"1042781335","11050923143913","正常升级"},
                {"1042781335","11050923143913","正常升级"},
                {"1042781335","11050923143913","正常升级"},
               {"1042781335","11050923143913","正常升级"},
                {"1042781335","11050923143913","正常升级"},


        };
    }
}
