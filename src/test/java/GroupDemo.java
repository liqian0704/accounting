import org.testng.annotations.Test;

/**
 * Created by yp-tc-2646 on 17/2/9.
 */
public class GroupDemo {

 @Test(groups = {"group1","group2"})
    public void test1(){

        System.out.println("group1+++group2");
    }

    @Test(groups = {"group1"})
    public void test2(){

        System.out.println("group1");
    }

    @Test(groups = {"group1"})
    public void test3(){

        System.out.println("group1");
    }

    @Test(groups = {"group4"})
    public void test4(){

        System.out.println("group3");

    }
}
