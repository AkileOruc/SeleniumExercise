package tumTestler.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Soru1 {
   /* Soru 1 :
    Ø Amazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
    Ø Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin
    AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
    Ø Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
    Ø Bu class’in altinda bir test method olusturun : satirSayisi( ) ve webtable’da 10
    satir oldugunu test edin
    Ø Yeni bir method olusturun : sutunSayisi( ) ve yazi olan sutun sayisinin 7oldugunu
    test edin*/
    @Test

   public void satirSayisi(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazon=new AmazonPage();


        amazon.enAltaGit();

        amazon.webTable.getText();


        List<WebElement> satirlarListesi =  Driver.getDriver().findElements(By.xpath("//tbody/tr"));

        Assert.assertTrue(satirlarListesi.size()==10);


        //5.Tum satirlari yazdirin
        int satirNo=1;
        for (WebElement eachSatir:satirlarListesi
        ) {
            System.out.println("====="+satirNo+".satir=====");
            System.out.println(eachSatir.getText());
            satirNo++;
        }

        List<WebElement> birinciSatirElementleriList= Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td"));
        for (WebElement eachElement:birinciSatirElementleriList
        ) {
            System.out.println(eachElement.getText());
        }

Driver.quitDriver();
    }
}
