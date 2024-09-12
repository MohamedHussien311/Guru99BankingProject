package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By changePasswordBtn = By.linkText("Change Password");
    By newCustomerBtn = By.linkText("New Customer");
    By newAccountBtn = By.linkText("New Account");
    By deleteAccountBtn = By.linkText("Delete Account");
    By deleteCustomerBtn = By.linkText("Delete Customer");
    By depositBtn = By.linkText("Deposit");
    By withdrawBtn = By.linkText("Withdrawal");
    By fundTransferBtn = By.linkText("Fund Transfer");
    By balanceEnquiry = By.linkText("Balance Enquiry");
    public void openChangePasswordPage(){
        driver.findElement(changePasswordBtn).click();
    }
    public void openNewCustomerPage(){
        driver.findElement(newCustomerBtn).click();
    }
    public void openNewAccountPage(){
        driver.findElement(newAccountBtn).click();
    }
    public void openDeleteAccountPage(){
        driver.findElement(deleteAccountBtn).click();
    }
    public void openDeleteCustomerPage(){
        driver.findElement(deleteCustomerBtn).click();
    }
    public void openDepositPage(){
        driver.findElement(depositBtn).click();
    }
    public void openWithdrawPage(){
        driver.findElement(withdrawBtn).click();
    }
    public void openFundTransferPage(){
        driver.findElement(fundTransferBtn).click();
    }
    public void openBalanceEnquiryPage(){
        driver.findElement(balanceEnquiry).click();
    }
}
