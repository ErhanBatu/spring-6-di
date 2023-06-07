package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//this controller will create a spring bean
@Controller
public class Mycontroller {

    public String sayHello(){
        System.out.println("I am in the controller");

        return "Hello everyone";
    }

    public void beforeInit(){
        System.out.println("Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("After Init - Called by Bean Post Processor");
    }
}
