package com.suleman;

import java.util.ArrayList;
import java.util.Collections;

public class OddEvenArraySort {

    public Integer[] sort(Integer[] arr){

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();

        if(arr.length == 0)
            return arr;


        for (Integer value: arr) {
            if(value % 2 == 0)
                even.add(value);
            else
                odd.add(value);
        }

        Collections.sort(even);
        Collections.sort(odd);

        sortedList.addAll(odd);
        sortedList.addAll(even);


        return sortedList.toArray(arr);
    }
}
