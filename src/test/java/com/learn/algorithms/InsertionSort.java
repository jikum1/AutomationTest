package com.learn.algorithms;

public class InsertionSort {

    public static void main(String[] args) {
        int num[] = {5,1,2,4,8,0,15,14};
        print(sort(num));
        System.out.println();
        print(sortEffecient(num));
    }

    public static void print(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static int[] sort(int num[]) {
        for(int i=1;i<num.length; i++){
            for(int j=0; j<i; j++){
                int temp = num[i];
                if(num[j] > num[i]){
                    for(int k=i; k>j; k--){
                        num[k] = num[k-1];
                    }
                    num[j] = temp;
                }

            }

        }
        return num;
    }

    public static int[] sortEffecient(int num[]){
        int key;
        //Take iteration from 1 consider first element sorted
        for(int i=1; i< num.length; i++){
            key = num[i];
            // Take j less take and iterative backward and compare till condition is not satisfied
            int j = i-1;
            while(j>=0 && num[j]>key){
                num[j+1] = num[j];
                j--;
            }
            //j is decremented to come out of the loop, increment and place the key
            num[j+1] = key;
        }
        return num;
    }
}

