package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//I implement sayGreeting twice and spring doesn't understand which one should be executed
//I give @primary and spring will execute this one
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from primary bean!!";
    }
}
