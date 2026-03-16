package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public UserRepository() {
        System.out.println("UserRepository Constructor");
    }

    public void getUser() {
        System.out.println("Fetching user from DB");
    }
}
