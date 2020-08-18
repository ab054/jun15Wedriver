import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import pages.Google;


public class BaseTest {

    WebDriver driver;
    Google google;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win64/geckodriver.exe");
        driver = new FirefoxDriver();
        google = new Google(driver);
    }

    public void waitForElement(By elementToWait) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(driver -> driver.getTitle().equalsIgnoreCase("something"));
    }

}
