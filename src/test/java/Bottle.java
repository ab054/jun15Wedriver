//TODO: create your own classes
public class Bottle {

    int temperature;
    String shape;
    boolean isBroken;
    boolean empty;
    String color;
    String material;
    float volume;
    String filledUpWith;

    //TODO: more constructors
    public Bottle(boolean isBroken, boolean empty, String material) {
        this.isBroken = isBroken;
        this.empty = empty;
        this.material = material;

        temperature = 30;
        color = "transparent";
        shape = "standard";
        volume = 3.4f;
    }

    void fillItWith(String liquidName) {
        filledUpWith = liquidName;
    }
}
