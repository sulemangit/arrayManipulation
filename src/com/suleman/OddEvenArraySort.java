package com.suleman;

import java.util.ArrayList;
import java.util.Collections;

public class OddEvenArraySort {

    public ArrayList sort(int[] arr){

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int value: arr) {
            if(value % 2 == 0)
                even.add(value);
            else
                odd.add(value);
        }

        Collections.sort(even);
        Collections.sort(odd);

        sortedList.addAll(odd);
        sortedList.addAll(even);

        return sortedList;
    }
}
