package Tests;

import Pages.HomePage;
import Pages.WithdrawPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithdrawTest extends TestBase{
    HomePage homePage;
    WithdrawPage withdrawPage;
    String accountNo = "137582";
    String amount = "200";
    String description = "living expended";
    @Test
    public void managerCanWithdrawMoney(){
        homePage = new HomePage(driver);
        homePage.openWithdrawPage();
        withdrawPage = new WithdrawPage(driver);
        withdrawPage.withdraw(accountNo,amount,description);
        Assert.assertTrue(withdrawPage.SuccessMessage().contains("Transaction details"));
    }
}
