import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
    }
    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;

        Assert.assertTrue(!x.equals(y));// 1/2, 1/4 fasle
    }
    @Test
    public void testEquals2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;

        Assert.assertTrue(x.equals(y));// 1/2, 2/4 True
    }
    @Test
    public void testEquals3() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = -2;
        y.denominator = 4;

        Assert.assertTrue(!x.equals(y));// 1/2, - 2/4 False
    }
    @Test
    public void testEquals4() {
        Rational x = new Rational();
        x.numerator = -1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = -2;
        y.denominator = 4;

        Assert.assertTrue(x.equals(y));// -1/2, - 2/4 True
    }
    @Test
    public void testCompareTo(){
        Rational x = new Rational(); // 1/2
        Rational y = new Rational(); // 1/4
        x.numerator = 1;
        x.denominator = 2;
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertEquals(1, x.compareTo(y));  //Greater
    }
    @Test
    public void testCompareTo2(){
        Rational x = new Rational(); // 12/24
        Rational y = new Rational(); // 1/1
        x.numerator = 12;
        x.denominator = 24;
        y.numerator = 1;
        y.denominator = 1;
        Assert.assertEquals(-1, x.compareTo(y));  //Less
    }
    @Test
    public void testCompareTo3(){
        Rational x = new Rational(); // 24/24
        Rational y = new Rational(); // 1/1
        x.numerator = 24;
        x.denominator = 24;
        y.numerator = 1;
        y.denominator = 1;
        Assert.assertEquals(0, x.compareTo(y));  //Equal
    }
    @Test
    public void testToString(){
        Rational x = new Rational(); // 12/24
        x.numerator = 12;
        x.denominator = 24;
        Assert.assertEquals("12/24", x.toString());
    }
}
