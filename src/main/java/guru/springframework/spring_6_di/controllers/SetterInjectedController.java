package guru.springframework.spring_6_di.controllers;

import guru.springframework.spring_6_di.services.GreetingService;

public class SetterInjectedController {

    GreetingService greetingService;

    public void setGreetingService (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
