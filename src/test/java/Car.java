public class Car {

    private final String color;
    private final String make;
    private final String model;
    private final int maxSpeed;


    public Car(String color, String make, String model, int maxSpeed) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
