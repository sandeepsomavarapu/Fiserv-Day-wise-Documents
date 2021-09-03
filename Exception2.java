package com.exceptions;
class Exception2 {
	public static void main(String[] args) {
		try {
			int a1 =10;
			int b=0;
			int c=a1/b;
		}catch (ArithmeticException ae) {//jvm  /bey zero
			System.out.println("dont enter zero as denominater");
		}
	
		System.out.println("remaining lines of code");
	}
}