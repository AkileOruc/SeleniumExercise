package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.Zerowebappsecurity;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class ZeroBank01 {
    @Test

    public void test01() throws InterruptedException {

        //Driver.getDriver().get("http://zero.webappsecurity.com");

        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        Zerowebappsecurity zeroWebappsecurity = new Zerowebappsecurity();

        zeroWebappsecurity.signinButton.click();

        zeroWebappsecurity.loginButton.sendKeys("username");

        Thread.sleep(1000);

        zeroWebappsecurity.paswordButton.sendKeys("password");


        Thread.sleep(1000);

        zeroWebappsecurity.signInGiris.click();

        Thread.sleep(2000);

        Driver.getDriver().navigate().back();

        zeroWebappsecurity.onlineBank.click();


        zeroWebappsecurity.payBills.click();


        zeroWebappsecurity.purchase.click();

        zeroWebappsecurity.currency.sendKeys("Eurozone (euro)");
        Thread.sleep(2000);


        zeroWebappsecurity.currency.click();


            Thread.sleep(2000);

String expected="euro";
String actual=zeroWebappsecurity.euroYazisi.getText();

            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(actual.contains(expected));
            softAssert.assertAll();

        List<WebElement> tumListe = Driver.getDriver().findElements(By.id("pc_currency"));

        for (WebElement each : tumListe
        ) {
            System.out.println(each.getText());

          Driver.closeDriver();


        }

    }
}
