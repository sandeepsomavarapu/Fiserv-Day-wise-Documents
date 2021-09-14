package com.java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(12));

		IntPredicate intPredicate = i -> i % 2 == 0;
		System.out.println(intPredicate.test(12));
		
		Predicate<String> predicate1 = i -> i.length() > 6;
		System.out.println(predicate1.test("sandeep"));

		Function<String, Integer> function = name -> name.length();
		System.out.println(function.apply("fiserv"));
		Function<String, String> function1 = name -> name.toUpperCase();
		System.out.println(function1.apply("fiserv"));
		Consumer<String> consumer = name -> System.out.println("welcome to " + name);
		consumer.accept("india");
		Supplier<String> supplier = () -> "welcome to java8";
		System.out.println(supplier.get());
		
		LocalDate date=LocalDate.now();
		LocalDate bDate=LocalDate.of(1993,11,10);
		Period p=Period.between(bDate,date);
		System.out.printf("ur age %d years,%d months,%d days",p.getYears(),p.getMonths(),p.getDays());

		ZoneId zone=ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(zone);
		System.out.println(zt);//Asia/Calcutta


	}
}
