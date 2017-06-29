import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void testSum() { //without "static"
        int sum = MyMath.sum(1, 2);
        Assert.assertEquals(3, sum);
    }

}
