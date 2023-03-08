package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import pages.AmazonPraticePageAll;
import utulities.ConfigReader;
import utulities.Driver;

import java.util.List;

public class AmazonStepdefinicationsE {
    AmazonPage amazonPage;
    @Given("kullanici amazona gider")
    public void kullaniciAmazonaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("kullanici iphone için arama yapar")
    public void kullaniciIphoneIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }

    @Then("sayfa basliginin iphone icerdigini test eder")
    public void sayfaBasligininIphoneIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }
    @When("kullanici selenium için arama yapar")
    public void kullaniciSeleniumIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("selenium", Keys.ENTER);
    }
    @Then("sayfa basliginin selenium icerdigini test eder")
    public void sayfaBasligininSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }
    @When("kullanici java için arama yapar")
    public void kullaniciJavaIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("java", Keys.ENTER);
    }
    @Then("sayfa basliginin java icerdigini test eder")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("java"));
    }
    @Given("kullanici {string} gider")
    public void kullaniciGider(String girilenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(girilenUrl));
    }
    @When("kullanici {string} için arama yapar")
    public void kullaniciIçinAramaYapar(String string) {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(string, Keys.ENTER);
    }
    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
    AmazonPraticePageAll amazonPraticePageAll =new AmazonPraticePageAll();

    @Given("kullanıcı anasayfaya gider")
    public void kullanıcıAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("dil menusune gelelim")
    public void dilMenusuneGelelim() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(amazonPraticePageAll.dilMenusu).perform();

    }

    @And("Change butonuna basiniz")
    public void changeButonunaBasiniz() {

        amazonPraticePageAll.change.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("DropDownVisibleText kullanarak TRY Turkish Lira optionunu secin ve yazdırın")
    public void dropdownvisibletextKullanarakTRYTurkishLiraOptionunuSecinVeYazdırın() {
//amazonPraticePageAll.ddm.click();
        Select select=new Select(amazonPraticePageAll.ddm);
        select.selectByVisibleText("TRY - Turkish Lira");


    }

    @And("Tüm option'ları yazdırın")
    public void tümOptionLarıYazdırın() {
        Select select=new Select(amazonPraticePageAll.ddm);
        List<WebElement> list=select.getOptions();
        list.forEach(t-> System.out.println(t.getText()));
    }

    @And("dropdowndaki tum optionlarin toplam sayısının {int} ye esit oldugunu test edin")
    public void dropdowndakiTumOptionlarinToplamSayısınınYeEsitOldugunuTestEdin(int arg0) {
        int expected=68;
        Select select=new Select(amazonPraticePageAll.ddm);
        List<WebElement> list=select.getOptions();
        int actual=select.getOptions().size();
        Assert.assertEquals(expected,actual);
    }

    @When("Save Changes butonuna basınız")
    public void saveChangesButonunaBasınız() {
        amazonPraticePageAll.bosBox.click();
        amazonPraticePageAll.changeButton.click();
    }

    @And("arama motoruna Kitap yazip aratin")
    public void aramaMotorunaKitapYazipAratin() {
        Driver.wait(2);
        amazonPraticePageAll.search.sendKeys("Kitap"+Keys.ENTER);
    }

    @And("ilk cikan urunun parabiriminin TRY oldugunu test edin")
    public void ilkCikanUrununParabirimininTRYOldugunuTestEdin() {
        String expected="TRY";
        String actual=  amazonPraticePageAll.paracinsi.getText();
        Assert.assertEquals(expected,actual);
    }


    @Then("amazon sayfasında selenium aratılır")
    public void amazonSayfasındaSeleniumAratılır() {
        amazonPage.searchBox.sendKeys("Selenium",Keys.ENTER);
    }

    @And("sonucların selenium icerdigi test edilir")
    public void sonuclarınSeleniumIcerdigiTestEdilir() {
        String actual="selenium";
      Assert.assertEquals("selenium",actual);
    }


}


