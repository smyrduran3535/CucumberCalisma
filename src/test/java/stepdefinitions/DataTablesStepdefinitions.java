package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utulities.Driver;

public class DataTablesStepdefinitions {
    DataTablePage dataTablePage=new DataTablePage();

    @Given("kullanıcı {string} gider")
    public void kullanıcıGider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        Driver.waitAndClick(dataTablePage.newButon,10);
    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
dataTablePage.firstName.sendKeys(string);
    }
    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
dataTablePage.lastName.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
dataTablePage.position.sendKeys(string);

    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
dataTablePage.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
dataTablePage.extension.sendKeys(string);
    }
    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
dataTablePage.startDate.sendKeys(string);
    }
    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
dataTablePage.salary.sendKeys(string);
    }
    @When("kullanici create butonuna basar")
    public void kullanici_create_butonuna_basar() {
dataTablePage.create.click();
    }
    @And("kullanici firstname  {string} ile arar")
    public void kullaniciFirstnameIleArar(String string) {
        dataTablePage.search.sendKeys(string);
    }

    @And("kullanici  {string} in olustugunu test eder")
    public void kullaniciInOlustugunuTestEder(String string) {
        Driver.wait(1);
        Assert.assertTrue(Driver.waitAndGetText(dataTablePage.name,5).contains(string));
    }



}
