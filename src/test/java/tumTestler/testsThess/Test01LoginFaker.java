package tumTestler.testsThess;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import pages.ThessPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class Test01LoginFaker {


    @Test
    public void loginTest01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("thessUrl"));

        ThessPage thessPage=new ThessPage();
        //Bienvenue sur notre site Thess !  yazisi gonunur mu?
        thessPage.bienvenue.isEnabled();
        //se connecter i click yapalim
        thessPage.seConnecter.click();

        Set<String> tumHandleDegerleri= Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle="";

 //  System.out.println(ilkSayfaHandle);
//  System.out.println(tumHandleDegerleri);
//SET TE index yok for each yapmaliyiz
        for (String each:tumHandleDegerleri
        ) {
            if (!each.equals(ikinciSayfaHandle)){
                ikinciSayfaHandle=each;
            }
        }

    Driver.getDriver().switchTo().window(ikinciSayfaHandle);

  // Yeni acilan browser e gectik faker ile giris deneyelim, giris yapilmadigini test edelim
        Thread.sleep(2000);
    Faker faker= new Faker ();
    thessPage.identifiant.sendKeys(faker.internet().emailAddress());
        Thread.sleep(2000);
     thessPage.motDePasse.sendKeys(faker.internet().password());
     thessPage.connecter.click();
        Thread.sleep(2000);
     Assert.assertTrue(thessPage.invalide.isEnabled());
     Driver.quitDriver();

    }
}
