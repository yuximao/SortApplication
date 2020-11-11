package com.example.sortapplication;

import java.util.Arrays;

public class BubbleSort {
    public String bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i; j<array.length;j++){
                if(array[i]>array[j]){
                    int tmp = 0;
                    tmp= array[i];
                    array[i]=array[j];
                    array[j]= tmp;
                }
            }
        }
        return Arrays.toString(array);
    }
}
