import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by yp-tc-2646 on 17/2/8.
 */

public class LocateDemo {
    private WebDriver webDriver;
    String baseURL;




    @Test()
    public void test() throws InterruptedException {
        webDriver=new FirefoxDriver();

        baseURL="https://www.jd.com/";

        webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);

        webDriver.get(baseURL);



        webDriver.findElement(By.className("link-login")).click();//点击请登录链接

        webDriver.findElement(By.linkText("账户登录")).click();//点击账户登录

        webDriver.findElement(By.id("loginname")).sendKeys("18210207074");

        webDriver.findElement(By.xpath("//*[@id=\"nloginpwd\"]")).sendKeys("1234567890qwerty");

       // WebElement frm =webDriver.findElement(By.id("formlogin"));
        webDriver.findElement(By.id("loginsubmit")).click();//点击登录按钮

        String title=webDriver.getTitle();

        Assert.assertTrue(title.contains("京东(JD.COM)"));

        Thread.sleep(1000);

    }

    @Test(dependsOnMethods = {"test"})
    public void findPhone(){

        Actions actions=new Actions(webDriver);

        actions.moveToElement(webDriver.findElements(By.cssSelector("li  a")).get(1)).perform();

        webDriver.findElement(By.linkText("手机")).click();
    }
    @Test()
    @Parameters({"p1","p2"})
    public void para1(String p1,String p2){

        //webDriver=new FirefoxDriver();

        System.out.println(p1);

        System.out.print(p2);


    }

    @Test
    public void testPrint(){

        System.out.println("****");

    }

    @AfterMethod
    public void tearDown(){

       // webDriver.quit();

    }
}
