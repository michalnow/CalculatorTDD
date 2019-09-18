import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void should_add_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertEquals(50, calculator.add(25,25));
        Assert.assertEquals(25, calculator.add(25,0));
        Assert.assertEquals(0, calculator.add(-25,25));
        Assert.assertEquals(-50, calculator.add(-25,-25));
        Assert.assertEquals(0, calculator.add(0,0));
    }

    @Test
    public void should_not_add_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertNotEquals(50, calculator.add(50,50));
    }

    @Test
    public void should_substract_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertEquals(50, calculator.substract(100,50));
        Assert.assertEquals(0, calculator.substract(50,50));
        Assert.assertEquals(-100, calculator.substract(-50,50));
        Assert.assertEquals(-50, calculator.substract(-100,-50));
        Assert.assertEquals(0, calculator.substract(0,0));
    }

    @Test
    public void should_not_substract_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertNotEquals(100, calculator.substract(50,50));
    }

    @Test
    public void should_divide_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertEquals(2, calculator.divide(100,50),0);
        Assert.assertEquals(50, calculator.divide(100,2),0);
        Assert.assertEquals(-2, calculator.divide(-100,50),0);
        Assert.assertEquals(0, calculator.divide(0,50),0);

    }

    @Test(expected = ArithmeticException.class)
    public void should_not_divide_by_zero(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertNotEquals(2,calculator.divide(100,0));
    }

}
