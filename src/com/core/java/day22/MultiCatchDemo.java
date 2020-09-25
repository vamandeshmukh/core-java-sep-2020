package com.core.java.day22;

public class MultiCatchDemo {

	public static void main(String[] args) {

		try {
			int[] arr = { 10, 20, 30, 40, 50 };
			System.out.println(arr[4] / 0);
		} 
		catch (ArithmeticException ae) {
			System.out.println("Wrong division!");
		} 
		catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Wrong index!");
		}
		catch (Exception ex) {
			System.out.println("Soemthing is wrong!");
		}
	}

}
