package com.example.medicalapp;

public class ContentTwo {
    String name, address, tit, phone,feed;
    int img;

    public ContentTwo(String name, String tit, String address, String feed, String phone, int img) {
        this.name = name;
        this.address = address;
        this.tit = tit;
        this.phone = phone;
        this.feed = feed;
        this.img = img;
    }

    public String tostring2() {
        return this.name + "\n" + this.tit + "\n" + this.address + "\n" + this.phone + "/n" + this.feed+ "/n" + this.img;
    }
}
