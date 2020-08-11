package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private static final String MAIN_PAGE_URL = "https://www.google.com/";

    private final WebDriver driver;
    private final By queryInputElement = By.name("q");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(MAIN_PAGE_URL);
    }

    public void typeQuery(String queryParameter) {
        WebElement queryInput = driver.findElement(queryInputElement);
        queryInput.sendKeys(queryParameter);
    }

    public void submitQuery() {
        driver.findElement(queryInputElement).submit();
    }
}
