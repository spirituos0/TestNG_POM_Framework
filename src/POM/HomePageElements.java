package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElements {

    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='My Account']")
    public WebElement myAccountIcon;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@id='search']//button")
    public WebElement searchButton;

    // we need to get all the elements, so we should store it inside a List.
    // Otherwise, it'd store only the first element, if we'd store it inside a WebElement
    // @FindAll works like -> driver.findElements()   |   @FindBy works like -> driver.findElement()
    @FindAll({@FindBy(xpath = "//h4")})
    public List<WebElement> searchResultItems;




}
