package Tests;

import Pages.LoginPage;
import com.google.common.io.Files;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase{
    LoginPage loginPage;
    String userID = "mngr588168";
    String password = "#456test";
    String invalidUserID = "mohamed";
    String invalidPassword = "test123";
    @Test(priority = 1)
    public void managerCanNotLoginWithInvalidUserid() {
        loginPage = new LoginPage(driver);
        loginPage.logOut();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        loginPage.login(invalidUserID,password);
        alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(),"User or Password is not valid");
        alert.accept();
    }
    @Test(priority = 2)
    public void managerCanNotLoginWithInvalidPassword() {
        loginPage = new LoginPage(driver);
        loginPage.login(userID,invalidPassword);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(),"User or Password is not valid");
        alert.accept();
    }
    @Test(priority = 3)
    public void managerCanNotLoginWithInvalidUseridAndInvalidPassword() {
        loginPage = new LoginPage(driver);
        loginPage.login(invalidUserID,invalidPassword);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(),"User or Password is not valid");
        alert.accept();
    }
}
