package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

static WebDriver driver;


    //Bir methodun icinde(diger package lerden class lardan kolayca cagirmak icin) Driver ayarlarini yapmaliyiz
    public static WebDriver getDriver(){
       WebDriverManager.chromedriver().setup();

       if (driver==null){

           driver=new ChromeDriver();
       }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.manage().window().maximize();


        return driver;
    }
    //simdi de  browser i kapatmasi icin bir method olusturalim

    public static void closeDriver(){

        driver.close();
    }
}
