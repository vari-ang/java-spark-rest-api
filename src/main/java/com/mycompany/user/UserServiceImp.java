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

    public User getUser(String id) {
        for(User user : this.users) {
            if(user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
}
