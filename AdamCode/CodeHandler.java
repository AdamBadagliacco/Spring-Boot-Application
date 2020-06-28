package com.renadam.demo;

public class CodeHandler {
	
	public static int generateIntCode(){
		return (int)(Math.random() * 899999 + 100001); //Generates a 6 Digit Code
	}
	
	public static String generateCode(){
		return Integer.toString(generateIntCode());
	}
}
