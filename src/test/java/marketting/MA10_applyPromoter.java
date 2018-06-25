package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.AllianceBaseResponse;
import com.miitang.facade.marketing.dto.alliancePromoter.ApplyPromoterReqDTO;
import com.miitang.facade.marketing.facade.AlliancePromoterFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * 申请成为推广人
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA10_applyPromoter {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void applyPromoter(String parentMerchantNo,String inviteCode,String parentPromoterNo,String promoterNo,String promoterName) {
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
            ApplyPromoterReqDTO request= new ApplyPromoterReqDTO();
            request.setParentMerchantNo(parentMerchantNo);
            request.setInviteCode(inviteCode);
            request.setParentPromoterNo(parentPromoterNo);
            request.setPromoterNo(promoterNo);
            request.setPromoterName(promoterName);
            AllianceBaseResponse response = alliancePromoterFacade.applyPromoter(request);
            System.out.println(JSONUtils.toJsonString(response));
            String code = response.getCode();
//            if(code.equals("MT00000")){
//                responseCode="发送成功";
//            }else if (code.equals("MER20057")){
//                responseCode="短信发送失败";
//            }
//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @DataProvider(name = "dp")
    public Object[][] dp() {
        //parentMerchantNo inviteCode parentPromoterNo promoterNo  promoterName
        return new Object[][]{
                {"1042781335","111111","1042781335","11070943378151","滴滴滴"},
                {"1042781335","123123","123123","11050953278639","拉拉01"}

        };

    }
    @Test(dataProvider = "dpe")
    public void applyPromoterException(String parentMerchantNo,String inviteCode,String parentPromoterNo,String promoterNo,String promoterName,String verify) {
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
            ApplyPromoterReqDTO request= new ApplyPromoterReqDTO();
            request.setParentMerchantNo(parentMerchantNo);
            request.setInviteCode(inviteCode);
            request.setParentPromoterNo(parentPromoterNo);
            request.setPromoterNo(promoterNo);
            request.setPromoterName(promoterName);
            AllianceBaseResponse response = alliancePromoterFacade.applyPromoter(request);
            System.out.println(verify+JSONUtils.toJsonString(response));
            String code = response.getCode();
//            if(code.equals("MT00000")){
//                responseCode="发送成功";
//            }else if (code.equals("MER20057")){
//                responseCode="短信发送失败";
//            }
//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @DataProvider(name = "dpe")
    public Object[][] dpe() {
        //parentMerchantNo inviteCode parentPromoterNo promoterNo  promoterName
        return new Object[][]{
                //{"1042781335","123123","1042781335","11050942781843","滴滴滴","正常申请"},
//                {"","111111","1042781335","11070943378151","滴滴滴","运营商编号为空"},
//                {"1042781335","","1042781335","11070943378151","滴滴滴","邀请码为空"},
//                {"1042781335","111111","","11070943378151","滴滴滴","上级推广人编号"},
//                {"1042781335","111111","1042781335","","滴滴滴","推广人编号为空"},
//                {"","111111","1042781335","11070943378151","","推广人姓名为空"},
                {"1042781335","11111509","11050942781843","11050991314221","滴滴滴","正常申请"},



        };
}}
