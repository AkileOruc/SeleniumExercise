package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class ThessPage {
    public ThessPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='sc-ikjQzJ cSfmvv']")
    public WebElement bienvenue;

    @FindBy(xpath = "(//*[@class='button -little large-only button-big'])[1]")
    public WebElement seConnecter;


    @FindBy(id = "login")
    public WebElement identifiant;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement motDePasse;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement connecter;

    @FindBy(id = "loginError")
    public WebElement invalide;

    @FindBy(xpath = "(//img[@alt='Thess'])[1]")
    public WebElement logo;

    @FindBy(xpath = "(//a[@role='link'])[2]")
    public WebElement tableauDeBord;

    @FindBy(xpath = "(//*[text()='Mes patients'])[1]")
    public WebElement mesPatients1;

    @FindBy(xpath = "(//*[text()='Mes patients'])[2]")
    public WebElement mesPatients2;

    @FindBy(xpath = "(//a[@role='link'])[4]")
    public WebElement pharmacie;

    @FindBy(xpath = "(//a[@role='link'])[3]")
    public WebElement motDePasseOublie;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement reinitialiserMotDePasse;


    @FindBy(id = "form_login")
    public WebElement identifiantDeConnexion;

    @FindBy(xpath  = "//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")
    public WebElement jeNeSuisPasRobot;


    public void handleMethod() {

        SoftAssert softAssert = new SoftAssert();


        Set<String> toutesHandles = Driver.getDriver().getWindowHandles();
        String deuxiemePageHandle = "";

        for (String each : toutesHandles
        ) {
            if (!each.equals(deuxiemePageHandle)) {
                deuxiemePageHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(deuxiemePageHandle);
    }


    public void loginMethod1() {
        Driver.getDriver().get(ConfigReader.getProperty("thessUrl"));
        seConnecter.click();
        handleMethod();
    }




    public void loginMethod2(String utilisateur,String motdepasse) {
        Driver.getDriver().get(ConfigReader.getProperty("thessUrl"));
        seConnecter.click();
        handleMethod();
        identifiant.sendKeys(utilisateur);
        motDePasse.sendKeys(motdepasse);
        connecter.click();
    }
}

