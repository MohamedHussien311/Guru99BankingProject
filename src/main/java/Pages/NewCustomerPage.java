package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class NewCustomerPage {
    private final WebDriver driver;
    public NewCustomerPage(WebDriver driver){
        this.driver = driver;
    }
    By nameTxt = By.name("name");
    By birthDateTxt = By.name("dob");
    By addressTxt = By.name("addr");
    By cityTxt = By.name("city");
    By stateTxt = By.name("state");
    By pinTxt = By.name("pinno");
    By telephoneNumberTxt = By.name("telephoneno");
    By emailTxt = By.name("emailid");
    By passwordTxt = By.name("password");
    By submitBtn = By.name("sub");
    By successMsg = By.cssSelector("p[class='heading3']");
    public void createNewCustomer(String name,String dop,String address,String city,String state,
                                  String pin,String phoneNo,String email,String password){
        driver.findElement(nameTxt).sendKeys(name);
        driver.findElement(birthDateTxt).sendKeys(dop);
        driver.findElement(addressTxt).sendKeys(address);
        driver.findElement(cityTxt).sendKeys(city);
        driver.findElement(stateTxt).sendKeys(state);
        driver.findElement(pinTxt).sendKeys(pin);   // 6 digits
        driver.findElement(telephoneNumberTxt).sendKeys(phoneNo);
        driver.findElement(emailTxt).sendKeys(email);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(submitBtn).click();
    }
    public String successMessage(){
        return driver.findElement(successMsg).getText(); //Customer Registered Successfully!!!
    }
}
