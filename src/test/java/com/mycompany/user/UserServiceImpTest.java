package com.mycompany.user;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

public class UserServiceImpTest {
    @Test
    public void givenEmptyUserListWhenNewUserIsAddedThenTheUserShouldBeInTheList() {
        UserServiceImp userService = new UserServiceImp();
        User user = new User("1", "vari", "angga", "vari.angga@example.com");

        userService.addUser(user);

        ArrayList<User> users = userService.getUsers();

        assertFalse(users.isEmpty());
    }
}
