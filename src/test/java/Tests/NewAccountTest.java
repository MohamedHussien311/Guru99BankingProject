package Tests;

import Pages.HomePage;
import Pages.NewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewAccountTest extends TestBase{
    HomePage homePage;
    NewAccountPage newAccountPage;
    String customerID  = "91086";
    String accountType = "current";
    String initialDeposit = "10000";
    @Test
    public void managerCanCreateNewAccount() {
        homePage = new HomePage(driver);
        homePage.openNewAccountPage();
        newAccountPage = new NewAccountPage(driver);
        newAccountPage.createNewAccount(customerID,accountType,initialDeposit);
        Assert.assertEquals(newAccountPage.successMessage(),"Account Generated Successfully!!!");
    }

}
