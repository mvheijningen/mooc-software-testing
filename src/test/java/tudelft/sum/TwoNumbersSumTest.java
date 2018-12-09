package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumbersSumTest {

    private TwoNumbersSum sum;

    @BeforeEach
    public void initialize() {
        this.sum = new TwoNumbersSum();
    }

    @Test
    public void addTwoSingeleDigits() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3));
        List<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(Arrays.asList(5), result);
    }

    @Test
    public void addTwoSingeleDigitsGreaterThanFive() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5));
        List<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(Arrays.asList(1, 2), result);
    }

    @Test
    public void addTwoDoubleDigits() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 1));
        List<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(Arrays.asList(2, 2), result);
    }

    @Test
    public void addTwoDoubleDigitsGreaterThanFive() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 7));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 5));
        List<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(Arrays.asList(3, 2), result);
    }

    @Test
    public void addSingeleDigitAndNoDigit() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> second = new ArrayList<>();
        List<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(Arrays.asList(7), result);
    }

    @Test
    public void addTwoNoDigits() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        List<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(new ArrayList<Integer>(), result);
    }

}
