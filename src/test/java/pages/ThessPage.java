package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ThessPage {
    public ThessPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id ="Calque_1" )
    public WebElement title;

@FindBy(xpath = "(//*[@class='button -little large-only button-big'])[1]")
    public WebElement seConnecter;


    @FindBy(id = "login")
    public WebElement login;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement motDePasse;

    @FindBy(xpath = "//*[@type='submit']")
    public  WebElement connecter;

     @FindBy (id = "loginError")
    public WebElement invalide;


}
