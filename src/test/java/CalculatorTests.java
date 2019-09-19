import com.michal.tdd.Calculator;
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
        Assert.assertEquals(50, calculator.subtract(100,50));
        Assert.assertEquals(0, calculator.subtract(50,50));
        Assert.assertEquals(-100, calculator.subtract(-50,50));
        Assert.assertEquals(-50, calculator.subtract(-100,-50));
        Assert.assertEquals(0, calculator.subtract(0,0));
    }

    @Test
    public void should_not_substract_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertNotEquals(100, calculator.subtract(50,50));
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

    @Test
    public void should_multiply_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertEquals(50, calculator.multiply(25,2));
        Assert.assertEquals(50, calculator.multiply(2,25));
        Assert.assertEquals(0, calculator.multiply(0,0));
        Assert.assertEquals(0, calculator.multiply(25,0));
        Assert.assertEquals(-50, calculator.multiply(25,-2));
        Assert.assertEquals(10, calculator.multiply(-5,-2));
    }

    @Test
    public void should_not_multiply_two_numbers(){

        //given
        Calculator calculator = new Calculator();

        //then
        Assert.assertNotEquals(100, calculator.multiply(50,50));
    }

    @Test
    public void should_add_all_numbers_from_array(){

        //given
        Calculator calculator = new Calculator();
        int[] numbers = {5,4,3,2,1,0};

        //then
        Assert.assertEquals(15,calculator.add(numbers));
        Assert.assertEquals(0, calculator.add(new int[]{}));
    }

}
