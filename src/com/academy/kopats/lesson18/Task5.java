package com.academy.kopats.lesson18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task5 {
    public static void main(String[] args) {
        Class<Bean> beanClass = Bean.class;
        try {
            Bean bean = beanClass.newInstance();
            for (Method declaredMethod : bean.getClass().getDeclaredMethods()) {
                if (declaredMethod.isAnnotationPresent(Param.class)) {
                    Param annotation = declaredMethod.getAnnotation(Param.class);
                    int a = annotation.a();
                    int b = annotation.b();
                    Object result = declaredMethod.invoke(bean, a, b);
                    System.out.println("Вызван метод: " +
                            declaredMethod.getName() +
                            ", результат этого метода: " + result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
