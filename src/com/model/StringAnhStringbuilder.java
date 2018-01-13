package com.model;

public class StringAnhStringbuilder {
	public static void main(String[] args) {
		// String 
		String str1 = "ABC";
		System.out.println(str1+ "D");
		System.out.println(str1);
		
		// Stringbuilder
		StringBuilder strb1 = new StringBuilder("ABC");
		System.out.println(strb1 +"D");
		System.out.println(strb1);
	}
}
