package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceEnquiryPage {
    private final WebDriver driver;
    public BalanceEnquiryPage(WebDriver driver){
        this.driver = driver;
    }
    By accountNumberTxt = By.name("accountno");
    By submitBtn = By.name("AccSubmit");
    By errorMsg = By.id("main-content");
    public void balanceEnquiry(String accountNo){
        driver.findElement(accountNumberTxt).sendKeys(accountNo);
        driver.findElement(submitBtn).click();
    }
    public String errorMessage(){
        return driver.findElement(errorMsg).getText();
    }
}
