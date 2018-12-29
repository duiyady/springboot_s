package com.duiya.pojo;

import javax.validation.constraints.NotBlank;

public class Account {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    private int age;
    private String city;

    public String getUsername() {
        return username;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public Account(String username, String password, int age, String city) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.city = city;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
