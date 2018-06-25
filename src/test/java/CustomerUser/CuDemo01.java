package CustomerUser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by yp-tc-2646 on 18/6/5.
 */
public class CuDemo01 {
    @DataProvider(name = "range-provider")
    public Object [][] rangeData(){
        int lower=5;
        int upper=10;
        return new Object[][]{
                {lower+1,lower,upper,false},
                {lower-1,lower,upper,false},
                {upper+1,lower,upper,false},
                {upper-1,lower,upper,false},

        };

    }
    @Test(dataProvider = "range-provider")
    public void testBetween(String no,int n,int lower,int uppper,Boolean expected){
       System.out.println("Received="+n+"区间范围("+lower+","+uppper+")"+"预期结果:"+expected);

    }

}
