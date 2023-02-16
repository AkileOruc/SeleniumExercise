package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.EtsyPage;
import utilities.Driver;

import java.util.Set;

public class Etsy01 {
    @Test

    public void test01(){
        Driver.getDriver().get("https://www.etsy.com");

        //1 cookies i gecelim bunu EtsyPage den bir obje olusturarak yapabilirim
        EtsyPage etsyPage=new EtsyPage();

        etsyPage.cookies.click();

        // etsy e gittigimizi test edelim
        String expectedIcerik="etsy";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));

        //2 arama kotusunun gorunur oldugunu test edelim

        Assert.assertTrue(etsyPage.aramaKutusu.isEnabled());

        //3 arama kutusuna Nutella :) yazip aratalim ilk urune click yapalim

        etsyPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        etsyPage.ilkUrun.click();


    }

}
