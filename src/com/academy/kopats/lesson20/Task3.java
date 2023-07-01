package com.academy.kopats.lesson20;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        ProductCategory pc1 = new ProductCategory("Молочные продукты");
        ProductCategory pc2 = new ProductCategory("Одежда");
        ProductCategory pc3 = new ProductCategory("Бытовая химия");

        Product milk = new Product("Молоко", 201.52, 5);
        Product dress = new Product("Платье", 4035.11, 2);
        Product soap = new Product("Мыло", 302.18, 4);

        pc1.add(milk);
        pc2.add(dress);
        pc3.add(soap);

        LocalDate now = LocalDate.now();
        String format = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(now);
        System.out.println("Дата:                                    " + format);
        System.out.println();
        System.out.println("Продукты    Категория             Цена            Рейтинг");
        System.out.println("---------------------------------------------------------");

        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        String formatMilk = nf.format(milk.getPrice());
        String formatDress = nf.format(dress.getPrice());
        String formatSoap = nf.format(soap.getPrice());

        System.out.println(milk.getName() + "\t\t" + pc1.getName() + "\t\t" + formatMilk + "\t" + "руб." + "\t" + milk.getRating());
        System.out.println(dress.getName() + "\t\t" + pc2.getName() + "\t\t\t\t  " + formatDress +"\t" + "руб." + "\t" + dress.getRating());
        System.out.println(soap.getName() + "\t\t" + pc3.getName() + "\t\t\t" + formatSoap +"\t" + "руб." + "\t" + soap.getRating());
        System.out.println("---------------------------------------------------------");

        Basket basket = new Basket();
        basket.add(milk);
        basket.add(dress);
        basket.add(soap);


        double sum = 0;
        for (Product product : basket.getProducts()) {
            sum += product.getPrice();
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String formatSum = currencyInstance.format(sum);
        System.out.println("Итого: \t\t\t\t\t\t\t\t" + formatSum);

    }
}
