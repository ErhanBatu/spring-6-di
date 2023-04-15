package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//I set the same service name with the SpanishGreetingService it will give error
//thats why i define profile
//if you put en as default even if you don't use @ActiveProfiles("EN") in the test case it will select automatically en as default
@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
