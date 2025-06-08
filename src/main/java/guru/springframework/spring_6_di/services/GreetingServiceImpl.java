package guru.springframework.spring_6_di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Everyone from Base service!!!";
    }
}
