import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownListTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win64/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    //TODO: find a different way of interacting with dropdown lists
    @Test
    public void test002() {

    }

    //TODO: write a different scenario
    //1. open page
    //2. select option 1
    //3. verify that option 1 is selected
    @Test
    public void test001() {
        openDropDownPage();
        selectOptionOne();
        boolean isOptionOneSelected = getOptionOneSelectedAttr();

        Assert.assertTrue(isOptionOneSelected, "Option 1 was NOT selected");
    }

    private void openDropDownPage() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    private boolean getOptionOneSelectedAttr() {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        List<WebElement> elementList = dropdown.findElements(By.tagName("option"));
        boolean isOptionOneSelected = elementList.get(1).isSelected();

        return isOptionOneSelected;
    }

    private void selectOptionOne() {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        List<WebElement> elementList = dropdown.findElements(By.tagName("option"));
        for (WebElement eachElement : elementList) {
            if (eachElement.getText().equalsIgnoreCase("Option 1")) {
                eachElement.click();
            }
        }
    }

    @AfterMethod
    public void afterEachMethod() {
        driver.quit();
    }
}
