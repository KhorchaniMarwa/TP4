package com.eniso.tp4;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private long cin;

    public User(String firstName, String lastName, String email, long cin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cin = cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }
}
