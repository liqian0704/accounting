package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.merchant.QueryInviteRequestDTO;
import com.miitang.facade.merchant.dto.merchant.QueryInviteResponseDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * 申请推广员
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU22_queryInviteInfo{


        String envFlag=CommPro.env;
        String envuri=CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryInviteInfo(String parentMerchantNo,String merchantNo,String headId,int length,String verify){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        MerchantFacade merchantFacade;
        QueryInviteRequestDTO queryInviteRequestDTO = new QueryInviteRequestDTO();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            merchantFacade= (MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,CommPro.getEnvURI(envFlag)+"/mt-merchant-hessian/hessian/MerchantFacade");
            queryInviteRequestDTO.setParentMerchantNo(parentMerchantNo);
            queryInviteRequestDTO.setCreateTime(headId);//第一次查询可以为空
            queryInviteRequestDTO.setLength(length);
            queryInviteRequestDTO.setMerchantNo(merchantNo);
            QueryInviteResponseDTO responseDTO= merchantFacade.queryInviteInfo(queryInviteRequestDTO);
            System.out.println(verify+JSONUtils.toJsonString(responseDTO));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    @DataProvider(name="dp")
    public Object [][] dp(){
        return  new Object[][] {

                {"1042781335","11050942781705",null,53,"时间为空"},//
                {"1042781335","11050942781705",null,30,"默认20条"},//
                {"1042781335","11050942781705","2018-03-13 10:41:09",30,"填写时间"},
                {"1042781335","11050942781705","2018-01-01 14:19:12",30,"验证查询结果为{}"},
                {"1042781335","1111","2018-03-08 19:53:30",30,"不存在的商户编号"},
                {"1042781335","11050942781705","2018-03-13 10:41:09",2,"1页显示2条数据"},
                {"","1042781335","2018-03-13 10:41:09",2,"运营商编号为空"},
                {"1042781335","","2018-03-13 10:41:09",2,"商户编号为空"},
                {null,"11050942781705","2018-03-13 10:41:09",2,"运营商编号为null"},
                {"1042781335",null,"2018-03-13 10:41:09",2,"商户编号为null"},




        };
    }
}
