package com.academy.kopats.lesson18;

public class CallOld {

    public static void main(String[] args) {
        CallOld c = new CallOld();
        c.call();
    }


    public void call() {
        TestAnnotation t = new TestAnnotation();
        @SuppressWarnings("AssertStatement")
        String old = t.old();
        System.out.println(old);
    }
}

