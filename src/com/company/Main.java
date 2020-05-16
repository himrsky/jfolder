package com.company;

import java.util.HashMap;

public class Main {
//0,1,1,2,3,5,8
    public static void main(String[] args) {
        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<10;i++){

            int temp=first+second;
            System.out.println(temp);
            first=second;
            second=temp;
        }

     }
}
