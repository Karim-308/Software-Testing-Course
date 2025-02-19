package org.example;

public class ClassToTest {

    public int arrayCount9(int[] nums) {
        // Returns the number of 9's in the array
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public int intMax(int a, int b, int c) {
        // Returns the largest of three ints
        return Math.max(a, Math.max(b, c));
    }
}
