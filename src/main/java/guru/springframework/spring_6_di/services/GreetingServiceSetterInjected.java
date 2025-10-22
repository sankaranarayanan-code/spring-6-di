package guru.springframework.spring_6_di.services;

import org.springframework.stereotype.Service;

@Service ("setterGreetingBean")
public class GreetingServiceSetterInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey, I'm setting a greeting";
    }
}
