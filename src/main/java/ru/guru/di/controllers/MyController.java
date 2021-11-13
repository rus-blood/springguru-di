package ru.guru.di.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import ru.guru.di.services.HelloService;

@Controller
public class MyController {

    private final HelloService helloService;

    public MyController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        helloService.addSuffix("MyController");
        return helloService.sayHello();
    }
}
