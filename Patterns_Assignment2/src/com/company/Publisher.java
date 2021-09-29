package com.company;

public interface Publisher {
    void registerUser(Observer user);
    void removeUser(Observer user);
    void notifyAllUsers();
}
