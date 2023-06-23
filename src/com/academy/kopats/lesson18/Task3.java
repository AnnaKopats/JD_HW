package com.academy.kopats.lesson18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName(args[0]);

            System.out.println("Родительский класс класса LinkedList: " + aClass.getSuperclass());
            System.out.println("________________________________________________________");

            System.out.println("Поля класса LinkedList:");
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field field : declaredFields) {
                int modifiers = field.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " "
                        + field.getGenericType() + " " + field.getName());
            }
            System.out.println("________________________________________________________");

            System.out.println("Методы класса LinkedList:");
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                int modifiers = method.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " "
                        + method.getReturnType() + " "
                        + method.getName() + " "
                        + "(" + Arrays.toString(method.getParameterTypes()) + ")");
            }
            System.out.println("________________________________________________________");

            System.out.println("Констркуторы класса LinkedList:");
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor<?> constructor : declaredConstructors) {
                int modifiers = constructor.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " "
                        + constructor.getName() + " "
                        + "(" + Arrays.toString(constructor.getParameterTypes()) + ")");
            }
            System.out.println("________________________________________________________");

            System.out.println("Внутренние классы класса LinkedList:");
            Class<?>[] declaredClasses = aClass.getDeclaredClasses();
            for (Class<?> declaredClass : declaredClasses) {
                int modifiers = declaredClass.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " "
                        + declaredClass.getName());
            }
            System.out.println("________________________________________________________");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
