package com.bharatkadam.dsa.input;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "input")
public class Input {
    String type;
    Item items;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Input [type=" + type + ", items=" + items + "]";
    }
    public Item getItems() {
        return items;
    }
    public void setItems(Item items) {
        this.items = items;
    }
}
