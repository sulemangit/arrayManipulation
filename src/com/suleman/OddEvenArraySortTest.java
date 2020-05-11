package com.suleman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class OddEvenArraySortTest {

    OddEvenArraySort arraySort;

    @Before
    public void init(){
        arraySort = new OddEvenArraySort();
    }

    @Test
    public void sort_emptyList_returnEmpty(){

        Integer[] input = {};
        Integer[] expectedOutput = {};

        Integer[] output = arraySort.sort(input);

        Assert.assertArrayEquals(expectedOutput , output);
    }

    @Test
    public void sort_oddList_returnSorted(){

        Integer[] input = {1 ,7 ,5 ,3};
        Integer[] expectedOutput = {1 ,3 , 5, 7};

        Integer[] output = arraySort.sort(input);

        Assert.assertArrayEquals(expectedOutput , output);
    }

    @Test
    public void sort_evenList_returnSorted(){

        Integer[] input = {2 ,6 ,4 ,8};
        Integer[] expectedOutput = {2, 4, 6, 8};

        Integer[] output = arraySort.sort(input);

        Assert.assertArrayEquals(expectedOutput , output);
    }

    @Test
    public void sort_oddEvenList_returnSorted(){

        Integer[] input = {1 ,7 ,2 ,3 ,4};
        Integer[] expectedOutput = {1, 3, 7, 2, 4};

        Integer[] output = arraySort.sort(input);

        Assert.assertArrayEquals(expectedOutput , output);
    }

    @Test
    public void sort_sortedOddEvenList_returnSameList(){

        Integer[] input = {1 ,3 ,5 ,2 ,4};
        Integer[] expectedOutput = {1 ,3 ,5 ,2 ,4};

        Integer[] output = arraySort.sort(input);

        Assert.assertArrayEquals(expectedOutput , output);
    }
}