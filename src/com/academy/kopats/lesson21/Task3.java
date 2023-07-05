package com.academy.kopats.lesson21;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Drinks tea;
        Drinks coffee;


        Scanner sc = new Scanner(System.in);
        System.out.println("Какой напиток желаете приготовить? \n Введите: кофе или чай");
        String s = sc.nextLine();
        if (s.equals("кофе")) {
            coffee = new Coffee();
            coffee.prepare();
            System.out.println("Что желаете добавить в напиток? \n Введите: сахар, или молоко, или сироп");
            s = sc.nextLine();
            if (s.equals("сахар")) {
                coffee = new SugarDecorator(new Coffee());
            }else if (s.equals("молоко")){
                coffee = new MilkDecorator(new Coffee());
            }else {
                coffee = new SyrupDecorator(new Coffee());
            }
            coffee.prepare();
        } else if (s.equals("чай")){
            tea = new Tea();
            tea.prepare();
            System.out.println("Что желаете добавить в напиток? \n Введите: сахар, или молоко, или сироп");
            s = sc.nextLine();
            if (s.equals("сахар")) {
                tea = new SugarDecorator(new Tea());
            }else if (s.equals("молоко")){
                tea = new MilkDecorator(new Tea());
            }else {
                tea = new SyrupDecorator(new Tea());
            }
            tea.prepare();
        }
    }
}
