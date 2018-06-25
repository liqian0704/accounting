package base;

import org.testng.TestNG;
import testcase.TestQuery;

/**
 * Created by yp-tc-2646 on 17/4/28.
 */
public class TestNGBase {
    public static String headerUrl = "http://10.151.30.4:8057"; // QA
    public  static String QA_HOST="";
    public static  String INNER_HOST="";
    public static  String PRO_HOST="";
    public static void  main(String []args){
        TestNG testNG=new TestNG();
        testNG.setTestClasses(new Class[]{
            //类名.class;
                TestQuery.class
        });
        testNG.run();

    }
}
