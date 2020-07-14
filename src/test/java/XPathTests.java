import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XPathTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win64/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testName() {
        String absXpath = "/html/body/div[6]/div[2]/div[3]/div/div/div[1]/div/div/div[1]/div/div[5]/a";
        String relativeXpath = "//div[1]/div/div/div[1]/div/div[5]/a";

        String xpath1 = "//*[@type='password']";
        String xpath2 = "//*[@type='password'][@id='password']";
        String xpath3 = "//*[@type='password' and @id='password']";
        String xpath4 = "//*[@type='password' or @id='password']";
        String xpath5 = "//*[contains(@class,'pagination')]";
        String xpath6 = "//*[starts-with(@class,'pagination')]";
        String xpath7 = "//*[text()=' Login']";

        String xpath8 = "//input[@type='text'][last()]";
        String xpath9 = "//input[@type='text'][2]";
        String xpath10 = "//*[@id='FirstName']/following::input[@type='text']";
        String xpath11 = "//*[@id='LastName']//preceding::input[@type='text']";
        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println(driver.getTitle());
    }
}
