import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTests {

    @Test
    public void test0001() {
        Car myCar1 = new Car("blue", "Toyota", "Corolla", 180);
        Car myCar2 = new Car("blue", "Toyota", "Camry", 180);

        Assert.assertEquals(myCar1.getMaxSpeed(), 180);

        Car[] garage = new Car[]{myCar1, myCar2};

        int garageSize = garage.length;

        Assert.assertEquals(garageSize, 2);
    }
}
