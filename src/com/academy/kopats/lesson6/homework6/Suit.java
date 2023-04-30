package com.academy.kopats.lesson6.homework6;

public class Suit extends Clothes {
    private String fabricType;

    public Suit(int size, String color, String gender, String typeClothes, String fabricType) {
        super(size, color, gender, typeClothes);
        this.fabricType = fabricType;
    }

    @Override
    public void sewing() {
        System.out.println("Пошив костюма: " + getTypeClothes() + " " + getColor() + " " + getGender() + " " + getSize());
    }

    public void material() {
        System.out.println("Ткань " + getFabricType() + " для пошива " + getTypeClothes());
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }
}
