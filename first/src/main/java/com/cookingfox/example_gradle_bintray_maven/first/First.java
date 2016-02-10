package com.cookingfox.example_gradle_bintray_maven.first;

import com.cookingfox.example_gradle_bintray_maven.shared.StringUtil;

import java.util.Arrays;

public class First {

    public static final String EXAMPLE_SEPARATOR = "/";

    public String example(String prefix, String[] args) {
        return prefix + ": " + StringUtil.join(Arrays.asList(args), EXAMPLE_SEPARATOR);
    }

}
