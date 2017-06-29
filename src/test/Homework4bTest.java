import org.junit.Assert;
import org.junit.Test;

public class Homework4bTest {
    @Test
    public void testMax() {
        int a,b;
        int o = Homework4b.max(3, 4);
        Assert.assertEquals(4, o);

    }
}
