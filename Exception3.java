package com.exceptions;
public class Exception3 {
	public static void main(String args[]) {//40     24 1
		try {
			//file
			int a[] = new int[5];// 0,1,2,3,4
			a[4] = 10/0;
			String s=null;
			//int x=Integer.parseInt(s);
			System.out.println(s.length());//NullPointerException
			System.out.println("no error  " + a[4]);
		}	
	
		catch (ArithmeticException e) {
			System.out.println("dont enter zero denominator");}
		catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("index maximum size crossed");}
		catch (NumberFormatException e) {
		System.out.println("unable to convert string to number");}	
		catch(Exception e)
		{
			System.out.println("not handled"+e);
		}
		finally {
			System.out.println("executes every time for closing connections");
			}
		System.out.println("remaining code  executed...");
		//
	}}