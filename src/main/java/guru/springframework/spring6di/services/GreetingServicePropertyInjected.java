package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

//@Qualifier as a default class name but here I am overriding
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!";
    }
}
