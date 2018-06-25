package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.vip.OperatorVipProduct;
import com.miitang.facade.marketing.dto.vip.OperatorVipRight;
import com.miitang.facade.marketing.dto.vip.VipProductConfigDTO;
import com.miitang.facade.marketing.facade.VipMemberFacade;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 * Created by yp-tc-2646 on 18/3/23.
 * VIP运营商会员产品配置接口
 */
public class MA26_VipMemberConfigFacade_createVipMemberconfiguration {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test()
    public void createVipMemberconfiguration() {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        VipMemberFacade vipMemberFacade;
        VipProductConfigDTO vipProductConfigDTO=new VipProductConfigDTO();




        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            vipMemberFacade = (VipMemberFacade) hessianProxyFactory.create(VipMemberFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/VipMemberFacade");

            vipProductConfigDTO.setParentMerchantNo("123456");
            vipProductConfigDTO.setMemberLevel("2");
            vipProductConfigDTO.setMemberName("lala");
            ArrayList<OperatorVipProduct> list1=new ArrayList<OperatorVipProduct>();
            OperatorVipProduct operatorVipProduct1=new OperatorVipProduct();
            operatorVipProduct1.setParentMerchantNo("123456");
            operatorVipProduct1.setProductName("3_month");
            operatorVipProduct1.setProductAmount(BigDecimal.valueOf(30));
            operatorVipProduct1.setProductPattern("NINETY_DAY");
            OperatorVipProduct operatorVipProduct2=new OperatorVipProduct();
            operatorVipProduct2.setParentMerchantNo("123456");
            operatorVipProduct2.setProductName("2_month");
            operatorVipProduct2.setProductAmount(BigDecimal.valueOf(20));
            operatorVipProduct2.setProductPattern("SIXTY_DAY");
            OperatorVipProduct operatorVipProduct3=new OperatorVipProduct();
            operatorVipProduct3.setParentMerchantNo("123456");
            operatorVipProduct3.setProductName("1_month");
            operatorVipProduct3.setProductAmount(BigDecimal.valueOf(10));
            operatorVipProduct3.setProductPattern("THIRTY_DAY");
            list1.add(operatorVipProduct1);
            list1.add(operatorVipProduct2);
            list1.add(operatorVipProduct3);
            vipProductConfigDTO.setOperatorVipProducts(list1);

            ArrayList<OperatorVipRight> list2=new ArrayList<OperatorVipRight>();
            OperatorVipRight operatorVipRight1=new OperatorVipRight();
            operatorVipRight1.setParentMerchantNo("123456");
            operatorVipRight1.setFeeAmount(BigDecimal.valueOf(2));
            operatorVipRight1.setFeeRate(BigDecimal.valueOf(0));
            operatorVipRight1.setFeeType("FIXED_AMOUNT");
            operatorVipRight1.setProductCode("QUICK_CASH");
            OperatorVipRight operatorVipRight2=new OperatorVipRight();
            operatorVipRight2.setParentMerchantNo("123456");
            operatorVipRight2.setFeeAmount(BigDecimal.valueOf(0));
            operatorVipRight2.setFeeRate(BigDecimal.valueOf(0.0004));
            operatorVipRight2.setFeeType("FIXED_RATE");
            operatorVipRight2.setProductCode("PAY_STANDARD");
            list2.add(operatorVipRight1);
            list2.add(operatorVipRight2);
            vipProductConfigDTO.setOperatorVipRights(list2);

            vipProductConfigDTO.setRightsInterestsType("ddd");
            vipMemberFacade.createVipMemberconfiguration(vipProductConfigDTO);

            System.out.println("000");

//            Assert.assertTrue(responseCode.equals(respect));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }









        };


