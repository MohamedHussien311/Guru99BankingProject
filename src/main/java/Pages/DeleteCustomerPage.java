package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerPage {
    private final WebDriver driver;
    public DeleteCustomerPage(WebDriver driver){
        this.driver = driver;
    }
    By customerIDTxt = By.name("cusid");
    By submitBtn = By.name("AccSubmit");
    public void deleteCustomer(String cid){
        driver.findElement(customerIDTxt).sendKeys(cid);
        driver.findElement(submitBtn).click();
    }
}
