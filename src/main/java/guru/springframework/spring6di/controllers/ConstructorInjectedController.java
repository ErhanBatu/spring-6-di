package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //I initiate this class if I pass greetingservice
    //because we have here const, spring will automatically autowired it, you don't have to put @autowired
    //@Qualifier("greetingServiceImpl") i am using default class name. It must start with small letter
    //I am saying go to that implementation and do it
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
