package _CodingBatExcercises;

import java.util.Arrays;

public class Arrays1 {
    /**
     * Given an array of ints, return true if 6 appears as either the first
     * or last element in the array. The array will be length 1 or more.
     * @param nums - name of array of integers
     * @return true if first or last element of nums[] is 6
     */
    public static boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length - 1] == 6);
    }

    /**
     *
     * @param nums - array of integers of even length
     * @return - a new array[2] that contains 2 elements from the middle of nums
     */
    public static int[] makeMiddle(int[] nums) {
        int[] arr = {0, 0};
        arr[0] = nums[nums.length/2 - 1];
        arr[1] = nums[nums.length/2];
        return arr;
    }

    /**
     * Given an array of ints of odd length, return a new array length 3
     * containing the elements from the middle of the array. The array length will be at least 3.
     * @param nums - array of odd length
     * @return array that contains middle element of nums[] and its neighbours in the same order
     * as they are in the original array
     */
    private static int[] midThree(int[] nums){
        int[] ar = {3, 1, 4};
        int[] arr = new int[3];
        int med = nums.length/2 + 1; // index of median element of original array
        arr[0] = nums[med - 2];
        arr[1] = nums[med - 1];
        arr[2] = nums[med];
        return arr;
    }

    /**
     * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
     * @param a array of arbitrary length
     * @param b array of arbitrary length
     * @return how many arrays start with 1
     */
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length !=0)
            if (a[0] == 1)
                count++;
        if (b.length !=0)
            if (b[0] == 1)
                count++;
        return count;
    }

    /**
     * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if
     * the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
     * @param nums
     */
    public static boolean unlucky1(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        else {
            return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
        }

    }

        private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
     * the elements from a followed by the elements from b. The arrays may be any length, including 0,
     * but there will be 2 or more elements available between the 2 arrays.
     * @param a - array of integers
     * @param b - array of integers
     * @return
     */
    public static int[] make2(int[] a, int[] b) {
        int[] output = new int[2];
        if (a.length >=2) {
            output = Arrays.copyOf(a, 2);
        }
        else if (a.length == 1) {
            output = Arrays.copyOf(a, 2);
            output[1] = b[0];
        }
        else {
            output = Arrays.copyOf(b, 2);
        }
        return output;
    }



    /**
     * PLAYGROUND
     */
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1, 3, 7, 4, 9};
        int[] arr3 = {3, 1, 3};
        int[] arr4 = {1, 1, 1, 1, 3};
        System.out.println(unlucky1(arr1));
        System.out.println(unlucky1(arr2));
        System.out.println(unlucky1(arr3));
        System.out.println(unlucky1(arr4));
    }

}
