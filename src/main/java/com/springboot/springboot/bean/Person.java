package com.springboot.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "person")
@Component
public class Person {

    private List<String> likes;

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "likes=" + likes +
                '}';
    }
}
