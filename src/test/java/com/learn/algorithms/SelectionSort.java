package com.learn.algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int num[] = {5,1,2,4,8,0,11,79,81};
        print(sort(num));
    }

    public static void print(int num[]){
        for(int i=0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static int[] sort(int num[]){
        int min;
        for(int i=0 ;i< num.length; i++){
            min = num[i];
            int k = i;
            for(int j=i+1;j< num.length; j++){
                if(min>num[j]){
                    min = num[j];
                    k = j;
                }
            }
            if(k!=i){
                int temp;
                temp = num[i];
                num[i] = num[k];
                num[k] = temp;
            }
        }
        return num;
    }
}
