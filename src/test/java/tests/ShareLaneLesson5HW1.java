//for HW
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShareLaneLesson5HW1 {
    @Test
    public void clickEnterLink() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/");
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b")).click();
        driver.quit();
    }
}