package com.example.springdemoproject;

import com.example.springdemoproject.todo.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringDemoProjectApplication.class, args);
        Todo todo = context.getBean(Todo.class);
        todo.message();


    }

}
