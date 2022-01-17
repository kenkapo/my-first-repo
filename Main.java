package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [] arr={5,3,6,7,2};
        int start=0;
        int end=0;
        int sum=0;
        for (int i=start;i<=end-1;i++)
        {
            sum+=Math.abs(arr[i+1]-arr[i]);
        }
        System.out.println(sum);
    }
}
