package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.fee.QueryFeeInfoRequestDTO;
import com.miitang.facade.merchant.dto.fee.QueryFeeInfoResponseDTO;
import com.miitang.facade.merchant.facade.FeeInfoFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU20_FeeSearch {
    HessianProxyFactory hessianProxyFactory=new HessianProxyFactory();
    FeeInfoFacade feeInfoFacade;
    QueryFeeInfoRequestDTO queryFeeInfoRequestDTO=new QueryFeeInfoRequestDTO();
    @Test(dataProvider = "dp")
    public void FeeSearch(String parentMerchantNo, String merchantNo, String feeBizCode, String feeProduct){
        try {
            feeInfoFacade=(FeeInfoFacade)hessianProxyFactory.create(FeeInfoFacade.class,"http://10.151.32.27:30241/mt-merchant-hessian/hessian/FeeInfoFacade");
            queryFeeInfoRequestDTO.setParentMerchantNo(parentMerchantNo);
            queryFeeInfoRequestDTO.setMerchantNo(merchantNo);
            queryFeeInfoRequestDTO.setFeeBizCode(feeBizCode);
            queryFeeInfoRequestDTO.setFeeProduct(feeProduct);
            QueryFeeInfoResponseDTO queryFeeInfoResponseDTO=feeInfoFacade.queryFee(queryFeeInfoRequestDTO);
           System.out.println(JSONUtils.toJsonString(queryFeeInfoResponseDTO));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    @DataProvider(name="dp")
    public Object [][] dp(){
        return new Object[][]{
                {"1042781335","11050937813255","ZR","PAY_STANDARD"},
                {"","11050937813255","ZR","PAY_STANDARD"},
                {"1042781335","","ZR","PAY_STANDARD"},
                {"1042781335","11050937813255","","PAY_STANDARD"},
                {"1042781335","11050937813255","ZR",""},

        };
    }
}
