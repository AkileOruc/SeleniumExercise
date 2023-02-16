package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import pages.ThessPage;
import utilities.Driver;

import java.util.Set;

public class Thess01 {


    @Test
    public void test01(){

        Driver.getDriver().get("https://www.thess-corp.fr/");

        //sayfaya giris yaptigimizdan emin olalim
        ThessPage thessPage=new ThessPage();

        String expectedTitle= "thess";
        String actualTitle= thessPage.title.getText();

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(actualTitle.contains(expectedTitle) );
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
      Faker faker= new Faker ();

     thessPage.login.sendKeys(faker.internet().emailAddress());

     thessPage.motDePasse.sendKeys(faker.internet().password());

     thessPage.connecter.click();

     softAssert.assertTrue(thessPage.invalide.isEnabled());

softAssert.assertAll();
    }
}
