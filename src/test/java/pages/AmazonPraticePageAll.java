package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class AmazonPraticePageAll {
    public AmazonPraticePageAll(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[text()='EN']") public WebElement dilMenusu;
    @FindBy(xpath = "(//a[text()='Change'])[1]") public WebElement change;
    @FindBy(xpath = "//select[@id='icp-currency-dropdown']") public WebElement ddm;
    @FindBy(xpath="(//span[text()='TRY'])[1]") public WebElement paracinsi;
    @FindBy(xpath= "(//p[@id='icp-currency-dropdown-container'])[1]") public WebElement bosBox;
    @FindBy(xpath="//input[@class='a-button-input']") public WebElement changeButton;
    @FindBy(xpath= "//input[@id='twotabsearchtextbox']") public WebElement search;


}
