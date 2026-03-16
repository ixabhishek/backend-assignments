package org.example;

import org.example.Config.AppConfig;
import org.example.UserService.BeanLifeCycle;
import org.example.UserService.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService service = context.getBean(UserService.class);

        service.processUser();
        context.getBean(BeanLifeCycle.class);
        context.close();
    }
}