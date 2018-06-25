package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.common.dto.BaseResponseDTO;
import com.miitang.facade.marketing.dto.coupon.CouponModelRequestDTO;
import com.miitang.facade.marketing.facade.CouponFacade;
import com.miitang.facade.merchant.enums.merchant.PromotType;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA23_CouponFacade_createMerchantCouponRecord {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void createMerchantCouponRecord(String parentMerchantNo,String  merchantNo,String promoterNo,String promoteType, String saleNo,String expect) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        CouponFacade couponFacade;
        CouponModelRequestDTO couponModelRequestDTO= new CouponModelRequestDTO();



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            couponFacade = (CouponFacade) hessianProxyFactory.create(CouponFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/CouponFacade");
            couponModelRequestDTO.setMerchantNo(merchantNo);
            couponModelRequestDTO.setParentMerchantNo(parentMerchantNo);
            couponModelRequestDTO.setPromoterNo(promoterNo);
            couponModelRequestDTO.setPromoteType(promoteType);
            couponModelRequestDTO.setSaleNo(saleNo);
            BaseResponseDTO baseResponseDTO= couponFacade.createMerchantCouponRecord(couponModelRequestDTO);

            System.out.println(JSONUtils.toJsonString(baseResponseDTO));

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
//                {"1042781335","11050941433947","110509414339478", PromotType.PROMOTER.getValue(),"1234","最高级别,验证下一级别奖励为敬请期待"},
//                {"1042781335","11050941433947","110509414339478", PromotType.SALE_MAN.getValue(),"1234","最高级别,验证下一级别奖励为敬请期待"},
                //{"1042781335","11050941433947","1234", PromotType.SALE_MAN.getValue(),"1234","最高级别,验证下一级别奖励为敬请期待"},
//                {"1042781335","","", PromotType.SALE_MAN.getValue(),"","推广人和业务员的编号为空"},
//                {"","11050941433947","1234", PromotType.SALE_MAN.getValue(),"123","运营商编号为空"},
//                {"1042781335","11050953279391","", PromotType.PROMOTER.getValue(),"555","推广类型为推广人时,推广人编号不能为空"},
//                {"1042781335","11050953279391","1234", PromotType.SALE_MAN.getValue(),"","推广类型为业务员,业务员编号不能为空"},
                //{"1042781335","11050953279391","", PromotType.SALE_MAN.getValue(),"1234","业务类型为业务员正常逻辑"},
                //{"1042781335","11050953279391","11050923143713", PromotType.CON_PROMOTER.getValue(),"","业务类型为推广人正常逻辑"},
                {"1042781335","11050941433947","11050953279389", PromotType.CON_PROMOTER.getValue(),"","业务类型为推广人正常逻辑"},
               // {"1042781335","11050953279391","1234", PromotType.PROMOTER.getValue(),"1234","领取推广人的优惠券"},
                //{"1042781335","11050953279391","1234", PromotType.SALE_MAN.getValue(),"1234","领取推广人的优惠券"},
                //{"1042781335","11050937814305","1234", PromotType.PROMOTER.getValue(),"","商编号为空"},
               // {"1042781335","11050941433947","11050941433947", PromotType.PROMOTER.getValue(),"","最高级别,验证下一级别奖励为敬请期待"},
               // {"1042781335","11050937814305","11050941433947", PromotType.PROMOTER.getValue(),"","最高级别,验证下一级别奖励为敬请期待"},
                //{"1042781335","11050953279391","11050941433947", PromotType.PROMOTER.getValue(),"","最高级别,验证下一级别奖励为敬请期待"},







        };
    }
}
