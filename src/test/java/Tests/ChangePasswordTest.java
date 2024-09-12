package Tests;

import Pages.ChangePasswordPage;
import Pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChangePasswordTest extends TestBase{
    HomePage homePage;
    ChangePasswordPage changePasswordPage;
    String password = "#456test";
    String newPassword = "@test123";
    @Test
    public void userCanChangePassword() {
      homePage = new HomePage(driver);
      homePage.openChangePasswordPage();
      changePasswordPage = new ChangePasswordPage(driver);
      changePasswordPage.changePassword(password,newPassword);
      Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
      Alert alert = wait.until(ExpectedConditions.alertIsPresent());
      Assert.assertEquals(alert.getText(),"Password is Changed");
      alert.accept();
    }
}
