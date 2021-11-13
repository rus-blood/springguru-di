package ru.guru.di.services;

import org.springframework.stereotype.Service;

@Service
public class EnglishHelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello, World!";
    }
}
