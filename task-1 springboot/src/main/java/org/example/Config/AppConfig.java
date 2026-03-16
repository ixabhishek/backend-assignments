package org.example.Config;


import org.example.UserService.UserService;
import org.example.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public UserRepository userRepository() {
//        return new UserRepository();
//    }
//
//    @Bean
//    public UserService userService() {
//        return new UserService(userRepository());
//    }
}