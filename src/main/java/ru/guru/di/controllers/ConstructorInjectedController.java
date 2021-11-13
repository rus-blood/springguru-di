package ru.guru.di.controllers;

import ru.guru.di.services.HelloService;

public class ConstructorInjectedController {

    private final HelloService helloService;

    public ConstructorInjectedController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getHello(){
        return helloService.sayHello();
    }
}
