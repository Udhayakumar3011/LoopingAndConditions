package com.java.loopingTest;

public class NestedForLoop {

	public static void main(String[] args) {
//1 Set--Condition True-Statement
//2 Set---0,1,2,3,4---5 Fail----1Set
		for (int i = 0; i < 5; i++) {
			System.out.println("-----------");
			System.out.println("Parent Value of I is" + " " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("Child Value of J is" + " " + j);
			}
		}
	}
}
