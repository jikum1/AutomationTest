package com.learn.programs;

public class Pattern {

    public static void main(String[] args) {

        /*
        2
        3 5
        4 6 8
        7 9 11 13
        10 12 14 16 18
         */
        int even = 2, odd =3;
        for(int i=0; i<6; i++){
            for(int j=0;j<=i;j++){
                if(i%2 == 0){
                    System.out.print(even + " ");
                    even = even + 2;
                }else {
                    System.out.print(odd + " ");
                    odd = odd + 2;
                }
            }
            System.out.println();
        }
    }
}
