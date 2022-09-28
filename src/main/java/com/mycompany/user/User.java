package com.mycompany.user;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public User(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User) {
            User otherUser = (User) obj;

            return this.id == otherUser.id && 
                this.firstName == otherUser.firstName && 
                this.lastName == otherUser.lastName && 
                this.email == otherUser.email;
        }

        return false;
    }
}
