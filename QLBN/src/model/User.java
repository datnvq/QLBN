package model;

public class User {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    public boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}