package com.academy.kopats.lesson7;

import java.util.Objects;

public class Document implements Printable, Cloneable, Comparable<Document> {
    private String nameDoc;
    private int numberPages;


    public Document(String nameDoc, int numberPages) {
        this.nameDoc = nameDoc;
        this.numberPages = numberPages;
    }


    @Override
    public void print() {
        System.out.println("Документ отпрвлен на печать.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        Document d;
        if (!(o instanceof Document)) {
            return false;
        }else {
            d= (Document) o;
        }
        return this.numberPages == d.numberPages && Objects.equals(this.nameDoc, d.nameDoc);
    }

    @Override
    public String toString() {
        return "Наименование документа: " + this.nameDoc + ", количество страниц: " + this.numberPages;
    }


    @Override
    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public int compareTo(Document o) {
        return this.numberPages - o.numberPages;
    }
}
