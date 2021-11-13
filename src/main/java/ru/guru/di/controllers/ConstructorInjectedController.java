package ru.guru.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.guru.di.services.HelloService;

@Controller
public class ConstructorInjectedController {

    private final HelloService helloService;

    //  @Autowired
    public ConstructorInjectedController(@Qualifier("constructorHelloServiceImpl") HelloService helloService) {
        this.helloService = helloService;
    }

    public String getHello(){
        helloService.addSuffix("ConstructorInjectedController");
        return helloService.sayHello();
    }
}
