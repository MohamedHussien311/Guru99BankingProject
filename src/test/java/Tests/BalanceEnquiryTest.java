package Tests;

import Pages.BalanceEnquiryPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BalanceEnquiryTest extends TestBase{
    HomePage homePage;
    BalanceEnquiryPage balanceEnquiryPage;
    String accountNo = "137583";
    @Test
    public void managerCanViewBalanceEnquiry(){
        homePage = new HomePage(driver);
        homePage.openBalanceEnquiryPage();
        balanceEnquiryPage = new BalanceEnquiryPage(driver);
        balanceEnquiryPage.balanceEnquiry(accountNo);
        Assert.assertEquals(balanceEnquiryPage.errorMessage(),"Balance Enquiry Details");
    }
}
