package marketting;

/**
 * Created by yp-tc-2646 on 18/2/5.
 */
public class CommPro {
   public static  final String testURI="http://10.151.32.27:30244";//qa
// public static  final String testURI="http://172.19.111.167:9001";//sailfish
   // public static  final String testURI="http://172.19.111.177:8086";//lw
    public static  final String innerMerchantURI="http://59.151.25.126:6446";
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
