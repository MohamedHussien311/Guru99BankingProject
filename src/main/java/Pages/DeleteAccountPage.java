package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
    private final WebDriver driver;
    public DeleteAccountPage(WebDriver driver){
        this.driver = driver;
    }
    By accountNumberTxt = By.name("accountno");
    By submitBtn = By.name("AccSubmit");
    By errorMsg = By.id("main-message");
    public void deleteAccount(String accountNo){
        driver.findElement(accountNumberTxt).sendKeys(accountNo);
        driver.findElement(submitBtn).click();
    }
    public String errorMessage(){
        return driver.findElement(errorMsg).getText();
    }
}
