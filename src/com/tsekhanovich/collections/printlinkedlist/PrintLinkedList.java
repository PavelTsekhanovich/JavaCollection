package com.tsekhanovich.collections.printlinkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Pavel Tsekhanovich 26/10/2018
 *
 * Given string as this "1 2 3 4 5....". reader read this string.
 * 1.Separate elements with a space from str;
 * 2.add all this numbers to head of Linkedlist;
 * 3.remove 3 times the element at index 0;
 * 4.sort the resulting list in ascending order and print all of its elements each on a new line;
 *
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
 */

public class PrintLinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        LinkedList<Integer> resultList = new LinkedList<>();
        Arrays.stream(str.split(" ")).forEach(number -> resultList.addFirst(Integer.parseInt(number)));
        resultList.subList(0, 3).clear();
        resultList.stream().sorted(Integer::compareTo).forEach(System.out::println);
    }

}
