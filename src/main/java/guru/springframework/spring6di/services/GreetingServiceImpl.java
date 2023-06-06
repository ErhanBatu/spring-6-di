package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

//I am telling this is Spring component
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service";
    }
}
