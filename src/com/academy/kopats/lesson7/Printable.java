package com.academy.kopats.lesson7;

public interface Printable {
    default void print(){
        System.out.println("Документ отпрвлен на печать.");
    }
    String getNameDoc();
}
