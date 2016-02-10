package com.cookingfox.example_gradle_bintray_maven.shared;

import java.util.Collection;
import java.util.stream.Collectors;

public class StringUtil {

    public static final String JOIN_DEFAULT_SEPARATOR = ",";

    public static String join(Collection<String> strings) {
        return join(strings, JOIN_DEFAULT_SEPARATOR);
    }

    public static String join(Collection<String> strings, String separator) {
        return strings.stream().collect(Collectors.joining(separator));
    }

}
