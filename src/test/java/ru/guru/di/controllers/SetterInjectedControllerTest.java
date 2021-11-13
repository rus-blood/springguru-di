package ru.guru.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.guru.di.services.EnglishHelloServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setHelloService(new EnglishHelloServiceImpl());
    }

    @Test
    void getHello() {
        System.out.println(controller.getHello());
    }
}