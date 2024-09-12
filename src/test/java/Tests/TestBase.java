package Tests;

import com.github.javafaker.Faker;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    Faker fakeData = new Faker();
    @BeforeClass
    public void setup() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(300,10));
        driver.get("https://www.demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("uid")).sendKeys("mngr588168");
        driver.findElement(By.name("password")).sendKeys("#456test");
        driver.findElement(By.name("btnLogin")).click();
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f,new File("E:\\Courses\\Software Testing\\Selenium\\" +
                "projects\\Guru99BankingProject\\ScreenShots\\userCanLoginSuccessfully.jpg"));
    }
    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
