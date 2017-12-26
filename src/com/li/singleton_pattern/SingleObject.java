package com.li.singleton_pattern;


public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {

        return instance;
    }

    public void shwMessage() {
        System.out.println("Hello World!");
    }
}
