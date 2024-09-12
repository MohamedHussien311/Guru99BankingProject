package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {
    private final WebDriver driver;
    public FundTransferPage(WebDriver driver){
        this.driver = driver;
    }
    By payersAccountNo = By.name("payersaccount");
    By payeesAccountNo = By.name("payeeaccount");
    By amountTxt = By.name("ammount");
    By description = By.name("desc");
    By submitBtn = By.name("AccSubmit");
    By successMsg = By.cssSelector("p[class='heading3']");
    public void fundTransfer(String payersAN,String payeesAN,String amount,String desc){
        driver.findElement(payersAccountNo).sendKeys(payersAN);
        driver.findElement(payeesAccountNo).sendKeys(payeesAN);
        driver.findElement(amountTxt).sendKeys(amount);
        driver.findElement(description).sendKeys(desc);
        driver.findElement(submitBtn).click();
    }
    public String successMessage(){
        return driver.findElement(successMsg).getText();
    }

}
