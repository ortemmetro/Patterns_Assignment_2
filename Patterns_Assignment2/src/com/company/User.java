package com.company;

import java.util.List;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> iphoneVersion, List<String> iphoneAmount, List<String> price) {
        System.out.println("Good day, " + this.name + ". We have a fresh info about brand new Iphone 13: \n");
        System.out.println("Version ------------------- Amount ------------------- Price \n");
        for(int i = 0; i < iphoneVersion.size(); i++){
            System.out.println(iphoneVersion.get(i) + " ------------------- " + iphoneAmount.get(i) +
                    " ------------------- " + price.get(i));
        }
        System.out.println("\n");
    }
}
