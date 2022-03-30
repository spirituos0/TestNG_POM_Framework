package Test;

import POM.HomePageElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunction extends BaseDriver {

    HomePageElements homePageElements;
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void searchFunctionTest() {

        homePageElements = new HomePageElements(driver);

        String searchData = "mac";
        homePageElements.searchInput.sendKeys(searchData);
        homePageElements.searchButton.click();

        List<WebElement> searchResults = homePageElements.searchResultItems;

        for (WebElement element : searchResults) {
            String elementName = element.getText();
            System.out.println(elementName);
            Assert.assertTrue(elementName.toLowerCase().contains(searchData));
        }

    }
}
