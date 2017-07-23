import org.junit.Test;
import org.junit.Assert;

public class PrimeNumberTest {

    @Test
    public void testPrime() {
        boolean[] crossed = PrimeNumber.generatePrime(10);
        //use Assert.assertEquals to check that numbers: 4, 6, 8, 10 are crossed
        //and 2, 3, 5, 7 are prime (not crossed)
        Assert.assertEquals(true, crossed[4]);
    }

}
