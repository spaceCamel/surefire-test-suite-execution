package example;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import util.PartOfSuite;

@Category(PartOfSuite.class)
public class TestA
{
    @Test
    public void test()
    {
        System.out.println("=== RUN " + this.getClass());
    }
}
