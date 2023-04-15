package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

/**
 * Created by jt, Spring Framework Guru.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //I initiate this class if I pass greetingservice
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
