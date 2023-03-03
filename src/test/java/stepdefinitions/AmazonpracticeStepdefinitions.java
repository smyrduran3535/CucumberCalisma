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
import pages.AmazonPraticePageAll;
import utulities.ConfigReader;
import utulities.Driver;

import java.util.List;

public class AmazonpracticeStepdefinitions {
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


}
