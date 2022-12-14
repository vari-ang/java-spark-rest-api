package com.mycompany.user;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void givenEmptyUserListWhenThreeUsersAreAddedThenThereShouldBeThreeUsersInTheList() {
        UserServiceImp userService = new UserServiceImp();
        User user1 = new User("1", "vari", "angga", "vari.angga@example.com");
        User user2 = new User("2", "budi", "", "budi@example.com");
        User user3 = new User("3", "joni", "andi", "joniandi@example.com");

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        ArrayList<User> users = userService.getUsers();

        assertEquals(3, users.size());
    }

    @Test
    public void givenListOfUsersWhenSpecificUserInTheListIsSearchedThenItShouldReturnTheUser() {
        UserServiceImp userService = new UserServiceImp();
        User user1 = new User("1", "vari", "angga", "vari.angga@example.com");
        User user2 = new User("2", "budi", "", "budi@example.com");
        User user3 = new User("3", "joni", "andi", "joniandi@example.com");  

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        assertEquals(user2, userService.getUser("2"));
    }

    @Test
    public void givenListOfUsersWhenSpecificUserToEditThenItShouldEditAndReturnTheUser() throws Exception {
        UserServiceImp userService = new UserServiceImp();
        User user1 = new User("1", "vari", "angga", "vari.angga@example.com");
        User user2 = new User("2", "budi", "", "budi@example.com");

        userService.addUser(user1);
        userService.addUser(user2);

        User userToEdit = new User("2", "joni", "agung", "joni.agung@example.com");
        userService.editUser(userToEdit);
        assertEquals(userService.getUser("2"), userToEdit);
    }

    @Test(expected = UserException.class)
    public void givenListOfUsersWhenSpecificUserToEditNotInListThenItShouldReturnUserException() throws UserException {
        UserServiceImp userService = new UserServiceImp();
        User user1 = new User("1", "vari", "angga", "vari.angga@example.com");

        userService.addUser(user1);

        User userToEdit = new User("3", "joni", "agung", "joni.agung@example.com");
        userService.editUser(userToEdit);
    }
}
