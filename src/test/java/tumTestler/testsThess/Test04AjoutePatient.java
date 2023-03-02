package tumTestler.testsThess;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.ThessPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Test04AjoutePatient extends TestBaseRapor {

    @Test

    public void testMesPatient() throws InterruptedException {
        ThessPage thessPage=new ThessPage();

        thessPage.loginMethodNormal();





        thessPage.identifiant.sendKeys("metin");
        Thread.sleep(2000);
        thessPage.motDePasse.sendKeys("190809");
        thessPage.connecter.click();
        Thread.sleep(2000);
        thessPage.mesPatients.click();
        Thread.sleep(2000);



        thessPage.ajouterUnPatient.click();
        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(thessPage.fermer).doubleClick().perform();

        thessPage.etablissementMedical.click();
        thessPage.demoCase.click();


    }

}
