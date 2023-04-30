package com.academy.kopats.lesson6.homework6;

public abstract class Clothes implements Cloth {
    private int size;
    private String color;
    private String gender;
    private String typeClothes;

    public Clothes(int size, String color, String gender, String typeClothes) {
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.typeClothes = typeClothes;
    }

    @Override
    public void sewing() {

    }

    @Override
    public void material() {

    }

    public String getTypeClothes() {
        return typeClothes;
    }

    public void setTypeClothes(String typeClothes) {
        this.typeClothes = typeClothes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
