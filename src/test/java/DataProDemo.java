import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by yp-tc-2646 on 17/2/9.
 */
public class DataProDemo {

    @Test(dataProvider = "dp")
    public void printData(String name,String sex){

        System.out.println("name:"+name+"---sex:"+sex);
    }

    @DataProvider(name = "dp")
    public Object [][] dataProvider(){
        return  new Object[][]{
            new Object[]{"LI","女"},
            new Object[]{"QIAN","女"}
        };
    }


}
