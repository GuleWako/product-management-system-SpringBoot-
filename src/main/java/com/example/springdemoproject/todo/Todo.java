package com.example.springdemoproject.todo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Todo {
    private final Test test;

    public Todo(Test test) {
        this.test = test;
    }

    public void message(){
       test.message();
       //log.info("hello");
    }
}
