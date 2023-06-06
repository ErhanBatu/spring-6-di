package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

//If you don't want to use Sprinf annotation then you should use this method
public class ConstructorInjectedController {

    //Because this is const I make it final
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
