package com.academy.kopats.lesson21;

public class Earth {
    private static Earth earth;

    private Earth() {
    }
    public static Earth getInstance(){
        if (earth == null){
            synchronized (Earth.class){
                if (earth == null){
                    earth = new Earth();
                }
            }
        }
        return earth;
    }
}
