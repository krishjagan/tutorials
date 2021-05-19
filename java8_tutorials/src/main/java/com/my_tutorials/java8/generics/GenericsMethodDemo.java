package com.my_tutorials.java8.generics;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericsMethodDemo {


    public static void main(String[] args) {

        System.out.println("Printing Integer Array as List");
        fromArrayToList(new Integer[] {1,2,3,4,5}).forEach(System.out::println);

        System.out.println("Printing String Array as List");
        fromArrayToList(new String[] {"a","b", "c"}).forEach(System.out::println);

        System.out.println("Printing Integer value");
        printList(Arrays.asList(1,2,3));
        System.out.println("Printing Double value");
        printList(Arrays.asList(4d,5d,6d));

    }

    /**
     * This method take array of any elements and convert it in to List and return back.
     * @param myArray
     * @param <T>
     * @return
     */
    public static <T> List<T> fromArrayToList(T[] myArray) {
        return Arrays.stream(myArray).collect(Collectors.toList());
    }

    /**
     * Upper bound : This method takes a list of elements which extends number(ie. Integer,Double) and print it.
     * @param myList
     * @param <T>
     */
    public static <T extends Number> void printList(List<T> myList){
    //public static void printList(List<? extends Number> myList){
        myList.stream().map(num-> num.doubleValue()).forEach(System.out::println);
    }
}
