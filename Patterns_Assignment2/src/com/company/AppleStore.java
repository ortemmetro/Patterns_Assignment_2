package com.company;

import java.util.ArrayList;
import java.util.List;

public class AppleStore implements Publisher{
    private List<String> iphoneVersion = new ArrayList<>();
    private List<String> iphoneAmount = new ArrayList<>();
    private List<String> price = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public List<String> getIphoneVersion() {
        return iphoneVersion;
    }

    public void setIphoneVersion(List<String> iphoneVersion) {
        this.iphoneVersion = iphoneVersion;
    }

    public List<String> getIphoneAmount() {
        return iphoneAmount;
    }

    public void setIphoneAmount(List<String> iphoneAmount) {
        this.iphoneAmount = iphoneAmount;
    }

    public List<String> getPrice() {
        return price;
    }

    public void setPrice(List<String> price) {
        this.price = price;
    }

    public List<Observer> getUsers() {
        return users;
    }

    public void setUsers(List<Observer> users) {
        this.users = users;
    }

    public void addDrop(String iphoneVersion, String iphoneAmount, String price){
        this.iphoneVersion.add(iphoneVersion);
        this.iphoneAmount.add(iphoneAmount);
        this.price.add(price);
    }

    public void removeDrop(String iphoneVersion, String iphoneAmount, String price){
        this.iphoneVersion.remove(iphoneVersion);
        this.iphoneAmount.remove(iphoneAmount);
        this.price.remove(price);
    }


    @Override
    public void registerUser(Observer user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(Observer user) {
        this.users.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer user: this.users){
            user.update(this.iphoneVersion, this.iphoneAmount, this.price);
        }
    }
}
