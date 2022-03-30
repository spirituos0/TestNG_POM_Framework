package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.channels.WritableByteChannel;

public class MyAccountPageElements {

    public MyAccountPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Newsletter']")
    public WebElement newsletterBtn;

    @FindBy(xpath = "(//input[@name='newsletter'])[1]")
    public WebElement subscribeNewsletterButton;

    @FindBy(xpath = "(//input[@name='newsletter'])[2]")
    public WebElement unsubscribeNewsletterButton;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[text()='Edit Account']")
    public WebElement editAccountButton;

    @FindBy(id = "input-firstname")
    public WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    public WebElement lastNameInput;

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement addressBookButton;

    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement newAddressButton;

    @FindBy(id = "input-address-1")
    public WebElement address1Input;

    @FindBy(id = "input-city")
    public WebElement cityInput;

    @FindBy(id = "input-postcode")
    public WebElement postcodeInput;

    @FindBy(id = "input-country")
    public WebElement countryDropdown;

    @FindBy(id = "input-zone")
    public WebElement stateDropdown;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement radioButton_Yes;

    @FindBy(xpath = "(//a[text()='Edit'])[2]")
    public WebElement editAddressButton;

    @FindBy(xpath = "(//a[text()='Delete'])[2]")
    public WebElement deleteAddressButton;

}
