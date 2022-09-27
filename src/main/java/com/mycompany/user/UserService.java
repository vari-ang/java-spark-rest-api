package com.mycompany.user;

import java.util.Collection;

public interface UserService {
    public Collection<User> getUsers();

    public void addUser(User user);
}
