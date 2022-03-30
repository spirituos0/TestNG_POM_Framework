package Test;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_SubscribeFunction extends BaseDriver {
// we extend this class with BaseDriver, because we have a setup in that class, which we always need;
    // so now there will be @BeforeMethod every time, even tho we did not write it here.

    HomePageElements homePageElements;
    MyAccountPageElements myAccountPageElements;
    ReusableMethods reusableMethods = new ReusableMethods();;

    @Test
    public void subscribeFunctionTest() {

        homePageElements = new HomePageElements(driver); // driver is coming from BaseDriver
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterBtn.click();
        myAccountPageElements.subscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);
    }

    @Test
    public void unsubscribeFunctionTest() {

        homePageElements = new HomePageElements(driver); // driver is coming from BaseDriver
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterBtn.click();
        myAccountPageElements.unsubscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        String actualMessage = myAccountPageElements.successMessage.getText();

        Assert.assertTrue(actualMessage.contains("Success"));

    }

}
