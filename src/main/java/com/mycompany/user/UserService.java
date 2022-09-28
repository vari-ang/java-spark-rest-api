package com.mycompany.user;

import java.util.Collection;

public interface UserService {
    public Collection<User> getUsers();

    public User getUser(String id);

    public void addUser(User user);

    public User editUser(User user) throws UserException;
}
