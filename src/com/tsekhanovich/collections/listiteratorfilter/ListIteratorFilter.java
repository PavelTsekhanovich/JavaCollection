package com.tsekhanovich.collections.listiteratorfilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Pavel Tsekhanovich 25/10/2018
 * <p>
 * Given string as "JButton Button JMenu..." to stdin of your programm
 * 1.Add all elements from this string to List<String>
 * 2.Next, using ListIterator remove all items not starting with J
 * and items beginning with J replace with the same elements but without the J ,for example JFrame -> Frame
 * 3.next, print all the remaining elements in reverse order(using .println())
 * <p>
 * ImageButton JTextField JTextArea CheckBox JMenu
 */

public class ListIteratorFilter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
        ListIterator<String> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            String currentItem = listIterator.previous();
            if (currentItem.startsWith("J")) {
                listIterator.set(currentItem.substring(1));
                System.out.println(currentItem.substring(1));
            } else {
                listIterator.remove();
            }
        }
    }
}
