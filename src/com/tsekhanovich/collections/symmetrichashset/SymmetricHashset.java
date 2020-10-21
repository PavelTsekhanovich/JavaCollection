package com.tsekhanovich.collections.symmetrichashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Tsekhanovich 26/10/2018
 * <p>
 * Symmetrical difference
 * https://en.wikipedia.org/wiki/Symmetric_difference﻿
 * <p>
 * 1.Find Symmetrical difference of sets on symDifference(Set<T> set1, Set<T> set2) and return it.
 * ﻿* For example ﻿sets:{1 2 3 4} {3 4 5 6} --> Symmetrical difference = ﻿{1 2 5 6}
 */

public class SymmetricHashset {

    public static void main(String[] args) {
        Set<Integer> theFirstSet = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> theSecondSet = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> resultSet = symDifference(theFirstSet, theSecondSet);
        resultSet.forEach(System.out::println);
    }

    private static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        set1.addAll(set2);
        set1.removeAll(intersection);
        return set1;
    }

}
