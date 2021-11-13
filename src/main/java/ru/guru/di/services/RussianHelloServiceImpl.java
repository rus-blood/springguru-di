package ru.guru.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile("RU")
public class RussianHelloServiceImpl implements HelloService {

    String suffix;

    public RussianHelloServiceImpl() {
        this.suffix = "";
    }

    @Override
    public String sayHello() {
        String text = suffix;
        if (!text.equals(""))
            text += ": ";
        return text + "Привет! (Russian)";
    }

    @Override
    public void addSuffix(String suffix) {
        if (!this.suffix.equals(""))
            this.suffix += "/";
        this.suffix += suffix;
    }
}
