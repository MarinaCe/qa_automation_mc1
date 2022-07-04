package mavenTestNGHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;
    ChromeDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Test has been started");
    }
    @Test
    public void Add() {
        calculator.add(10, 20);
        Assert.assertEquals(calculator.add(10, 20), 30);
        System.out.println("Test Add");
    }

    @Test
    public void Substract() {
        calculator.substract(20, 10);
        Assert.assertEquals(calculator.substract(20, 10), 10);
        System.out.println("Test Substract");
    }
    @Test
    public void Divide() {
        calculator.divide(30, 2);
        Assert.assertEquals(calculator.divide(30, 2), 15);
        System.out.println("Test Divide");
    }
    @Test
    public void Multiply() {
        calculator.multiply(2, 3);
        Assert.assertEquals(calculator.multiply(2, 3), 6);
        System.out.println("Test Multiply");
    }
    @AfterMethod(alwaysRun = true)
    public void AfterMethod() {
        System.out.println("Test has been closed");
    }


    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        this.driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");

    }
    @Test
    public void chromeDriverTest() {
        driver.get("https://www.1a.lv/");
        Assert.assertEquals(driver.getTitle(), "1a");
        ChromeDriver driver = new ChromeDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
    }


}
