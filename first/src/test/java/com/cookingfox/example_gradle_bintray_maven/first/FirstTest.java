package com.cookingfox.example_gradle_bintray_maven.first;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {

    private First first;

    @Before
    public void setUp() throws Exception {
        first = new First();
    }

    @Test
    public void example_should_return_expected() throws Exception {
        String prefix = "Foo";
        String[] args = new String[]{"a", "b", "c"};
        String expected = "Foo: a/b/c";
        String actual = first.example(prefix, args);
        assertEquals(expected, actual);
    }

}
