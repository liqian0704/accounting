package accounting_verify;

/**
 * Created by yp-tc-2646 on 18/2/5.
 */
public class CommPro {
    public static  final String testAccountingURI="http://10.151.32.27:30148";
    public static  final String innerAccountingURI="http://59.151.25.126:6449";
    public static  final String proAccountURI="";
    public static final  String env="test";

    public static String getEnvURI(String env){
        if(env.equals("test")){
            return testAccountingURI;

        } else if(env.equals("inner")){

        return innerAccountingURI;

        }else
            return proAccountURI;
    }
}
