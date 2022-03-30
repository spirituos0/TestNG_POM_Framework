package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver; // we make it protected to be able to have access from a different class

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser) {

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/spirituos0/Desktop/IT course/drivers/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccBtn = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccBtn.click();

        WebElement loginBtn = driver.findElement(By.linkText("Login"));
        loginBtn.click();

        WebElement usernameInput = driver.findElement(By.id("input-email"));
        usernameInput.sendKeys("spring_water@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("Nikita05");

        WebElement submitLoginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        submitLoginBtn.click();

        WebElement homePageBtn = driver.findElement(By.xpath("//a[text()='Your Store']"));
        homePageBtn.click();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
