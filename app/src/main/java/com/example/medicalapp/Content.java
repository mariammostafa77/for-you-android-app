package com.example.medicalapp;

public class Content {
    String title;
    int img;

    public Content(String title, int img) {
        this.title = title;
        this.img = img;
    }

    public String tostring(){return this.title+"\n"+this.img;}

}
