import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CodeEx {

    //1. Loop
    //2. return even number (print them)
    //3. number should be from 1 to 10
    //4. how to filter ONLY even numbers???:
        //4.a need to find a reminder
        //4.b compare reminder with 0
        //4.c only EVEN number will have 0 as a reminder after division by 2
    @Test
    public void test0001() {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        solution(input);
    }

    @Test
    public void test0002() {
        int[] input = {0};
        solution(input);
    }

    @Test
    public void test0003() {
        int[] input = {0,2};
        solution2(input);
    }

    private void solution(int[] arrayParameter) {
        for(int eachMember : arrayParameter){
            int reminder = eachMember % 2; // 3 / 2 = 1.5 (1)
            if(reminder == 0) System.out.println(eachMember);
        }
    }

    private void solution2(int[] arrayParameter) {
        for(int eachMember : arrayParameter){
            int reminder = eachMember % 2; // 3 / 2 = 1.5 (1)
            if(reminder == 0) System.out.println("Hello World");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void swapTwoNumbersInArray_2() {
        int[] array = {1,2,3,4};
        int param1 = 3;
        int param2 = 3;

        swap(array, param1, param2);
        System.out.println(Arrays.toString(array));
    }

    private void swap(int[] array, int indexLeft, int indexRight) {
        int temp = array[indexLeft];
        array[indexLeft] = array[indexRight];
        array[indexRight] = temp;
    }

    @Test
    public void testCountLetters() {
        String input = "hello world lll";
        char parameter = 'l';
        int actualValue = getAmountOfLetters(input, parameter);
        int expectedValue = 6;

        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testCountLetters_2() {
        String input = "hello world lll";
        char parameter = 'e';

        int actualValue = getAmountOfLetters(input, parameter);
        int expectedValue = 1;

        Assert.assertEquals(actualValue, expectedValue);
    }

    private int getAmountOfLetters(String input, char parameter) {
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== parameter) result++;
        }

        return result;
    }

}
