package com.company;

public class Main {

    public static void main(String[] args) {

        AppleStore appleStore = new AppleStore();
        appleStore.addDrop("Iphone 13", "1000", "$699");
        appleStore.addDrop("Iphone 13 Pro", "100", "$999");
        appleStore.addDrop("Iphone 13 Mini", "2000", "$599");

        User user1 = new User("Artem");
        User user2 = new User("Sanzhar");

        appleStore.registerUser(user1);
        appleStore.registerUser(user2);

        appleStore.notifyAllUsers();
        appleStore.removeDrop("Iphone 13", "1000", "$699");
        appleStore.removeDrop("Iphone 13 Pro", "100", "$999");
        appleStore.removeDrop("Iphone 13 Mini", "2000", "$599");

        appleStore.addDrop("Iphone 13", "346", "$699");
        appleStore.addDrop("Iphone 13 Pro", "25", "$999");
        appleStore.addDrop("Iphone 13 Mini", "1289", "$599");

        appleStore.notifyAllUsers();
    }
}
