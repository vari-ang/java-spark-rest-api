package com.mycompany.user;

import java.util.ArrayList;

public class UserServiceImp implements UserService {
    private ArrayList<User> users;

    public UserServiceImp() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
}
