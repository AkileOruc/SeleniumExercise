package tumTestler.testsThess;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ThessPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class Test02Login extends TestBaseRapor {
        ThessPage thessPage = new ThessPage();


        @DataProvider

        public static Object[][] identifiant() {
           String[][] identifiantEtMotDePasse = {
                   {ConfigReader.getProperty("fauxUtilisateur1"), ConfigReader.getProperty("fauxMotdepasse1")},
                    {ConfigReader.getProperty("fauxUtilisateur2"), ConfigReader.getProperty("vraiMotdepasse")},
                    {ConfigReader.getProperty("fauxUtilisateur3"), ConfigReader.getProperty("vraiMotdepasse")},
                    {ConfigReader.getProperty("fauxUtilisateur5"), ConfigReader.getProperty("fauxMotdepasse3")},
                    {ConfigReader.getProperty("fauxUtilisateur5"), ConfigReader.getProperty("vraiMotdepasse")},
                     {ConfigReader.getProperty("vraiUtilisateur"), ConfigReader.getProperty("fauxMotdepasse3")},
                    {ConfigReader.getProperty("fauxUtilisateur4"), ConfigReader.getProperty("fauxMotdepasse3")},
                    {ConfigReader.getProperty("vraiUtilisateur"), ConfigReader.getProperty("fauxMotdepasse2")},


                    {ConfigReader.getProperty("vraiUtilisateur"), ConfigReader.getProperty("vraiMotdepasse")}};


            return identifiantEtMotDePasse;
        }

        @Test(dataProvider = "identifiant")
        public void loginTest01(String identifiant, String motDePasse) {

            thessPage.loginMethodDataProvider(identifiant,motDePasse);



        }

        @Test
        public void testVerifyTitle(){

           thessPage.logo.isEnabled();

           thessPage.tableauDeBord.isEnabled();

           thessPage.mesPatients1.isEnabled();

           thessPage.pharmacie.isEnabled();

           thessPage.mesPatients2.isEnabled();
extentTest= extentReports.createTest("la page d'accuille s'affiche pas");
        }

    }



