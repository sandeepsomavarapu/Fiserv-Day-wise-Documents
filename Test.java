package com.java8;

@FunctionalInterface
interface Calculator {
	public abstract int add(int a, int b);// SAM

		 default void display() {
		System.out.println("default functionality");
	}

	static void hello() {
		System.out.println("static method in interface from 1.8");
	}
}

public class Test {

	public static void main(String[] args) {
		Calculator calc = (a, b) -> a + b;
		System.out.println(calc.add(12, 13));
		calc.display();
		Calculator.hello();
	}
}
