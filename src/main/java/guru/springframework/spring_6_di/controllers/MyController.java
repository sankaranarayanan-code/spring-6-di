package guru.springframework.spring_6_di.controllers;

import guru.springframework.spring_6_di.services.GreetingService;
import guru.springframework.spring_6_di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    /** Dependency on GreetingService, but controller has all the control
     * how the GreetingService is created and how it is managed.
     * Now the controller doesn't play nicely with Spring Framework **/

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("In Controller Class");
        return greetingService.sayHello();
    }
}
