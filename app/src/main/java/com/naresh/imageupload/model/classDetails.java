package com.naresh.imageupload.model;


public class classDetails {
    private String name;
    private String age;
    private String gender;
    private int imagenumber;

    public classDetails(String name, String age, String gender, int imagenumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.imagenumber = imagenumber;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getImagenumber() {
        return imagenumber;
    }
}
