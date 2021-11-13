package ru.guru.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.guru.di.services.HelloService;

@Controller
public class SetterInjectedController {

    private HelloService helloService;

    @Autowired
    @Qualifier("setterHelloServiceImpl")
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getHello() {
        helloService.addSuffix("SetterInjectedController");
        return helloService.sayHello();
    }
}
