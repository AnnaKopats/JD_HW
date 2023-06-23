package com.academy.kopats.lesson18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task1 {
    public static void main(String[] args) {
        String s = "Hello";
        methodInstanceGetName(s);
    }

    private static void methodInstanceGetName(Object o) {
        Class<?> aClass = o.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            int modifiers = method.getModifiers();
            if (!(Modifier.isStatic(modifiers))) {
                System.out.println(method.getName());
            }
        }
    }
}
