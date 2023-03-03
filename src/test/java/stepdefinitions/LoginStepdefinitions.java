package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utulities.Driver;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LoginStepdefinitions {
  // @Given("kullanici {string} ana sayfaya girer")
  // public void kullaniciAnaSayfayaGirer(String string) {
  //     Driver.getDriver().get(string);
  // }

   // @And("kullanici email ve sifre girer")
   // public void kullaniciEmailVeSifreGirer(io.cucumber.datatable.DataTable dataTable) {

   // }

    @Given("kullanici {string} ana sayfaya girer")
    public void kullanici_ana_sayfaya_girer(String string) {
        Driver.getDriver().get(string);
    }
    @Given("kullanici email ve sifre girer")
    public void kullanici_email_ve_sifre_girer(io.cucumber.datatable.DataTable dataTable) {
        LoginPage loginPage=new LoginPage();
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //           1.YOL:            List<String> ile
       //List<String> data= dataTable.row(1);
       //System.out.println(data.get(1));
       //System.out.println(data);
       //loginPage.login.click();
       //loginPage.email.sendKeys(dataTable.row(1).get(0));
       //loginPage.password.sendKeys(dataTable.row(1).get(1));
       //loginPage.loginButton.click();

        // 2. Yol :  List<List<String >>  ile;
       // List<List<String >> data=dataTable.asLists();
       // System.out.println(data.get(1));
       // loginPage.login.click();
       // loginPage.email.sendKeys(dataTable.row(1).get(0));
       //loginPage.password.sendKeys(dataTable.row(1).get(1));
       // loginPage.loginButton.click();
        List<Map<String ,String >> data=dataTable.asMaps();
     //  System.out.println(data.get(1));//{email=raj.khan@bluerentalcars.com, sifre=v7Hg_va^}
     //  System.out.println(data.get(0));//{email=kate.brown@bluerentalcars.com, sifre=tad1$Fas}
for (Map<String,String> w:data){
    System.out.println(w);
    //{email=raj.khan@bluerentalcars.com, sifre=v7Hg_va^}
    //{email=kate.brown@bluerentalcars.com, sifre=tad1$Fas}
    //{email=kate.brown@bluerentalcars.com, sifre=tad1$Fas}
    //{email=raj.khan@bluerentalcars.com, sifre=v7Hg_va^}
    //{email=pam.raymond@bluerentalcars.com, sifre=Nga^g6!}
//   loginPage.login.click();
    loginPage.email.sendKeys(w.get("email"));
    loginPage.password.sendKeys(w.get("sifre"));
   loginPage.loginButton.click();

}
    }

    }
