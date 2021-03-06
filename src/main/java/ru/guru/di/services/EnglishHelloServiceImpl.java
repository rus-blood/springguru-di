package ru.guru.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile({"EN", "default"})
public class EnglishHelloServiceImpl implements HelloService {

    String suffix;

    public EnglishHelloServiceImpl() {
        this.suffix = "";
    }

    @Override
    public String sayHello() {
        String text = suffix;
        if (!text.equals(""))
            text += ": ";
        return text + "Hello, World! (English)";
    }

    @Override
    public void addSuffix(String suffix) {
        if (!this.suffix.equals(""))
            this.suffix += "/";
        this.suffix += suffix;
    }
}
