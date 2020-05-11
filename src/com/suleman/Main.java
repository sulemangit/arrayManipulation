package com.suleman;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] input = {1, 2, 4, 3, 7, 16};

        OddEvenArraySort arraySort = new OddEvenArraySort();

        System.out.println(Arrays.toString(arraySort.sort(input)));
    }
}
