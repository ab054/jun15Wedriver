package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    private final WebDriver driver;
    public By resultsStatsElement = By.id("result-stats");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResultsText() {
        return driver.findElement(resultsStatsElement).getText();
    }
}
