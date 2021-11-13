package ru.guru.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterHelloServiceImpl implements HelloService {

    String suffix;

    public SetterHelloServiceImpl() {
        this.suffix = "";
    }

    @Override
    public String sayHello() {
        String text = suffix;
        if (!text.equals(""))
            text += ": ";
        return text + "Hello, World! (Setter)";
    }

    @Override
    public void addSuffix(String suffix) {
        if (!this.suffix.equals(""))
            this.suffix += "/";
        this.suffix += suffix;
    }
}
