package com.academy.kopats.lesson15;

public class Printer extends Thread{
    public String text;

    public Printer(String name, String text) {
        super(name);
        this.text = text;
    }

    @Override
    public void run() {
        print(text);
        System.out.println(getName());
    }

    public void print (String text){
        System.out.println(text);
    }
}
