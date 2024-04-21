package com.bharatkadam.dsa.domain;

import java.util.List;

public interface Base {
    public void apply(List<?> input);
    public default void swap(int array[],int from , int to){
        int temp= array[from];
        array[from]=array[to];
        array[to]=temp;
    }
}
