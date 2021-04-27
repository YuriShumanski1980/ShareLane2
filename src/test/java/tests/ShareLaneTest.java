package tests;

import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShareLaneTest {

    @Test
    public void fillZipcodeField(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("333333");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Piter");
        driver.findElement(By.name("last_name")).sendKeys("Swagger");
        driver.findElement(By.name("email")).sendKeys("999@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("178999");
        driver.findElement(By.name("password2")).sendKeys("178999");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.quit();

    }

}
