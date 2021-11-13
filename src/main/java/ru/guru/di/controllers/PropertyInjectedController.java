package ru.guru.di.controllers;

import ru.guru.di.services.HelloService;

public class PropertyInjectedController {

    public HelloService helloService;

    public String getHello() {
        return helloService.sayHello();
    }
}
