package Test;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _03_AddressBookFunction extends BaseDriver {

    HomePageElements homePageElements;
    MyAccountPageElements myAccountPageElements;
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test (priority = 1)
    public void addNewAddressTest() {

        homePageElements = new HomePageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.addressBookButton.click();
        myAccountPageElements.newAddressButton.click();

        myAccountPageElements.firstNameInput.sendKeys("Arya");
        myAccountPageElements.lastNameInput.sendKeys("Stark");
        myAccountPageElements.address1Input.sendKeys("200 Winterfell Road");
        myAccountPageElements.cityInput.sendKeys("North");
        myAccountPageElements.postcodeInput.sendKeys("22222");

        Select selectCountry = new Select(myAccountPageElements.countryDropdown);
        selectCountry.selectByVisibleText("United States");

        Select selectState = new Select(myAccountPageElements.stateDropdown);
        selectState.selectByVisibleText("New York");

//        myAccountPageElements.radioButton_Yes.click();

        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

    @Test (priority = 2)
    public void editAddressTest() {

        homePageElements = new HomePageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.addressBookButton.click();
        myAccountPageElements.editAddressButton.click();

        myAccountPageElements.address1Input.clear();
        myAccountPageElements.address1Input.sendKeys("450 Winterfell road");

        myAccountPageElements.postcodeInput.clear();
        myAccountPageElements.postcodeInput.sendKeys("98765");

        myAccountPageElements.continueButton.clear();

        reusableMethods.verifySuccessMessage(driver);
    }

    @Test (dependsOnMethods = "editAddressTest")
    public void deleteAddress() {

        homePageElements = new HomePageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.addressBookButton.click();
        myAccountPageElements.deleteAddressButton.click();

        reusableMethods.verifySuccessMessage(driver);
    }
}
