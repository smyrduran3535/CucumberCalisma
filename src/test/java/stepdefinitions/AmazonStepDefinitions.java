package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utulities.ConfigReader;
import utulities.Driver;

public class AmazonStepDefinitions {
AmazonPage amazonPage;

    @Given("amazon sayfasına gidilir")
    public void amazonSayfasınaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("amazon sayfasında selenium aratılır")
    public void amazonSayfasındaSeleniumAratılır() {
        amazonPage=new AmazonPage();
amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }



    @And("sonucların selenium icerdigi test edilir")
    public void sonuclarınSeleniumIcerdigiTestEdilir() {

    }

    @And("sayfa kapatılır")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }
}
