package com.my_tutorials.java8.generics;

public class GenericsClassDemo<T> {

    T t;

    public GenericsClassDemo(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericsClassDemo<Integer> intObj = new GenericsClassDemo<>(100);
        System.out.println("Integer Object : " + intObj.get());

        GenericsClassDemo<String> strObj = new GenericsClassDemo<>("Hello World !!");
        System.out.println("String Object : " + strObj.get());

    }

    private void set(T t) {
        this.t = t;
    }

    private T get() {
        return this.t;
    }
}
