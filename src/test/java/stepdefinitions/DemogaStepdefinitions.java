package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DemogaPage;
import utulities.ConfigReader;
import utulities.Driver;

public class DemogaStepdefinitions {
    DemogaPage demodaPage=new DemogaPage();
    @Given("kullanici ana sayfaya girer")
    public void kullaniciAnaSayfayaGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("demogaUrl"));
    }


    @And("kullanicı {string} girer")
    public void kullanicıGirer(String arg0) {
        demodaPage.firstname.sendKeys("Sumeyra");
        demodaPage.lastname.sendKeys("durmaz");
        demodaPage.userEmail.sendKeys("sum@gmail.com");
        demodaPage.userNumber.sendKeys("05468797898");
        demodaPage.dateOfBirthInput.sendKeys("02 Mar 2023");
        demodaPage.bosluk.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //demodaPage.subjectsContainer.sendKeys("Books");
        demodaPage.currentAddress.sendKeys("yeni mah eski sk nı:147 Adana/Merkez");
        Select select=new Select(demodaPage.stateddm);
        select.getFirstSelectedOption().click();
        Select select1=new Select(demodaPage.cityddm);
        select1.getFirstSelectedOption().click();
    }

    @And("kullanici checkbox secer")
    public void kullaniciCheckboxSecer() {
        if (demodaPage.checkbox1.isSelected()){
            demodaPage.checkbox1.click();
        }
        if (demodaPage.checkbox2.isSelected()){
            demodaPage.checkbox2.click();
        }

    }

    @And("kullanici submit butonuna basar")
    public void kullaniciSubmitButonunaBasar() {
demodaPage.submitddm.click();
    }


    }

