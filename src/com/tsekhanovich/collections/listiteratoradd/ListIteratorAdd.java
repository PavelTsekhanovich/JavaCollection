package com.tsekhanovich.collections.listiteratoradd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * @author Pavel Tsekhanovich 24/10/2018
 *
 * 1.Using ListIterator iterate over the elements of list from the beginning to the end and after each word "Hip" add "Hop"
 * 2.Using ListIterator print the all elements(using .println())
 *
 * Iterator Hip Hoi Hap Iterator Hip Hi
 */

public class ListIteratorAdd {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("Hip")) {
                listIterator.add("Hop");
            }
        }
        list.forEach(System.out::println);
    }

}
