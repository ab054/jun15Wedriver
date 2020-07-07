import org.testng.Assert;
import org.testng.annotations.Test;

public class BottleTests {

    //TODO: more tests
    @Test
    public void testName() {
        Bottle objectOfBottle = new Bottle(false, true, "glass");
        objectOfBottle.fillItWith("Water");
        boolean isGasolineInBottle = objectOfBottle.filledUpWith == "Gasoline";
        Assert.assertEquals(isGasolineInBottle, true, "Bottle filled up with: " + objectOfBottle.filledUpWith);
        Assert.assertEquals(objectOfBottle.filledUpWith, "Gasoline");
    }
}
