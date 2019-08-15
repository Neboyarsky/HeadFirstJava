package _CodingBatExcercises;

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
     * PLAYGROUND
     */
    public static void main(String[] args) {
        int[] arr1 = {6, 2, 1};
        int[] arr2 = {1, 2, 7, 4, 9};
        int[] arr3 = {2, 8, 3, 18, 20};
        printArray(midThree(arr1));
        printArray(midThree(arr2));
        printArray(midThree(arr3));
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
