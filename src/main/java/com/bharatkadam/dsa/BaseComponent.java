package com.bharatkadam.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bharatkadam.dsa.config.Config;

@Component
public class BaseComponent {
    private static final Logger LOGGER=LoggerFactory.getLogger(BaseComponent.class);
    @Autowired
    private Config config;
    public void start() throws Exception{
        LOGGER.info("\n\n******************** DSA APPLICATION STARTED SUCCESSFULLY *****************************\n\n");
        config.getProps().stream().filter(incl-> incl.getActive()).forEach(props->{
            List<Integer> exclusions=  props.getExclusions();
            List<String> classess=props.getClassess();
            String packageName=props.getPackageName();
            String methodName=props.getMethod();
            List<List<String>> inputArray=props.getInput().getArray();
            if(exclusions.size()!=classess.size()){
                LOGGER.error("Exclusions and Classess must have the same size");
                return;
            }
            for(int i=0;i<exclusions.size();i++){
                try {
                    int index=exclusions.get(i);
                    if(index!=0){
                        Class<?> classInstance=Class.forName(packageName+classess.get(i));
                        inputArray.stream().forEach(input->{
                            try {
                                switch (props.getExecutionOnInputType()) {
                                    case "array":
                                        List<List<Integer>> inp=input.stream().map(in-> Arrays.asList(in.split(","))
                                            .stream()
                                            .map(Integer::parseInt).toList()).toList();
                                            inp.stream().forEach(in->{
                                                try {
                                                    classInstance.getDeclaredMethod(methodName, List.class).invoke(
                                                    classInstance.getDeclaredConstructor().newInstance(null),new ArrayList<>(List.copyOf(in)));
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                   LOGGER.error(e.getMessage());
                                                }
                                            });
                                        break;
                                    case "string":
                                            classInstance.getDeclaredMethod(methodName, List.class).invoke(
                                            classInstance.getDeclaredConstructor().newInstance(null),input);
                                          break;
                                    default:
                                        break;
                                }
                            } catch (Exception e) {
                                LOGGER.error(e.getMessage());
                            }
                        });
                    }
                } catch (Exception e) {
                    LOGGER.error(e.getMessage());
                }
            }
        });
    }
}
