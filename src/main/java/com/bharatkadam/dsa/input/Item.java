package com.bharatkadam.dsa.input;

import java.util.List;

public class Item {
    private String type;
    private List<?> values;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<?> getValues() {
        return values;
    }
    public void setValues(List<?> values) {
        this.values = values;
    }
    @Override
    public String toString() {
        return "Item [type=" + type + ", values=" + values + "]";
    }
}
