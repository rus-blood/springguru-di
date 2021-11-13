package ru.guru.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.guru.di.services.EnglishHelloServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.helloService = new EnglishHelloServiceImpl();
    }

    @Test
    void getHello() {
        System.out.println(controller.getHello());
    }
}