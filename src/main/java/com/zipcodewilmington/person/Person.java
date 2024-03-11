package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = 0;
    private String hairColor = "";
    private double wingSpan = 0.0;
    private int weight = 0;
    private String bloodType = "";
    private String eyeColor = "";


    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor, double wingSpan, int weight, String bloodType, String eyeColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.wingSpan = wingSpan;
        this.weight = weight;
        this.bloodType = bloodType;
        this.eyeColor = eyeColor;
    }


    //Getters & Setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }



    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getHairColor() {
        return hairColor;
    }
    public double getWingSpan() {
        return wingSpan;
    }
    public Integer getWeight() {
        return weight;
    }
    public String getBloodType() {
        return bloodType;
    }
    public String getEyeColor() {
        return eyeColor;
    }
}
