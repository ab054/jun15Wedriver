import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests extends BaseTest {


    //TODO: finish last step
    //1. open main page
    //2. type query
    //3. submit query
    //4. verify the results page
    @Test
    public void test001() {
        google.mainPage.open();
        google.mainPage.typeQuery("Portnov Computer School");
        google.mainPage.submitQuery();

        waitForElement(google.resultsPage.resultsStatsElement);
        String actualResults = google.resultsPage.getResultsText();

        Assert.assertTrue(actualResults.contains("results"));
    }
}
