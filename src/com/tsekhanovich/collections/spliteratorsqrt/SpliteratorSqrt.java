package com.tsekhanovich.collections.spliteratorsqrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pavel Tsekhanovich 26/10/2018
 * <p>
 * On spliteratorWork( List<Double> lst ):
 * - using Spliterator add to List<Double> sqrts all square roots of items from lst ,if this item greater than 1
 * - use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
 * On print(List<Double> list):
 * - get spliterator() of given list
 * - divide spliterator into 2 parts ( use spliterator.trySplit())
 * - print all items which >=2 from first part (use .println())
 * - print empty string
 * - print all items which >=10 from second part (use .println())
 * <p>
 * 4 4 4 100 100 100
 */

public class SpliteratorSqrt {

    public static void main(String[] args) {
        print(spliteratorWork(Arrays.asList(4.0, 4.0, 4.0, 100.0, 100.0, 100.0)));
    }

    private static List<Double> spliteratorWork(List<Double> lst) {
        List<Double> sqrs = new ArrayList<>();
        lst.spliterator().forEachRemaining(e -> sqrs.add(Math.sqrt(e)));
        return sqrs;
    }

    private static void print(List<Double> list) {
        list.spliterator().trySplit().forEachRemaining(e -> {
            if (e >= 2) System.out.println(e);
        });
        System.out.println();
        list.spliterator().forEachRemaining(e -> {
            if (e >= 10) System.out.println(e);
        });
    }
}
