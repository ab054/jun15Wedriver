import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTests {

    private static final String MAIN_PAGE_URL = "https://www.google.com/";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win64/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    //TODO: finish last step
    //1. open main page
    //2. type query
    //3. submit query
    //4. verify the results page
    @Test
    public void test001() {
        openMainPage();
        typeQuery("Portnov Computer School");
        submitQuery();
    }

    private void submitQuery() {
        driver.findElement(By.name("q")).submit();
    }

    private void typeQuery(String queryParameter) {
        WebElement queryInput = driver.findElement(By.name("q"));
        queryInput.sendKeys(queryParameter);
    }

    private void openMainPage() {
        driver.get(MAIN_PAGE_URL);
    }
}
