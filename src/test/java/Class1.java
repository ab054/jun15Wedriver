import org.testng.annotations.Test;

public class Class1 {

    @Test
    public void testMyFirstTest(){
        System.out.println("Hello, World!");
    }

    @Test
    public void testIntegers() {
        int myNumber = 5;

        int secondNumber = 6;

        System.out.println(myNumber + secondNumber);
    }

    @Test
    public void testStrings() {
        String myMessage = "Please print this in console";
        String andAnotherMessage = " and this too";


        System.out.println(myMessage + andAnotherMessage);

    }

    @Test
    public void testErrorMessage() {
        String staticPart = "I clicked ";
        int howManyTimes = 7;
        String restOfMessage = " times and nothing happened";

        System.out.println(staticPart + howManyTimes + restOfMessage);

    }

    @Test
    public void testBooleans() {
        boolean b;
        boolean toBe = false;

        b = toBe || !toBe;


        if (b) {
            System.out.println("B is always TRUE");
        }
    }

    @Test
    public void testBooleanExample() {
        boolean elementIsVisible = true;
        boolean elementIsClickable = false;

        String action = "Clicked";

        if(elementIsVisible && elementIsClickable){
            System.out.println(action);
            System.out.println("Button was clicked");
        } else {
            System.out.println("Element is not there or not ready to be clicked");
        }
    }

    @Test
    public void testArrays() {
        int[] array = new int[10];

        array[0] = 123;
        array[1] = 467;
        array[4] = 556;

        System.out.println(array[0]);
    }

    @Test
    public void testArraysString() {
        String[] arrayOfStrings = {
                "firstStringValue",
                "secondStringValue",
                "firstStringValue",
                "firstStringValue"
        };

        printAllMembers(arrayOfStrings);
        printAllMembers2(arrayOfStrings);
    }

    @Test
    public void testArraysString002() {
        String[] arrayOfStrings = {
                "adfasd",
                "adsfasd",
                "asdfas",
                "asdfasdfsadfasdfas"
        };

        printAllMembers(arrayOfStrings);
        printAllMembers2(arrayOfStrings);
    }

    public void printAllMembers(String[] inputParameter){
        for(String eachString : inputParameter){
            System.out.println("element #:" +  eachString);
        }
    }

    public void printAllMembers2(String[] input){
        for(int i = 0; i < input.length; i++){
            System.out.println("element #" + i + ": " +input[i]);
        }
    }






}
