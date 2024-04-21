package com.bharatkadam.dsa.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="config")
public class Config {
    List<Props> props;

    public List<Props> getProps() {
        return props;
    }

    public void setProps(List<Props> props) {
        this.props = props;
    }
}
