package Test;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.testng.annotations.Test;

public class _02_EditAccountFunction extends BaseDriver {

    HomePageElements homePageElements;
    MyAccountPageElements myAccountPageElements;
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void editAccountTest() {

        homePageElements = new HomePageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.editAccountButton.click();

        myAccountPageElements.firstNameInput.clear();
        myAccountPageElements.firstNameInput.sendKeys("James");

        myAccountPageElements.lastNameInput.click();
        myAccountPageElements.lastNameInput.sendKeys("Bond");

        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

}
