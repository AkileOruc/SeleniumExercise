package tumTestler.tests;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TravelsPage;
import utilities.Driver;

public class PhpTravels {
    /*
     Navigate to https://www.phptravels.net/
         * Click on Account button
         * Click on Customer Sign Up
         * Fill the form
         * Check the "I am not robot" check box
         * Click on Sign Up button
         * Check if the title is "Login - PHPTRAVELS"
         * Enter same login information that you used during registration and click login
         * Verify the welcome message contains the first name that you used during registration then close the browser
         * Note: You can use any locator you want.
         * */

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get("https://www.phptravels.net");

        TravelsPage travelsPage = new TravelsPage();
        travelsPage.stopCookie.click();

        travelsPage.accountButton.click();

        Thread.sleep(1000);


        travelsPage.customerSignup.click();

        Thread.sleep(1000);


        travelsPage.nameButton.sendKeys("mel");

        travelsPage.lastNameButton.sendKeys("canbaz");

        Thread.sleep(1000);

        travelsPage.phoneButton.sendKeys("1234567");


        travelsPage.email.sendKeys("snowjohn@gmail.com");
        Thread.sleep(1000);


        travelsPage.password.sendKeys("1111155555");
        Thread.sleep(1000);

        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.TAB).sendKeys("Customer").sendKeys("Customer").perform();


        Thread.sleep(3000);

        Driver.getDriver().switchTo().frame(travelsPage.clickRobot);
        Thread.sleep(2000);
        travelsPage.clickRobot.click();

        Driver.getDriver().switchTo().defaultContent();

        Thread.sleep(2000);

    }
}