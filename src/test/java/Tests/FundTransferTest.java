package Tests;

import Pages.FundTransferPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FundTransferTest extends TestBase{
    HomePage homePage;
    FundTransferPage fundTransferPage;
    String payersAccountNo = "137583";
    String payeesAccountNo = "137582";
    String amount = "500";
    String description = "living expended";
    @Test
    public void managerCanTransferMoney(){
        homePage = new HomePage(driver);
        homePage.openFundTransferPage();
        fundTransferPage = new FundTransferPage(driver);
        fundTransferPage.fundTransfer(payersAccountNo,payeesAccountNo,amount,description);
        Assert.assertEquals(fundTransferPage.successMessage(),"Fund Transfer Details");
    }
}
