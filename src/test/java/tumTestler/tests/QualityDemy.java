package tumTestler.tests;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.QualityDemyPage;
import utilities.Driver;


public class QualityDemy {

// Kullanici https://www.qualitydemy.com sayfasina gider
// basarili bir sekilde login yapar
// categories dropdown dan all courses i secer
// sol kisimdaki alandan filtreleme yaparak English Courses i secer
// Filtreleme yapildigini dogrular
// English Course Learn to Speak dersine tiklar
// Secilen dersi wishliste ekler
// Secilen dersin wishliste eklendigini dogurlar


  QualityDemyPage page = new QualityDemyPage();
@Test
    public void qualityTest(){

    Driver.getDriver().get("https://www.qualitydemy.com");

  page.cookies.sendKeys("anevzatcelik@gmail.com");

    Actions actions=new Actions(Driver.getDriver());

}
}
