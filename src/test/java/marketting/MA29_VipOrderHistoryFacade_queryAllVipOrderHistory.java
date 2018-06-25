package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.vip.QueryMemerHistoryDTO;
import com.miitang.facade.marketing.dto.vip.VipOrderHistoryResDTO;
import com.miitang.facade.marketing.facade.VipOrderHistoryFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 * VIP运营商会员产品配置接口
 */
public class MA29_VipOrderHistoryFacade_queryAllVipOrderHistory {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test()
    public void queryAllVipOrderHistory() {

        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        VipOrderHistoryFacade vipOrderHistoryFacade;
        QueryMemerHistoryDTO queryMemerHistoryDTO = new QueryMemerHistoryDTO();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);

            vipOrderHistoryFacade = (VipOrderHistoryFacade) hessianProxyFactory.create(VipOrderHistoryFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/VipOrderHistoryFacade");

            queryMemerHistoryDTO.setParentMerchantNo("1042781335");
            queryMemerHistoryDTO.setMerchantNo("11050941433947");
            //queryMemerHistoryDTO.setFinishDate(null);
            queryMemerHistoryDTO.setLastId(null);
            queryMemerHistoryDTO.setLength(Integer.valueOf(10));
            queryMemerHistoryDTO.setStatus("SUCCESS");
            queryMemerHistoryDTO.setOrderId(null);
            VipOrderHistoryResDTO vipOrderResDTO=vipOrderHistoryFacade.queryAllVipOrderHistory(queryMemerHistoryDTO);

            System.out.println(JSONUtils.toJsonString(vipOrderResDTO));

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
               {"", null,Integer.valueOf("4"),"BDID79351043014705", Long.valueOf("199"),"BDID79351043014704","msg","正常下单"},









        };
    }
    public Object[][] dpE() {
        return new Object[][]{









        };
    }









        };


