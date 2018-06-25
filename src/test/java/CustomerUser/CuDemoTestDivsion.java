package CustomerUser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by yp-tc-2646 on 18/6/5.
 */
public class CuDemoTestDivsion {

    CUDemoCompute cuCompute=new CUDemoCompute();

    @DataProvider(name = "process_data")
    public Object [][] rangeData(){

        return new Object[][]{
                {"用例编号01:","计算成功",1,2,},
                {"用例编号02:","0不能作为除数",2,0,},

        };

    }
    @Test(dataProvider = "process_data")
    public void testBetween(String no,String expect,float a,float b){

        String res=cuCompute.division(a,b);

        System.out.println(no+expect+res);

    }

}
