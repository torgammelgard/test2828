package se.torgammelgard;

import org.junit.Test;

public class FooTest {

    @Test
    public void testRepeat() {
        String testString = "teststring";
        assert testString.equals(new Foo().repeat(testString));
    }
}
