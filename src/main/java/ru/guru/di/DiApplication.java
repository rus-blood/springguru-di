package ru.guru.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.guru.di.controllers.MyController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String text = myController.sayHello();
		System.out.println(text);
	}

}
