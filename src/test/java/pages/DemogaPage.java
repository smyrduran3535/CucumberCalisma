package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class DemogaPage {
public DemogaPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(id="firstName") public WebElement firstname;
@FindBy(id="lastName") public WebElement lastname;
@FindBy(id="userEmail") public WebElement userEmail;
@FindBy(xpath="//*[text()='Female']") public WebElement checkbox1;
@FindBy(id="userNumber") public WebElement userNumber;
@FindBy(id="dateOfBirthInput") public WebElement dateOfBirthInput;
@FindBy(id="subjectsContainer") public WebElement subjectsContainer;
    @FindBy(xpath="//*[text()='Reading']") public WebElement checkbox2;
    @FindBy(id="currentAddress") public WebElement currentAddress;
    @FindBy(id="state") public WebElement stateddm;
    @FindBy(id="city") public WebElement cityddm;
    @FindBy(id="submit") public WebElement submitddm;
    @FindBy(xpath = "//*[@class='left-pannel']") public WebElement bosluk;
}
