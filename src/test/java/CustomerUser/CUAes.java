package CustomerUser;

import com.miitang.common.util.security.AES;
import com.miitang.core.user.utils.DigestUtils;
import org.junit.Test;

/**
 * Created by yp-tc-2646 on 18/1/30.
 */
public class CUAes {
@Test
    public void test(){
        //13800138007 0hCPa+LMERw7G4p2A+H/vQ==
        //130321198411266238    hLbhGE6lG+VMMPibQ5dj4ZF+tSQN1iz8bx2Zl9C906g=
        //220183198807041860    FQlaAiflVWh1QgKNhhP3h7F+iq9W1RO2IvO97qax0+c=
    //苏和平  ni4quaxpVQhebFM8tDsetg==  手机号   15901298830 j1Ch1Ihvyinv7oKP4TL6rQ==   身份证号  4R4VPLIEcdbdQhs4zT50TO/zLuOh9hdDpTgEduRDNcQ=
    //银行卡号


        String result= AES.encryptToBase64("13100000010","U1RSX0FFU19LRV2k");
       // System.out.println(result);
    }
    @Test
    public void test02(){
       // String result= AES.decryptFromBase64("hgnolNZo3NBqrL9xq6xTpw==","U1RSX0FFU19LRV2k");//
        String result= AES.decryptFromBase64("PUCyaGnoMzCHFj2rjx1FVg==","U1RSX0FFU19LRV2k");
        String result1= AES.decryptFromBase64("qL7V2xxnCEmVd8GzZ++Mog==","U1RSX0FFU19LRV2k");
        System.out.println(result1);
    }
    @Test
    public void test03(){
        String pwd= DigestUtils.sha256Digest("123456" + "employee01@qq.com");

    }
}
