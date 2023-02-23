package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class TravelsPage {

  public TravelsPage() {PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy (xpath="//*[text()='Got It']")
    public WebElement stopCookie;



  @FindBy (id="ACCOUNT")
  public WebElement accountButton;


  @FindBy (linkText="Customer Signup")
  public WebElement customerSignup;


  @FindBy (name="first_name")
  public WebElement nameButton;


  @FindBy (css="input[name='last_name']")
  public WebElement lastNameButton;

  @FindBy (css="input[name='phone']")
  public WebElement phoneButton;


  @FindBy (css="input[name='email']")
  public WebElement email;


  @FindBy (css="input[name='password']")
  public WebElement password;

  @FindBy (id="account_type")
  public WebElement accountBox;

  @FindBy (xpath = "//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")
  public WebElement clickRobot;









}
