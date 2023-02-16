package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Zerowebappsecurity {

/*1. “http://zero.webappsecurity.com/” Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password” yazin
5. Sign in tusuna basin
6. Online banking menusu icinde Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"*/


    public Zerowebappsecurity() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id ="signin_button")
    public WebElement signinButton;

    @FindBy(id = "user_login")
    public WebElement loginButton;

    @FindBy(id = "user_password")
    public  WebElement paswordButton;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement signInGiris;


    @FindBy (id = "online-banking")
    public WebElement onlineBank;

    @FindBy (id = "pay_bills_link")
    public WebElement payBills;


    @FindBy (xpath = "(//*[@class='ui-state-default ui-corner-top'])[2]")
    public WebElement purchase;

    @FindBy (id = "pc_currency")
    public WebElement currency;


    @FindBy (id = "sp_sell_rate")
    public WebElement euroYazisi;

}



