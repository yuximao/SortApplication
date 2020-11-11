package com.example.sortapplication;

public class BinarySearch {
    public String search(int[] array, int key) {
        return Integer.toString(binSearch(array, 0, array.length, key));
//        return Integer.toString(binSearch(array,key));
    }

    //time O(log n)

    //Space O(log n)
    // with recursion
    public static int binSearch(int[] srcArray, int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }

    //Space O(1)
    // without recursion
    public static int binSearch(int srcArray[], int key) {
        int mid;
        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
