package com.cookingfox.example_gradle_bintray_maven.shared;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void join_should_return_expected_for_collection_and_default_separator() throws Exception {
        Collection<String> args = Arrays.asList("a", "b", "c");
        String actual = StringUtil.join(args);
        assertEquals("a,b,c", actual);
    }

    @Test
    public void join_should_return_expected_for_collection_and_custom_separator() throws Exception {
        Collection<String> args = Arrays.asList("a", "b", "c");
        String actual = StringUtil.join(args, "|");
        assertEquals("a|b|c", actual);
    }

}
