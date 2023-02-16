package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyPage {
// page classleri locate ve login ler icin surekli yapilan islemler icin kolaylik olmasi icin kullanilir

    //buraya bir constructor yerlestiriyoruz
    public EtsyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='wt-btn wt-btn--filled wt-mb-xs-0']")
    public WebElement cookies;


    @FindBy(id = "global-enhancements-search-query")
    public WebElement aramaKutusu;


    @FindBy(xpath = "(//*[@class='height-placeholder'])[1]")

    public WebElement ilkUrun;

}



