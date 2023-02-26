package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//test calıstırıcı rotasyon
@CucumberOptions(//senaryoların nerede nasıl calıstıgını hangi raporu kullanılmasıyla alakalı secenekleri ayarlar
        features = "src/test/resources/features",//features ın yolunu belirtmemiz gerekir
        glue = "stepdefinitions",//kodlarımızı yeri belirtirriz glue da
      tags = "@gp1",//ortak/calısma  calıstırmak istedigimiz senaryoya verdigimiz tag ı belirtiriz
        dryRun = false //senaryonun adımlarını kontrol eder ve calıstıgını goruruz
)
public class Runners {//xml file gibi runner classı

}
