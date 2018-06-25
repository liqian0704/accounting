import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by yp-tc-2646 on 17/2/10.
 */
public class CssSelectorDemo {
    private WebDriver driver;
    @BeforeClass
    public void beforeclass(){

         driver=new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.get("https://www.jd.com/");
    }

    @Test
    public void testjd(){



//        //E 标签选择器,匹配所有的div标签
//        System.out.println(driver.findElements(By.cssSelector("div")).size());
//
//
//        //通过fincElements返回多个
//        System.out.println(driver.findElements(By.cssSelector(".fr li>a")).size());
//
//        //.info class 选择器,通过findElement返回匹配的第一个
//        System.out.println(driver.findElement(By.cssSelector(".fr li>a")).getText());
//
//        //E + F 毗邻元素选择器
//        System.out.println(driver.findElement(By.cssSelector("#ttbar-login a + a")).getText());
//        //E ~ F 同级元素选择器
//        System.out.println(driver.findElement(By.cssSelector("#ttbar-login a ~ a")).getText());
//        //E > F子代元素选择器
//        System.out.println(driver.findElement(By.cssSelector(".fr li>a+a")).getText());
        System.out.println(driver.findElement(By.cssSelector(".logo_tit_lk")).getText());
        System.out.println(driver.findElement(By.cssSelector("a[href='//www.jd.com']")).getText());
        System.out.println(driver.findElement(By.cssSelector(".logo_subtit")).getText());






    }
    @Test
    public void test1(){
        //E F 后代元素选择器(秒杀)
       System.out.println(driver.findElement(By.cssSelector("#navitems-group1 li a")).getText());


    }
    @AfterClass
    public void test2(){

            driver.quit();
    }
}
