//for HW
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneLesson5HW4 {
    @Test
    public void clickEnterLink() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("123654");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Trust");
        driver.findElement(By.name("last_name")).sendKeys("Law");
        driver.findElement(By.name("email")).sendKeys("fig_vam@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("12589");
        driver.findElement(By.name("password2")).sendKeys("12589");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a")).click();
        driver.findElement(By.name("email")).sendKeys("marina_collins@024.49.sharelane.com");
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Login']")).click();
        //driver.quit();
    }
}
