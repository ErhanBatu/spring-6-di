package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class SetterInjectedController {

    //so here I am doing without spring dependency injection
    //either you can autowired property or setter
    private GreetingService greetingService;

    //i want here my setter should be visible and inject it on the console and utilized.
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("I set greeting service");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
