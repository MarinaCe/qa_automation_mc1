package mavenTestNGHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculator {
    int result;

    //Method for addition
    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    //Method for subtraction
    public int substract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    //Method for multiplication
    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    //Method for division
    public float divide(int num1, int num2) {
        result = num1 / num2;
        return result;
    }
}

