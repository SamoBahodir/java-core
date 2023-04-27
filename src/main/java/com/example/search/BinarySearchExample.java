package com.example.search;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4,};
        int key = 2;
        System.out.println(binarySearch(arr, key));
    }

    public static int binarySearch(int[] arr, int key) {
        return binarySearch1(arr, 0, arr.length, key);
    }

    private static int binarySearch1(int[] arr, int low, int length, int key) {
        int high = length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}
