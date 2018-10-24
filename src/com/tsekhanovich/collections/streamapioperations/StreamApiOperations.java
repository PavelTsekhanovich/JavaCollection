package com.tsekhanovich.collections.streamapioperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pavel Tsekhanovich 24/10/2018
 *
 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
 * ["a", "bbb", "cccc", "dddddd"] → ["a", "bbb"]
 *
 * its no long string
 */

public class StreamApiOperations {

    public static void main(String[] args) {
        noLongString(Arrays.asList("its", "no", "long", "string")).forEach(System.out::println);
    }

    private static List<String> noLongString(List<String> strings) {
        return strings.stream().filter(e -> e.length() < 4).collect(Collectors.toList());
    }
}
