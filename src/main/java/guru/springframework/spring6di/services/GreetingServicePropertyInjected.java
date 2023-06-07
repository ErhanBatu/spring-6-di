package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

//I will put this name and I will use it in the controller class qualifyr so that it will understand it is gonna run this
@Service("PropertyInjected")
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "I am using Qualifier";
    }
}
