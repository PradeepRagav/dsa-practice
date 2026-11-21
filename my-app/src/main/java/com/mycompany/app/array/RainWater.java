package com.mycompany.app.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RainWater {

    public static void main(String[] args) {

        int result = trap(Arrays.asList(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1));
        System.out.println(result);
    }

    public static int trap(final List<Integer> A) {

        int[] rightMax = new int[A.size()];
        int[] leftMax = new int[A.size()];
        // System.out.println(A);
        int max = A.get(0);
        rightMax[0] = 0;
        rightMax[A.size() - 1] = 0;
        for (int index = 1; index < A.size() - 1; index++) {
            if (A.get(index) > max) {
                rightMax[index] = A.get(index);
                max = A.get(index);
            } else {
                rightMax[index] = (max);
            }
        }

        // System.out.println(rightMax);

        max = A.get(A.size() - 1);
        leftMax[0] = 0;
        leftMax[A.size() - 1] = 0;
        for (int index = A.size() - 2; index > 0; index--) {
            if (A.get(index) > max) {
                leftMax[index] = A.get(index);
                max = A.get(index);
            } else {
                leftMax[index] = max;
            }
        }

        // System.out.println(leftMax);

        int result = 0;
        for (int index = 1; index < A.size() - 1; index++) {
            int min = Math.min(rightMax[index], leftMax[index]);
            result += min - A.get(index);
        }

        return result;
    }

}
