import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchTests extends BaseTest {


    //TODO: finish last step
    //1. open main page
    //2. type query
    //3. submit query
    //4. verify the results page
    @Parameters({"queryText"})
    @Test
    public void test001(@Optional String parameterOne) {
        google.mainPage.open();

        if (parameterOne != null) {
            google.mainPage.typeQuery(parameterOne, "dsfsdf");
        } else {
            google.mainPage.typeQuery("Portnov Computer School");
        }

        google.mainPage.submitQuery();
        waitForElement(google.resultsPage.resultsStatsElement);
        String actualResults = google.resultsPage.getResultsText();

        Assert.assertTrue(actualResults.contains("results"));
    }


    @DataProvider(name = "googleSearchData")
    public Object[][] createData1() {
        return getDataForSearch();
    }

    //TODO: convert Excel file into data object and suply that to your test
    private Object[][] getDataForSearch() {
        //API request
        //DataBase queries
        //Xml and Excel sheets //Apache POI

        return null;
    }

    @Test(dataProvider = "googleSearchData")
    public void test0002(String queryParameter) {
        google.mainPage.open();
        google.mainPage.typeQuery(queryParameter);
        google.mainPage.submitQuery();
        waitForElement(google.resultsPage.resultsStatsElement);
        String actualResults = google.resultsPage.getResultsText();

        Assert.assertTrue(actualResults.contains("results"));
    }

    public void waitForElement(By elementToWait) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(driver -> driver.getTitle().equalsIgnoreCase("something"));
    }
}
