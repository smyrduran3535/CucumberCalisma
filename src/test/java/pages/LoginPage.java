package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()=' Login']") public WebElement login;
    @FindBy(name = "email") public WebElement email;
    @FindBy(name = "password") public WebElement password;
    @FindBy(xpath = "//button[@type='submit']") public WebElement loginButton;
}
