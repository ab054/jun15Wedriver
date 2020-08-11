package pages;

import org.openqa.selenium.WebDriver;

public class Google {

    public MainPage mainPage;
    public ResultsPage resultsPage;

    public Google(WebDriver driver) {
        mainPage = new MainPage(driver);
        resultsPage = new ResultsPage(driver);
    }
}
