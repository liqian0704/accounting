package CustomerUser;

import com.caucho.hessian.client.HessianProxyFactory;
import com.miitang.facade.merchant.dto.merchant.SettleBankRequestDTO;
import com.miitang.facade.merchant.dto.merchant.SettleBankResponseDTO;
import com.miitang.facade.merchant.facade.MerchantFacade;
import com.yeepay.g3.utils.common.json.JSONUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by yp-tc-2646 on 17/12/18.
 */
public class CU08_MerchantSettle {
    HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
    MerchantFacade merchantFacade;
    SettleBankRequestDTO settleBankRequestDTO = new SettleBankRequestDTO();
    String envFlag=CommPro.env;
    String envURI=CommPro.getEnvURI(envFlag);
    @Test(dataProvider="dp")
    public void merchantSettle(String merchantNo,String accountName,String settleIdCard,String settleBankName,String settleBankCode,String bankCityName,
                               String bankCityCode,String bankProvinceName,String bankProvinceCode,String settleBankAccountNo,String request,String response){
        try {
            merchantFacade=(MerchantFacade) hessianProxyFactory.create(MerchantFacade.class,envURI+"/mt-merchant-hessian/hessian/MerchantFacade");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String requestflow= ""+System.currentTimeMillis();
        settleBankRequestDTO.setMerchantNo(merchantNo);
        settleBankRequestDTO.setAccountName(accountName);
      //  settleBankRequestDTO.setBankCardImg("http://10.151.31.197:8081/ucm/201801/9fb1f5d969eb44f7a5a3e653849a970e.jpeg");
        settleBankRequestDTO.setBankCardImg(" http://attachment.yeepay.com/yop/201802/2f6b68d5c1bd42009f36290425508be7.jpeg");
        settleBankRequestDTO.setIdCardNo(settleIdCard);
        settleBankRequestDTO.setSettleBankName(settleBankName);
        settleBankRequestDTO.setSettleBankCode(settleBankCode);
        settleBankRequestDTO.setBankCityName(bankCityName);
        settleBankRequestDTO.setBankCityCode(bankCityCode);
        settleBankRequestDTO.setBankProvinceName(bankProvinceName);
        settleBankRequestDTO.setBankProvinceCode(bankProvinceCode);
        settleBankRequestDTO.setRequestNo(requestflow);
        settleBankRequestDTO.setSettleBankAccountNo(settleBankAccountNo);
        settleBankRequestDTO.setBranchBankName("上地支行");
        settleBankRequestDTO.setBranchBankCode("CMBCHINA");
        settleBankRequestDTO.setParentMerchantNo("1042781335");
        SettleBankResponseDTO settleBankResponseDTO=merchantFacade.uploadSettleInfo(settleBankRequestDTO);
        System.out.println(JSONUtils.toJsonString(settleBankResponseDTO));
    }
    @DataProvider(name="dp")
    public Object[][] dp(){
        //{商户编号,账户名称,身份证号,银行名称,银行编码,结算市名称,结算市区编码,结算省名称,结算省编码,结算账号}
        return  new Object[][]{
               // {"11050991314451","周必霞","350420197107070025","招商银行","CMBCHINA","北京市","110100","北京","110000","6214830104760001","",""}
                //{"11050953278271","冯丽云","130630198410026323","招商银行","CMBCHINA","北京市","110100","北京","110000","6214830104760001","",""}
               // {"11050923143363","冯丽云","130630198410026323","招商银行","CMBCHINA","北京市","110100","北京","110000","6214830104760001","",""}
                //{"11050991314881","李倩","220183198807041860","中国光大银行","CEB","北京市","110100","北京","110000","6226620202866331","",""}
               // {"11050991314881","","130630198410026323","招商银行","CMBCHINA","北京市","110100","北京","110000","","",""}
                //{"11070943378139","苏和平","411330199104014814","中国光大银行","CEB","北京市","110100","北京","110000","6226620202866331","",""}
                {"11070943378139","苏和平","41133019910401481","招商银行","CMBCHINA","北京市","110100","北京","110000","6214830104761662","",""}

        };//110709814143511
    }
}
