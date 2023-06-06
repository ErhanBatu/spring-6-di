package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.Mycontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        //With bean I create an instant of mycontroller
        Mycontroller controller = ctx.getBean(Mycontroller.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());

    }

}
