package com.academy.kopats.lesson6;

public class Man {
    private String name;
    private int age;
    private String gender;
    private int weight;

    public Man() {

    }

    public Man(String name, int age, String gender, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
