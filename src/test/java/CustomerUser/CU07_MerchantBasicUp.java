package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.merchant.BasicInfoRequestDTO;
import com.miitang.facade.merchant.dto.merchant.BasicInfoResponseDTO;
import com.miitang.facade.merchant.enums.merchant.CompanyType;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU07_MerchantBasicUp {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    MerchantFacade merchantFacade;
    BasicInfoRequestDTO basicInfoRequestDTO = new BasicInfoRequestDTO();
    String envFlag=CommPro.env;
    String envURI=CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void merchantBasicUp(String parentMerchantNo, String phoneNumber, String merchantNo, String inviteCode, String bizAddr,
                                String legalName,String idCardNo,String begin,String end,String cityCode,String provinceCode,String addr,String respect,String response) {

        String request = "" + System.currentTimeMillis();
        System.out.println(request);
        System.out.println(envURI);


        try {
            //merchantFacade = (MerchantFacade) hessianProxyFactory.create(MerchantFacade.class, CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/MerchantFacade");
            merchantFacade = (MerchantFacade) hessianProxyFactory.create(MerchantFacade.class, envURI+"/mt-merchant-hessian/hessian/MerchantFacade");
            basicInfoRequestDTO.setParentMerchantNo(parentMerchantNo);
            basicInfoRequestDTO.setPhoneNumber(phoneNumber);
            basicInfoRequestDTO.setRequestNo(request);
            // basicInfoRequestDTO.setParentMerchantNo("");
            basicInfoRequestDTO.setMerchantNo(merchantNo);
            basicInfoRequestDTO.setInviteCode(inviteCode);
            basicInfoRequestDTO.setBizAddr(bizAddr);
            basicInfoRequestDTO.setCompanyType(CompanyType.MICRO.getValue());
            basicInfoRequestDTO.setLegalName(legalName);
            basicInfoRequestDTO.setIdCardNo(idCardNo);
            //basicInfoRequestDTO.setCompanyType("ddd");
//            basicInfoRequestDTO.setBizLicenseStart("2018-03-01");
//            basicInfoRequestDTO.setBizLicenseEnd("2017-02-01");
            basicInfoRequestDTO.setCityCode(cityCode);
            basicInfoRequestDTO.setProvinceCode(provinceCode);
            basicInfoRequestDTO.setProductCode("PAY_STANDARD,QUICK_CASH");
            basicInfoRequestDTO.setDetailAddr(addr);
//            basicInfoRequestDTO.setFrontIDCardPhoto("http://10.151.31.197:8081/ucm/201801/9fb1f5d969eb44f7a5a3e653849a970e.jpeg");
//            basicInfoRequestDTO.setHandIdCardPhoto("http://10.151.31.197:8081/ucm/201801/9fb1f5d969eb44f7a5a3e653849a970e.jpeg");
//            basicInfoRequestDTO.setBackIDCardPhoto("http://10.151.31.197:8081/ucm/201801/9fb1f5d969eb44f7a5a3e653849a970e.jpeg");
            basicInfoRequestDTO.setFrontIDCardPhoto("http://attachment.yeepay.com/yop/201802/3694f47bb03e44f7b6578dace5a913e7.jpeg");
            basicInfoRequestDTO.setHandIdCardPhoto("http://attachment.yeepay.com/yop/201802/b40f20c8e846487c96ce0066e63862db.jpeg");
            basicInfoRequestDTO.setBackIDCardPhoto("http://attachment.yeepay.com/yop/201802/4291350c87024c5687b6ccc3f85e3d42.jpeg");


            BasicInfoResponseDTO basicInfoResponseDTO = merchantFacade.uploadBasicInfo(basicInfoRequestDTO);
            System.out.println(JSONUtils.toJsonString(basicInfoResponseDTO));
            String code=basicInfoResponseDTO.getCode();
           // System.out.println(JSONUtils.toJsonString(basicInfoResponseDTO));
            if(code.equals("MT00000")){

                response="成功";
            }
           // Assert.assertTrue(request.equals(response));

        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
    @DataProvider(name="dp")  //11050953278259
    public Object[][] dp(){
        return  new Object[][]{//11050953278291
            //{父商户编号,手机号,商户编号,邀请码,经营地址,法人姓名,身份证号,开始时间,截止时间,详细地址}
               // {"1042781335","13000000003","11050991314422","11111","经营地址","陆放","420111198705105515","","","110000","110100","详细地址","成功",""},
               //{"1042781335","13000000008","11050991314451","11111","经营地址","周必霞","350420197107070025","","","110100","110000","110108","成功",""},

                //{"1042781335","13000000006","11050937813255","11111","经营地址","周必霞","35042019710707002","","","110000","110100","详细地址","成功",""},
               // {"1042781335","13000000007","11050953278259","11111","经营地址","聚好玩","2105221982070700160","","","110000","110100","详细地址","成功",""},
               // {"1042781335","13100000000","11050953278271","11111","经营地址","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
                //父商编号为空
//                {"","13000000010","11050953278291","11111","经营地址","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
//                //手机号为空
//                {"1042781335","","11050953278291","11111","经营地址","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
//               // 企业类型不存在
//                {"1042781335","13000000010","11050953278291","11111","经营地址","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
//                //法人姓名为空
//                {"1042781335","13000000010","11050953278291","11111","经营地址","","130630198410026323","","","110100","110000","110108","成功",""},
//                //省份编码为空
//                {"1042781335","13000000010","11050953278291","11111","经营地址","冯丽云","130630198410026323","","","110100","","110108","成功",""},
//               // 产品编码为空
//                {"1042781335","13000000010","11050953278291","11111","经营地址","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
//                //身份证正面为空
               // {"1042781335","13000000010","11050953278291","11111","经营地址","冯丽云","","","","110100","110000","110108","成功",""},
               // {"1042781335","13000000010","11050953278291","11111","经营","冯丽云","1306301984100263230","","","110100","110000","110108","成功",""},//
               // {"1042781335","13000000011","11050923143363","11111","经营","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
               // {"1042781335","13000000013","11050942781525","11111","经营","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
                //{"1042781335","13000000013","11050942781523","11111","经营","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},

                //{"","13000000013","11050942781523","11111","经营","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
                //{"1042781335","13000000010","11050957821","11111","经营地址","小二","430321199211027473","","","110100","110000","110108","成功",""},
              //  {"1042781335","13100000000","11050953278609","11111","经营","李倩","220183198807041860","","","110100","110000","110108","成功",""},
                //{"1042781335","13000000015","11050988131655","11111","经营","冯??云","130630198410026323","","","110100","110000","110108","成功",""},
                //{"1042781335","13000000016","110509881","11111","经营点点滴滴的点点滴滴点点滴滴点点滴滴点点滴滴的得到的点点滴经营点点滴滴的点点滴滴点点滴滴点点滴滴点点滴滴的得到的点点滴滴点点滴经营点点滴滴的点点滴滴点点滴滴点点滴经营点点滴滴的点点滴滴点点滴滴点点滴滴点点滴滴的得到的点点滴滴点点滴经营点点滴滴的点点滴滴点点滴滴点经营点点滴滴的点点滴滴点点滴滴点点滴滴点点滴滴的得到的点点滴滴点点滴经营点点滴滴的点点滴滴点点滴滴点点滴滴点点滴滴的得到的点点滴滴点点滴滴点点滴滴点点滴滴点点滴滴的得到的滴点点滴滴点点滴滴点点滴滴的得到的点滴滴点点滴滴的得到的点点滴滴点点滴滴点点滴滴点点滴滴点点滴滴的得到的滴点点滴滴点点滴滴点点滴滴的得到的滴点点滴滴的得到的点点滴滴点点滴滴点点滴滴点点滴滴点点滴滴的得到的滴点点滴滴点点滴滴点点滴滴的得到的滴点点滴经营点点滴滴的点点滴滴点点滴滴点点滴滴点点滴滴的得到的点点滴滴点点滴滴点点滴滴点点滴滴点点滴滴的得到的滴点点滴滴点点滴滴点点滴滴的得到的","冯丽云","130630198410026323","","","110100","110000","110108","成功",""},
               // {"1013243273","15901298830","11070943378139","231432730709","经营","苏和平","411330199104014814","","","","","","成功",""},




                //父商编号为空
//                {"","15901298830","11070943378139","231432730709","经营","苏和平","411330199104014814","","","","","","成功",""},
//                //手机号为空
//                {"1013243273","","11070943378139","231432730709","经营","苏和平","411330199104014814","","","","","","成功",""},
//                //法人姓名为空
//                {"1013243273","15901298830","11070943378139","231432730709","经营","","411330199104014814","","","","","","成功",""},
//                //省份编码为空
//               // {"1013243273","15901298830","11070943378139","231432730709","经营","苏和平","411330199104014814","","","","110000","110108","成功",""},
//                {"1013243273","15901298830","11070943378139","231432730709","经营","苏和平点点滴滴滴滴答答滴滴答答的点点滴滴","411330199104014814","","","","110000","110108","成功",""},

                   //  {"1013243273","13100000000","11070981414351","231432730709","经营","苏和平","411330199104014814","","","","","","成功",""},
                {"1042781335","13000000019","11050942781033","378134850509","经营地址","陆放","420111198705105515","","","110000","110100","详细地址","成功",""},
        };
    }
}
