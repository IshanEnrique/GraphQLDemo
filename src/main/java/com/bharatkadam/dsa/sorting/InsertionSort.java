package com.bharatkadam.dsa.sorting;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bharatkadam.dsa.domain.Base;

public class InsertionSort implements Base {
    private static final Logger LOGGER=LoggerFactory.getLogger(InsertionSort.class);
    @Override
    public void apply(List<?> input) {
        String className=this.getClass().getSimpleName();
        LOGGER.info("\n**************** This is from {} started. \n\n",className);
        int[] data=((List<Integer>)input).stream().mapToInt(Integer::intValue).toArray();
        LOGGER.info("INPUT {}  \n\n",Arrays.toString(data));
        int [] output=sort(data);
        LOGGER.info("OUTPUT {}  \n\n",Arrays.toString(output));
        LOGGER.info("\n**************** This is from {} completed. \n\n",className);
        
    }
    private int[] sort(int[] data){
        for(int i=1;i<data.length;i++){
            for(int j=i;j>0;j--){
                if(data[j-1]>data[j]){
                    swap(data, j-1, j);
                }
            }
        }
        return data;
    }
    
}
