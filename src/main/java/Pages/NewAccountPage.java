package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    private final WebDriver driver;
    public NewAccountPage(WebDriver driver){
        this.driver = driver;
    }
    By customerIDTxt = By.name("cusid");
    By accountTypeTxt = By.name("selaccount");
    By initDepositTxt = By.name("inideposit");
    By submitButton = By.name("button2");
    By successMsg = By.cssSelector("p[class='heading3']");   // accountID 137575
    public void createNewAccount(String cuID,String accountType,String initialDeposit){
        driver.findElement(customerIDTxt).sendKeys(cuID);
        Select select = new Select(driver.findElement(accountTypeTxt));
        if(accountType.equalsIgnoreCase("savings"))
         select.selectByVisibleText("Savings");
        else if (accountType.equalsIgnoreCase("current"))
            select.selectByVisibleText("Current");
        driver.findElement(initDepositTxt).sendKeys(initialDeposit);
        driver.findElement(submitButton).click();
    }
    public String successMessage(){
        return driver.findElement(successMsg).getText();
    }
}
