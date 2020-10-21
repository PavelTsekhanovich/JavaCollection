package com.tsekhanovich.collections.treesetfromseveraltoone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author Pavel Tsekhanovich 24/10/2018
 * <p>
 * Additional code,Soldier!
 * Given one input string as "1 2 3 4 5;6 7 8 9 10;11 12 13 14 15"(it's 3 lists)
 * 1.String[] sets consists of these lists. Add all elements from each list to correct set(see the comments in the code) sets[0] = {"1 2 3 4 5"} - its string and so on
 * *use split(" ") to separate elements from string
 * 2.On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
 * 1)In each Set find the maximum element
 * 2)create TreeSet, add the resulting elements to TreeSet
 * 3)return this TreeSet with elements sorted in descending order:
 *           *you can use special method from class TreeSet or rather NavigableSet interface to change the order of storage on the reverse
 * 3.Using System.out.println() print elements of resultTreeSet
 */

public class TreesetFromSeveralToOne {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1 = createSet(sets[0]);
        Set<Integer> set2 = createSet(sets[1]);
        Set<Integer> set3 = createSet(sets[2]);

        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);

        resultTreeSet.forEach(System.out::println);
    }

    private static Set<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        return new TreeSet<>(Arrays.asList(Collections.max(set1), Collections.max(set2), Collections.max(set3))).descendingSet();
    }

    private static Set<Integer> createSet(String elements) {
        return Arrays.stream(elements.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
    }

}
