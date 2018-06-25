package marketting;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.marketing.dto.shareProfit.QueryProfitReqDTO;
import com.miitang.facade.marketing.dto.shareProfit.QueryProfitResDTO;
import com.miitang.facade.marketing.facade.ProfitFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 18/3/23.
 */
public class MA14_queryUnSettleProfitDetail {
    String envFlag = CommPro.env;
    String envuri = CommPro.getEnvURI(envFlag);


    @Test(dataProvider = "dp")
    public void queryUnSettleProfitDetail(String parentMerchantNo,String merchantNo,String verify) {
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        ProfitFacade profitFacade;


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }///mt-merchant-hessian/hessian/AppUserFacade

        try {
            System.out.println(envuri);
            //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
            profitFacade = (ProfitFacade) hessianProxyFactory.create(ProfitFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/ProfitFacade");
            QueryProfitReqDTO reqDTO = new QueryProfitReqDTO();
            reqDTO.setParentMerchantNo(parentMerchantNo);
            reqDTO.setMerchantNo(merchantNo);
            reqDTO.setStartDate("2018-04-01");
           reqDTO.setEndDate("2018-06-02");
         //  reqDTO.setLast(Long.parseLong("1000001259"));
            reqDTO.setLength(1);
            QueryProfitResDTO queryProfitResDTO=profitFacade.queryUnSettleProfitDetail(reqDTO);
            System.out.println(verify+JSONUtils.toJsonString(queryProfitResDTO));
            String code = queryProfitResDTO.getCode();
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
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
               // {"1042781335","11050953278631","查询未结算金额"},
                //{"1111","1111","测试数据"},
                {"1042781335","11050991314821","查询未结算金额"},





        };}

        @Test(dataProvider = "dpE")
        public void queryUnSettleProfitDetailEX(String parentMerchantNo,String merchantNo,String verify) {
            HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
            ProfitFacade profitFacade;


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }///mt-merchant-hessian/hessian/AppUserFacade

            try {
                System.out.println(envuri);
                //appUserFacade= (AppUserFacade) hessianProxyFactory.create(AppUserFacade.class,CommPro.innerMerchantURI+"/mt-merchant-hessian/hessian/AppUserFacade");
                profitFacade = (ProfitFacade) hessianProxyFactory.create(ProfitFacade.class, CommPro.getEnvURI(envFlag) + "/mt-marketing-hessian/hessian/ProfitFacade");
                QueryProfitReqDTO reqDTO = new QueryProfitReqDTO();
                reqDTO.setParentMerchantNo(parentMerchantNo);
                reqDTO.setMerchantNo(merchantNo);
                QueryProfitResDTO queryProfitResDTO=profitFacade.queryUnSettleProfitDetail(reqDTO);
                System.out.println(verify+JSONUtils.toJsonString(queryProfitResDTO));
                String code = queryProfitResDTO.getCode();
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
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }


        }

        @DataProvider(name = "dpE")
        public Object[][] dpE() {
            return new Object[][]{

                    {"", "11050953278631", "运营商为空"},
                    {null, "11050953278631", "运营商为null"},
                    {"1042781335", "", "商户为空"},
                    {"1042781335",null, "商户为null"},



            };


        }}