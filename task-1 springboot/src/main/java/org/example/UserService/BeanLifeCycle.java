package org.example.UserService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    private UserRepository repo;

    public BeanLifeCycle(UserRepository repo) {
        this.repo = repo;
        System.out.println("1️⃣ Constructor Called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("2️⃣ @PostConstruct Called");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("3️⃣ InitializingBean.afterPropertiesSet()");
    }

    public void processUser() {
        repo.getUser();
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("4️⃣ @PreDestroy Called");
    }

    @Override
    public void destroy() {
        System.out.println("5️⃣ DisposableBean.destroy()");
    }
}