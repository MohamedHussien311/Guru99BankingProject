package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    private final WebDriver driver;
    public ChangePasswordPage(WebDriver driver){
        this.driver = driver;
    }
    By oldPasswordTxt = By.name("oldpassword");
    By newPasswordTxt = By.name("newpassword");
    By confirmPasswordTxt = By.name("confirmpassword");
    By submitBtn = By.cssSelector("input[name='sub']");
    public void changePassword(String oldPass,String newPass){
        driver.findElement(oldPasswordTxt).sendKeys(oldPass);
        driver.findElement(newPasswordTxt).sendKeys(newPass);
        driver.findElement(confirmPasswordTxt).sendKeys(newPass);
        driver.findElement(submitBtn).click();
    }
}
