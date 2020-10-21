package com.tsekhanovich.collections.filterhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Pavel Tsekhanovich 24/10/2018
 * <p>
 * Additional code,son!
 * 1.Given a string as "1 2 3 4 5 6 ..." . String[] strings contains of element from given string ("1","2",..).
 * Add all elements from String[] strings to Set<Integer> set.
 * 2.Add all the elements from helpList to set. (getList is defined)
 * 3.Using Iterator remove/filter(Stream API)/"method-of-all-collections" all elements greater than 10(>) from set and return modified set.
 */

public class FilterHashset {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");
        List<Integer> helpList = getList();
        Set<Integer> set = new HashSet<>(helpList);
        Stream.of(strings).map(Integer::valueOf).forEach(set::add);
        set.addAll(helpList);
        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    private static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        return set.stream()
                .filter(i -> i <= 10)
                .collect(Collectors.toSet());
    }

    private static List<Integer> getList() {
        return new ArrayList<>();
    }

}
