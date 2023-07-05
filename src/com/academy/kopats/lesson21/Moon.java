package com.academy.kopats.lesson21;

public class Moon {
    private static Moon moon;

    private Moon() {
    }
    public static Moon getInstance(){
        if (moon == null){
            synchronized (Moon.class){
                if (moon == null){
                    moon = new Moon();
                }
            }
        }
        return moon;
    }
}
