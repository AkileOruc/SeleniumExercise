package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

        public AmazonPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id="twotabsearchtextbox")
        public WebElement aramaKutusuElementi;

        @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
        public WebElement aramaSonucYaziElementi;

    public void enAltaGit(){
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }

    @FindBy (xpath ="//tbody" )
    public WebElement webTable;

    }

