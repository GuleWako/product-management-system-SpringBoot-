package com.example.springdemoproject.todo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Todo {
    public void message(){
        System.out.println("Hello springBoot community");
    }
}
