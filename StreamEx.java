package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(40);
		al.add(30);
		al.add(15);
		al.add(5);

		System.out.println("gg" + al);//
		
		List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("Even Numbers :" + l);


		List<Integer> l1 = al.stream().map(i -> i * 2).collect(Collectors.toList());

		System.out.println("double of data " + l1);

		long cn = al.stream().count();

		System.out.println("it will count no of elements " + cn);

		List<Integer> l2 = al.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());

		System.out.println("displayed in descending order " + l2);

		Integer minVal = al.stream().min((i1, i2) -> -i1.compareTo(i2)).get();

		System.out.println("minimumvalue is ... " + minVal);

		Integer maxVal = al.stream().max((i1, i2) -> -i1.compareTo(i2)).get();

		System.out.println("Maximum..value is ... " + maxVal);

		// printing using foreach

		al.stream().forEach(i -> {

			System.out.println("the elements are " + i);
		});

		// to array list to array

		Object[] a = al.stream().toArray();

		System.out.println("the array elements are ");

		for (Object a1 : a) {

			System.out.println(a1);

		}

		System.out.println("the array elements are using forEach method");

		Stream.of(a).forEach(i -> {
			System.out.println(i);
		});

	}

}