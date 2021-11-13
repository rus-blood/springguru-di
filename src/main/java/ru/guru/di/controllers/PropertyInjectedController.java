package ru.guru.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.guru.di.services.HelloService;

@Controller
public class PropertyInjectedController {

    @Autowired
    public HelloService helloService;

    public String getHello() {
        helloService.addSuffix("PropertyInjectedController");
        return helloService.sayHello();
    }
}
