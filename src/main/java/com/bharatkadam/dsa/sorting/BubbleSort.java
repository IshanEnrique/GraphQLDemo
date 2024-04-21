package com.bharatkadam.dsa.sorting;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bharatkadam.dsa.domain.Base;

public class BubbleSort implements Base {
    private static final Logger LOGGER=LoggerFactory.getLogger(BubbleSort.class);
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
        for(int i=0;i<data.length;i++){
            boolean isSorted=true;
            for(int j=0;j<data.length-i-1;j++){
                if(data[j]>data[j+1]){
                    isSorted=false;
                    swap(data, j, j+1);
                }
            }
            if(isSorted)
                break;
        }
        return data;
    }
    
}
