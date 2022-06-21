package com.java.IfelseTest;

public class IfTest3 {

	public static void main(String[] args) {

		// if---Condition Check--True-Break
		// Else---No Condition Satisfied-Error Message

		int age = 17;
		String country = "Aus";

		if (age > 18) {
			System.out.println("Allow to vote");
		} else if (country.equals("Aus")) {
			System.out.println("He is From Aus, So allow to vote");
		} else {
			System.out.println("Under 18-Not allowed to Vote");
		}
	}
	


}
