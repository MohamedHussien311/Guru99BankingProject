package Tests;

import Pages.DeleteCustomerPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteCustomerTest extends TestBase{
    HomePage homePage;
    DeleteCustomerPage deleteCustomerPage;
    String customerID = "39609";
    @Test
    public void managerCanDeleteCustomer(){
        homePage = new HomePage(driver);
        homePage.openDeleteCustomerPage();
        deleteCustomerPage = new DeleteCustomerPage(driver);
        deleteCustomerPage.deleteCustomer(customerID);
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.switchTo().alert().getText(),"Customer Deleted Successfully!!!");
    }
}
