package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage {
    private final WebDriver driver;
    public DepositPage(WebDriver driver){
        this.driver = driver;
    }
    By accountNoTxt = By.name("accountno");
    By amountTxt = By.name("ammount");
    By description = By.name("desc");
    By submitBtn = By.name("AccSubmit");
    By successMsg = By.id("main-message");
    public void deposit(String accountNo, String amount, String desc){
        driver.findElement(accountNoTxt).sendKeys(accountNo);
        driver.findElement(amountTxt).sendKeys(amount);
        driver.findElement(description).sendKeys(desc);
        driver.findElement(submitBtn).click();
    }
    public String SuccessMessage(){
        return driver.findElement(successMsg).getText();
    }
}
