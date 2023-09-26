package com.springboot.springboot;

import com.springboot.springboot.bean.Person;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Resource
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
