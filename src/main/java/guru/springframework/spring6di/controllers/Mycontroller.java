package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

//this controller will create a spring bean
@Controller
public class Mycontroller {

    public String sayHello(){
        System.out.println("I am in the controller");

        return "Hello everyone";
    }
}
