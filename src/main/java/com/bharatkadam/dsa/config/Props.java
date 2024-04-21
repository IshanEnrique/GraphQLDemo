package com.bharatkadam.dsa.config;

import java.util.List;


public class Props {
    private String packageName;
    private List<String> classess;
    private List<Integer> exclusions;
    private String method;
    private String type;
    private String executionOnInputType;
    private Input input;
    private Boolean active;
    public String getPackageName() {
        return packageName;
    }
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    public List<String> getClassess() {
        return classess;
    }
    public void setClassess(List<String> classess) {
        this.classess = classess;
    }
    public List<Integer> getExclusions() {
        return exclusions;
    }
    public void setExclusions(List<Integer> exclusions) {
        this.exclusions = exclusions;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getExecutionOnInputType() {
        return executionOnInputType;
    }
    public void setExecutionOnInputType(String executionOnInputType) {
        this.executionOnInputType = executionOnInputType;
    }
    public Input getInput() {
        return input;
    }
    public void setInput(Input input) {
        this.input = input;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
}
