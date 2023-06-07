package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//if you deactivate activeprofiles annotation it will fail because there are 2 profiles. That's why you should give default profile
@ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTest {

    @Autowired
    Myi18NController myi18NController;
    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());

    }
}