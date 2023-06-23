package com.academy.kopats.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        printMath();
    }

    private static void printMath() {
        System.out.println("Методы класса Math:");
        System.out.println();
        Class<? extends Math> mathClass = Math.class;
        Method[] declaredMethods = mathClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.println(Modifier.toString(modifiers) + " "
                        + method.getReturnType() + " "
                        + method.getName() + " "
                        + "(" + Arrays.toString(method.getParameterTypes()) + ")");
            }
        }
        System.out.println("________________________________________________________");
        System.out.println("Поля класса Math:");
        System.out.println();
        Field[] declaredFields = mathClass.getDeclaredFields();
        for (Field field : declaredFields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers))
                System.out.println(Modifier.toString(modifiers) + " " + field.getType() + " " + field.getName());
        }
        System.out.println("________________________________________________________");
    }
}
