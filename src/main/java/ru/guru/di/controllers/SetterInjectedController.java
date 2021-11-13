package ru.guru.di.controllers;

import ru.guru.di.services.HelloService;

public class SetterInjectedController {

    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getHello() {
        return helloService.sayHello();
    }
}
