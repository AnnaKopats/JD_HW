package com.academy.kopats.lesson7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Document contract = new Document("Трудовой договор", 4);
        Document act = new Document("Акт выполненных работ", 1);
        Document manual = new Document("Инструкция", 5);
        Document[] doc = new Document[3];
        doc[0] = manual;
        doc[1] = contract;
        doc[2] = act;
        Arrays.sort(doc);
        System.out.println(Arrays.toString(doc));

        Document contract2 = (Document) contract.clone();

        System.out.println(contract == contract2);
        System.out.println(contract.equals(contract2));
        System.out.println(contract2.equals(act));

        Object contract3;
        contract3 = (Document) contract2;

        Printable printDoc;
        printDoc = (Printable) contract3;
        printDoc.print();
    }
}
