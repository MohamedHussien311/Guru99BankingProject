package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By userIDTxt = By.name("uid");
    By passwordTxt = By.name("password");
    By loginBtn = By.name("btnLogin");
    By resetBtn = By.name("btnReset");
    By welcomeMsg = By.className("heading3");
    By managerID = By.xpath("//tr[@class='heading3']");
    By logOutBtn = By.linkText("Log out");
    public void login(String userID, String Password){
        driver.findElement(resetBtn).click();
        driver.findElement(userIDTxt).sendKeys(userID);
        driver.findElement(passwordTxt).sendKeys(Password);
        driver.findElement(loginBtn).click();
    }
    public String WelcomeMessage(){
        return driver.findElement(welcomeMsg).getText();
    }
    public String ManagerID(){
        return driver.findElement(managerID).getText();
    }
    public void logOut(){
        driver.findElement(logOutBtn).click();
    }
}
