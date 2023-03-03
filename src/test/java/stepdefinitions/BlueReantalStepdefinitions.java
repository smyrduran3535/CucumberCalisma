package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlueRentalPage;
import utulities.ConfigReader;
import utulities.Driver;

public class BlueReantalStepdefinitions {
    BlueRentalPage blueRentalPage=new BlueRentalPage();
    @Given("kullanici ana sayfada")
    public void kullaniciAnaSayfada() {
        Driver.getDriver().get(ConfigReader.getProperty("blueReantalUrl"));
    }

    @When("kullanici login sayfasina gider")
    public void kullaniciLoginSayfasinaGider() {
blueRentalPage.login.click();
    }


    @And("kullanıcı adini {string} girer")
    public void kullanıcıAdiniGirer(String string) {
        blueRentalPage.email.sendKeys(string);
    }

    @And("sifreyi {string} girer")
    public void sifreyiGirer(String string) {
        blueRentalPage.password.sendKeys(string);
    }

    @And("login buttoning basar")
    public void loginButtoningBasar() {
        blueRentalPage.loginButton.click();
    }

    @Then("login islemi gerçekleşir")
    public void loginIslemiGerçekleşir() {
    }

}
