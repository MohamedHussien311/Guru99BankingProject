package Tests;

import Pages.DeleteAccountPage;
import Pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class DeleteAccountTest extends TestBase{
    HomePage homePage;
    DeleteAccountPage deleteAccountPage;
    String accountNo = "137575";
    @Test
    public void managerCanDeleteAccount(){
        homePage = new HomePage(driver);
        homePage.openDeleteAccountPage();
        deleteAccountPage = new DeleteAccountPage(driver);
        deleteAccountPage.deleteAccount(accountNo);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        Assert.assertEquals(deleteAccountPage.errorMessage(),"Account Deleted Successfully!!!");
    }
}
