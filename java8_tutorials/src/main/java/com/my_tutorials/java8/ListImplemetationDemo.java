package com.my_tutorials.java8;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListImplemetationDemo {

	public static void main(String[] args) {

		List<Integer> list = IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());

		// Iterator will move only one direction
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		// listIterator moves in both direction
		ListIterator<Integer> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious())
			System.out.println(listIterator.previous());

		// search a item in the array list
		System.out.println("Number 6 found in the list : " + (list.indexOf(6) > 0));

		list = Collections.unmodifiableList(list);

		// when try to modify the unmodifiable collection will result in exception.
		try {
			list.remove(0);
		} catch (Exception e) {
			System.out.println("Exception occured while tyring to alter the unmodifiableList " + e);
		}

		copyOnWriteDemo();

	}

	/*
	 * When using CopyOnWriteArrayList the actual collection can be altered, but
	 * can't remove elements through iterator
	 */
	private static void copyOnWriteDemo() {

		try {
			System.out.println();
			List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 8));
			Iterator<Integer> iterator2 = list.iterator();
			list.remove(0);
			iterator2.forEachRemaining(System.out::print);
		} catch (Exception e) {
			System.out.println(
					"Exception occured while tyring to alter the collection after iterar has been created : " + e);
		}

		//but when using CopyOnWriteArrayList, we can modify the collection
		CopyOnWriteArrayList<Integer> numbers_0 = new CopyOnWriteArrayList<>(new Integer[] { 1, 2, 3, 4 });
		Iterator<Integer> iterator1 = numbers_0.iterator();
		numbers_0.remove(0);
		iterator1.forEachRemaining(System.out::print);

	}

}
