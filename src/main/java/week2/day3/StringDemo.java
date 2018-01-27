package week2.day3;

import java.util.regex.Pattern;

/**
 * Write a method called splitString() that takes input as "Welcome:to-java.com-hello:world" and splits by the delimiter "-" and method returns array of Strings.
 * sample input:"Welcome:to-java.com-hello:world" 
 * output will be array of 3 Strings Str1=Welcome:to, Str2=java.com Str3=hello:world
 */
public class StringDemo {
	
	
	public static int searchString(String inputString, String searchString) {
		return inputString.indexOf(searchString);
	}
	
	public static String[] splitString(String input) {
		//Write a Java program to convert all the characters in a string to uppercase
		String inputString = "Hello Readers";
		String searchString = "Hello";
		System.out.println(searchString(inputString, searchString));
		
		String[] array = input.split("-");
		return array;
	}
	
	public static int countSpaces(String input) {
		/**
		*   Write a method called countSpaces() that takes a String=”Hello World Java” 
		*   as input and count the number of whiteSpaces in the String and return the count.
		**/
        char[] ch = input.toCharArray();
        int count = 0;
        for (int i=0;i<ch.length; i++) {
        	   if (ch[i] == ' ') {
        	    count++;
        	   }
        }
        return count;
    }
	
	public static int countUpperCaseLetters(String input) {
		/**
		*  Write a method called countUpperCaseLetters() that takes a 
		*  String=”Hello World Java” as input and count the number of  
		*  Upper Case letters in the String and return the count of uppercase letters.
		**/
        char[] ch = input.toCharArray();
        int count = 0;
        for (int i=0;i<ch.length; i++) {
        	   if (Character.isUpperCase(ch[i])) {
        	    count++;
        	   }
        }
        return count;
    }
	
	public static String countDigitsBeforeAndAfterDecimal(double d) {
	    /****
	      * Write a program to called countDigitsBeforeAndAfterDecimal() that takes Double 
	      * as input and prints the number of decimals before and after decimal.
	      *  sample input =143.32 . Number of digits before decimal is 3 and after decimal is 2
	      */
		String str = Double.toString(d);
		String[] ar = str.split(Pattern.quote("."));
		String before = ar[0];
		String after = ar[1];
		int b = before.length();
		int a = after.length();
		String result = "Number of digits before decimal is " + b + " and after decimal is " + a;
		return result;

	}
	public static void main(String[] args) {
		
		String input = "Welcome:to-java.com-hello:world";
		String[] output = splitString(input);
		
		for (String item : output) { 
			System.out.println(item);
		}
		
		String str = "Hello World Java";
		System.out.println(countSpaces(str));
		
		System.out.println(countUpperCaseLetters(str));
		
		double dbl = 143.32;
		System.out.println(countDigitsBeforeAndAfterDecimal(dbl));

	}
}
