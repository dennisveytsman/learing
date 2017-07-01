
import org.junit.Assert;
import org.junit.Test;

public class Homework4bTest {
    @Test
    public void testMax() {
        //camelCase
        int maxNumber = Homework4b.max(3, 4);
        Assert.assertEquals(4, maxNumber); //automaticly checks if expexted value equals actual value
    }
}
//