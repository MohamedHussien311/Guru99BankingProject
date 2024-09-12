package Tests;

import Pages.HomePage;
import Pages.NewCustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewCustomerTest extends TestBase{
    HomePage homePage;
    NewCustomerPage newCustomerPage;    //77543
    @Test
    public void managerCanCreateNewCustomer(){
        homePage = new HomePage(driver);
        homePage.openNewCustomerPage();
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.createNewCustomer(fakeData.name().fullName(),"09/25/2001", fakeData.address().streetName(),
                fakeData.address().city(),fakeData.address().state(),fakeData.number().digits(6),
                fakeData.number().digits(11),fakeData.internet().emailAddress(),fakeData.number().digits(8));
        Assert.assertEquals(newCustomerPage.successMessage(),"Customer Registered Successfully!!!");
    }
}
