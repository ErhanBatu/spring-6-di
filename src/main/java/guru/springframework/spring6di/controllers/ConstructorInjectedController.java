package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//If you don't want to use Spring annotation then you should use this method
@Controller
public class ConstructorInjectedController {

    //Because this is const I make it final
    private final GreetingService greetingService;

    //you can use qualifier with the class name but first letter must be small
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

}
