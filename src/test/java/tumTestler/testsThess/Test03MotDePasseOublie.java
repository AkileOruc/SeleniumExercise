package tumTestler.testsThess;

import org.testng.annotations.Test;
import pages.ThessPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test03MotDePasseOublie {
    @Test

    public void testMotDePasse() {

     ThessPage thessPage =new ThessPage();

     thessPage.loginMethodNormal();


        thessPage.motDePasseOublie.click();
        thessPage.reinitialiserMotDePasse.isEnabled();
        thessPage.identifiantDeConnexion.sendKeys("moruc");

       // Driver.getDriver().switchTo().frame(thessPage.jeNeSuisPasRobot);
       // thessPage.jeNeSuisPasRobot.click();

       // Driver.getDriver().switchTo().defaultContent();

    }
    }
