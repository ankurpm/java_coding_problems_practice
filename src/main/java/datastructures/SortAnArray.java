package datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write several programs that exemplifies different sorting algorithms for arrays.
 * Supplementary, write a program for shuffling arrays.
 */
public class SortAnArray {

    public static void main(String[] args) {

        int[] myArr = {6,3,23,54,7,64,2,44,676,75,343,52,7,67,32,4,1,5,3,6,75,3,67,2,4,23,545,767,8,6,745,534,545776,8,5453,3};
        System.out.println(myArr.length);

        List<Integer> myList = Arrays.stream(myArr)
                .filter(i -> i%2==0)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println(myList);


    }
}
