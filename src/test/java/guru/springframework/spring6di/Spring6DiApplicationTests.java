package guru.springframework.spring6di;


import guru.springframework.spring6di.controllers.Mycontroller;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    //Autowire create an instance automatically
    @Autowired
    ApplicationContext applicationContext;

    //you don't have to create an object for mycontroller
    @Autowired
    Mycontroller mycontroller;

    @Test
    void testAutowireOfController() {

        System.out.println(mycontroller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
