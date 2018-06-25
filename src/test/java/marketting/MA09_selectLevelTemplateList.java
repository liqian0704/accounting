//package marketting;
//
//import com.caucho.hessian.client.HessianProxyFactory;
//import com.miitang.facade.marketing.MTResponse;
//import com.miitang.facade.marketing.dto.parentMerchant.LevelTemplateRespDTO;
//import com.miitang.facade.marketing.facade.PromoterLevelTemplateFacade;
//import com.yeepay.g3.utils.common.json.JSONUtils;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//
///**
// * Created by yp-tc-2646 on 18/3/23.
// */
//public class MA09_selectLevelTemplateList {
//    String envFlag = CommPro.env;
//    String envuri = CommPro.getEnvURI(envFlag);
//    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
//    PromoterLevelTemplateFacade promoterLevelTemplateFacade = (PromoterLevelTemplateFacade) hessianProxyFactory.create(PromoterLevelTemplateFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/PromoterLevelTemplateFacade");
//
//    public MA09_selectLevelTemplateList() throws MalformedURLException {
//    }
//
//    @Test()
//    public void selectLevelTemplateList() {
//
//
//        MTResponse<LevelTemplateRespDTO> levelTemplateRespDTOMTResponse = promoterLevelTemplateFacade.selectLevelTemplateList("1042781335");
//        System.out.println(JSONUtils.toJsonString(levelTemplateRespDTOMTResponse));
//    }
//}
