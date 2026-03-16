
package org.example;

import org.example.service.GreetingClient;
import org.example.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean
//    public GreetingService greetingService(){
//        return new GreetingService();
//    }
//    @Bean
//    public GreetingClient greetingClient(){
//        return new GreetingClient(greetingService());
//    }
}
