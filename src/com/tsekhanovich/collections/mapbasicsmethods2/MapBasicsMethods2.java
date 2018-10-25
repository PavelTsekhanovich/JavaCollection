package com.tsekhanovich.collections.mapbasicsmethods2;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author Pavel Tsekhanovich 25/10/2018
 * <p>
 * Given an array of strings,
 * - On wordCount() : return a
 * SortedMap<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
 * - On printMap(): Using System.out.println() print all items of the Map ("key : value")
 * <p>
 * a b b c d a b
 */

public class MapBasicsMethods2 {

    public static void main(String[] args) {
        printMap(wordCount(new String[]{"a", "b", "b", "c", "d", "a", "b"}));
    }

    private static SortedMap<String, Integer> wordCount(String[] strings) {
        return new TreeMap<>(Arrays.stream(strings).collect(Collectors.toMap(k -> k, v -> 1, Integer::sum)));
    }

    private static void printMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
