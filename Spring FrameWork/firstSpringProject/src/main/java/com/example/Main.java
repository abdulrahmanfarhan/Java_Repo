package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load XML-based configuration
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorldXml = (HelloWorld) xmlContext.getBean("helloWorld");
        helloWorldXml.printMessage(); // Output: Message: Hello, World from XML!
    }
}