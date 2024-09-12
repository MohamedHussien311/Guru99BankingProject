package Tests;

import Pages.DepositPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepositTest extends TestBase{
    HomePage homePage;
    DepositPage depositPage;
    String accountNo = "137583";
    String amount = "100";
    String description = "living expended";
    @Test
    public void managerCanDepositMoney(){
        homePage = new HomePage(driver);
        homePage.openDepositPage();
        depositPage = new DepositPage(driver);
        depositPage.deposit(accountNo,amount,description);
        Assert.assertEquals(depositPage.SuccessMessage(),"Deposited Successfully!!!");
    }
}
