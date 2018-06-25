package CustomerUser;

/**
 * Created by yp-tc-2646 on 18/2/5.
 */
public class CommPro {
    //用户系统
   public static  final String testURI="http://10.151.32.27:30034";
    //商户系统
    //public static  final String testURI="http://10.151.32.27:30241";
    public static  final String innerMerchantURI="http://59.151.25.126:6444";
    public static  final String innerCustomerURI="http://59.151.25.126:6447";
    public static  final String innerToolURI="http://59.151.25.126:6448";
    public static  final String proMerchantURI="";
    public static final  String env="test";
    public static String getEnvURI(String env){
        if(env.equals("test")){
            return testURI;

        } else if(env.equals("inner")){

        return innerMerchantURI;

        }else
            return proMerchantURI;
    }
}
