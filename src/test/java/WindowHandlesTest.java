import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;

public class WindowHandlesTest {

    private static final String WINDOWS_URL = "https://the-internet.herokuapp.com/windows";
    private final By h3headerXpath = By.xpath("/html/body/div/h3");
    WebDriver driver;
    private Set<String> windowHandles;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win64/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

    //TODO: create a different scenario or automate similar multi-window test in different application
    @Test
    public void test002() {

    }

    //1. Start the browser
    //2. Go to page
    //3. Click on "Click Here" link
    //4. Check the amount of windows is 2
    //5. Check title on the second window
    //6. Verify info
    @Test
    public void test001() throws InterruptedException {
        goToWindowHandlesPage();
        clickOnLink();
        waitForAmountOfWindows(2); //wait until amount of windows is 2
        Assert.assertEquals(getAmountOfWindows(), 2, ErrorAssertionMessages.AMOUNT_OF_WINDOWS);
        switchToNewWindow();
        waitForElement(h3headerXpath);
        Assert.assertEquals(driver.getTitle(), "New Window");
        Assert.assertTrue(isTextPresented("New Window"), ErrorAssertionMessages.NO_TEXT);
    }

    @Test
    public void test003() throws InterruptedException {
        int expectedAmountOfWindows = 3;

        goToWindowHandlesPage();
        clickOnLink();
        clickOnLink();
        waitForAmountOfWindows(expectedAmountOfWindows);
        Assert.assertEquals(getAmountOfWindows(), expectedAmountOfWindows, ErrorAssertionMessages.AMOUNT_OF_WINDOWS);
        boolean windowFound = switchWindowWithTitle("New Window");
        Assert.assertTrue(windowFound);
        waitForElement(h3headerXpath);
        Assert.assertEquals(driver.getTitle(), "New Window");
        Assert.assertTrue(isTextPresented("New Window"), ErrorAssertionMessages.NO_TEXT);
    }

    void waitForElement(By elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    private void waitForAmountOfWindows(final int requiredAmount) {
        int timeOutValue = 20;
        WebDriverWait wait = new WebDriverWait(driver, timeOutValue);
        wait.until(driver -> driver.getWindowHandles().size() == requiredAmount);
    }

    private boolean isTextPresented(String textToBePresented) {
        String pageSource = driver.getPageSource();
        return pageSource.contains(textToBePresented);
    }

    private void switchToFirstWindow() {
        windowHandles = driver.getWindowHandles();
        String firstWindowHandle = windowHandles.toArray(new String[]{})[0];
        driver.switchTo().window(firstWindowHandle);
    }

    private boolean switchWindowWithTitle(String requiredTitle) throws InterruptedException {
        windowHandles = driver.getWindowHandles();

        for (String eachHandle : windowHandles) {
            sleep(1000);
            driver.switchTo().window(eachHandle);
            if (driver.getTitle().equalsIgnoreCase(requiredTitle)) {
                return true;
            }
        }

        return false;
    }

    private void switchToNewWindow() {
        windowHandles = driver.getWindowHandles();
        String[] arrayOfHandles = windowHandles.toArray(new String[]{});
        int indexOfLastElement = arrayOfHandles.length - 1;
        String lastHandle = arrayOfHandles[indexOfLastElement];
        driver.switchTo().window(lastHandle);
    }

    private int getAmountOfWindows() {
        windowHandles = driver.getWindowHandles();
        return windowHandles.size();
    }

    private void clickOnLink() {
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();
    }

    private void goToWindowHandlesPage() {
        driver.get(WINDOWS_URL);
    }


}
