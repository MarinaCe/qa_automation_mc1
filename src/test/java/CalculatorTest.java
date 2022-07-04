import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        CalculatorClass calculator = new CalculatorClass();
        calculator.sum(10.00, 25.00);
        Assert.assertEquals(calculator.sum(10.00, 25.00), 35.00);
    }

    public void subtract() {
        CalculatorClass calculator = new CalculatorClass();
        calculator.subtract(25, 10);
        Assert.assertEquals(calculator.subtract(25, 10), 35);

    }
}
