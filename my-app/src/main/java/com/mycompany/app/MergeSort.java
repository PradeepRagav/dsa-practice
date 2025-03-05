package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {


    public static List<Integer> merge(List<Integer> arrayOne, List<Integer> arrayTwo) {
        int i = 0;
        int j = 0;
        List<Integer> merged = new ArrayList<>();
        while (i < arrayOne.size() && j < arrayTwo.size()) {
            if (arrayOne.get(i) < arrayTwo.get(j)) {
                merged.add(arrayOne.get(i));
                i++;
            } else {
                merged.add(arrayTwo.get(j));
                j++;
            }
        }

        while (i < arrayOne.size()) {
            merged.add(arrayOne.get(i));
            i++;
        }

        while (j < arrayTwo.size()) {
            merged.add(arrayTwo.get(j));
            j++;
        }
        return merged;
    }

    public static List<Integer> sort(List<Integer> array) {
        if(array.size() == 1) {
            return array;
        }
        int start = 0;
        int end = array.size();
        int mid = (start + end) / 2;
        return merge(sort(array.subList(start, mid)), sort(array.subList(mid, end)));
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[] {9,9,1,6,3,1,3,7,7,9};
        System.out.println(sort(Arrays.asList(arr)));
    }
}
