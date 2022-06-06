package TestNG;

import org.junit.Ignore;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
    //create one methode that teks two parrameters and return multipl

    public double getMultiplication(double n1, double n2) {
        return n1 * n2;
    }


    @Test
    public void validationMultiplication() {
        double result = getMultiplication(5, 6);
        double ExpectedResult = 30;
        Assert.assertEquals(result, ExpectedResult, "my numbers is 5 and 6");
    }


    public double getDivision(double num4, double num5) {
        if (num4 > num5) {
            return num4 / num5;
        }
        return num5 / num4;
    }

    public int getSubstraction(int number1, int number2) {
        if (number1 > number1) {
            return number1-number2;
        }
        return number2-number1;
    }
    @Test
    public void validateDivision() {
        double actualResult = getDivision(8, 2);
        double expectedResult = 4;
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("Ignored");
    }

    @Test
    public void validateSubstraction(){
        int actualResult1 = getSubstraction(65,43);
        int expectedResult1 = -22;
        Assert.assertEquals(actualResult1,expectedResult1);
    }
}

