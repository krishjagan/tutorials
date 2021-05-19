package com.my_tutorials.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {


		/**
		 * Check the documentation of these methods.
		 */
		Collections.unmodifiableList(new ArrayList<>());
		Collections.synchronizedList(new ArrayList<>());

		CopyOnWriteArrayList<Integer> numbers_0 = new CopyOnWriteArrayList<>(new Integer[] { 1, 2, 3, 4 });

	}

}
