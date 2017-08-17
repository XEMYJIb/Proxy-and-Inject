package com.xemyjib.spring;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
public class Utils {

    public static void print(Class<?> clazz, String lable) {
        System.out.println(String.format("%s - Class: %s", lable, clazz.getName()));
    }

}
