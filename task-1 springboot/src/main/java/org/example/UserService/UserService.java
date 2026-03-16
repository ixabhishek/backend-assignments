package org.example.UserService;

import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
        System.out.println("UserService Constructor");
    }

    public void processUser() {
        repo.getUser();
        System.out.println("Processing user");
    }
}


