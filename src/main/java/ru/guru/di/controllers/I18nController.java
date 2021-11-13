package ru.guru.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.guru.di.services.HelloService;

@Controller
public class I18nController {

    private final HelloService helloService;

    public I18nController(@Qualifier("i18n") HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        helloService.addSuffix("i18nController");
        return helloService.sayHello();
    }
}
