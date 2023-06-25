package com.academy.kopats.lesson18;

public class CallOld {

    public static void main(String[] args) {
        CallOld c = new CallOld();
        c.call();
    }


    public void call() {
        TestAnnotation t = new TestAnnotation();
        @SuppressWarnings("AssertStatement") //@SuppressWarnings("deprecation") - эта аннотация подавит ворнинг
        String old = t.old();
        System.out.println(old);
    }
}

