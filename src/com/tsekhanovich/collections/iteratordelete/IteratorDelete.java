package com.tsekhanovich.collections.iteratordelete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Pavel Tsekhanovich 24/10/2018
 *
 * Using BufferedReader read one string with numbers written across the space ("1 2 3 4 5 ...").
 * Put this numbers to any Collection of Integers.Sort this collection!
 * Using Iterator remove all even annoying numbers(death for elem%2=0 !) from your Collection
 * Print all remaining elements to console (use System.out.println() method)
 *
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35
 */

public class IteratorDelete {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String lineOfNumbers = reader.readLine();
        Arrays.stream(lineOfNumbers.split(" "))
                .map(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }
}
