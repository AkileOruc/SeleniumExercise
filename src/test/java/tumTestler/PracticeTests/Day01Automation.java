package tumTestler.PracticeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;


    public class Day01Automation {
        // https://www.automationexercise.com/ sayfasina gidelim
        // signUp linkine tiklayalim
        // name ve email adress kismina bilgiler gondererek uye olalim
        // uye olundugunu test edelim
        AutomationPage automation=new AutomationPage();

        @Test(groups = "smoke")
        public void test01(){
            //Driver.getDriver().get("https://www.automationexercise.com/");
            Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));


            // signUp linkine tiklayalim
            automation.signupLink.click();
            // name ve email adress kismina bilgiler gondererek uye olalim
            automation.nameBox.sendKeys("nevzat");
            automation.emailBox.sendKeys("nevzat@gmail.com");
            automation.signUpButton.click();
            //uye olundugunu test
            Assert.assertTrue(automation.enterText.isDisplayed());

        }

        @Test
        public void test02olumsuzTest(){

          automation.automationMethod();

          Driver.quitDriver();
        }
    }



