package Utils;

import POM.MyAccountPageElements;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReusableMethods extends BaseDriver {


    public void verifySuccessMessage(WebDriver driver) {
        MyAccountPageElements myAccountPageElements = new MyAccountPageElements(driver);

        String actualMessage = myAccountPageElements.successMessage.getText();
        Assert.assertTrue(actualMessage.toLowerCase().contains("success"));
    }
}
