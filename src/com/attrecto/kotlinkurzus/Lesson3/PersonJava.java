package com.attrecto.kotlinkurzus.Lesson3;

public class PersonJava {
    private String name;
    private String email;
    private String address;


    public PersonJava(){};
    public PersonJava(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
