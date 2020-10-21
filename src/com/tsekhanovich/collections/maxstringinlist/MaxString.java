package com.tsekhanovich.collections.maxstringinlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pavel Tsekhanovich 25/10/2018
 * <p>
 * On static List<String> changeList(List<String> list) method you must do:
 * - find the longest string in list
 * -if you use method max of class Collections : don't forget to implement a comparator for this method
 *    Collections.max(list, (s1,s2)->{...})
 *    by default, this method compares strings alphabetically!
 * - of course you can use other approaches(for example comparison in a for-loop)
 * - replace all list items with this row
 * - return modified list
 */

public class MaxString {

    public static void main(String[] args) {
        changeList(Arrays.asList("hi", "hello", "goodmorning", "com"))
                .forEach(System.out::println);
    }

    public static List<String> changeList(List<String> list) {
        return list.stream()
                .map(s -> s = Collections.max(list, Comparator.comparingInt(String::length)))
                .collect(Collectors.toList());
    }
}
