package com.Assignment.BellInfo;

import java.util.HashMap;
import java.util.Set;

public class Assignment4 {

	String s = "This is a java class";
	int noofwords = s.length();
	String[] word = s.split(" ");

	public void repetationOfWords() {
		char a;
		char b;
		int c = 0;
		for (a = 'a'; a <= 'z'; a++) {
			for (int i = 0; i < s.length(); i++) {
				b = s.charAt(i);
				if (a == b) {
					c++;
				}
				if (c != 0) {
					System.out.println(b + "\t" + c);
				}
			}
		}
	}

	public String reverseEachWordOfString() {
		String s = "This is a java class";
		String[] words = s.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		return reverseString;
	}

	public int charCount() {
		String s = "This is a java class";
		String[] words = s.split(" ");
		int ch = 0;
		for (int i = 0; i < words.length; i++) {
			String length = words[i];
			if (length.length() == 1) {
				ch++;
			}
		}
		return ch;
	}

	public String reverseofString() {
		String s = "This is a java class";
		String[] word = s.split(" ");
		String reverseString = "";
		for (int i = word.length - 1; i >= 0; i--) {
			String reverse = word[i];
			reverseString = reverseString + " " + reverse;
		}
		return reverseString;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4 q1 = new Assignment4();
		// q1.repetationOfWords();
		System.out.println("1.Word Count of String:\t" + q1.s.trim().split(" ").length);
		System.out.println("2.Lenght of the String:\t" + q1.s.length());
		System.out.println("3.No of Single Chars in the String:\t" + q1.charCount());
		System.out.println("4. Reverse each word of String:\t" + q1.reverseEachWordOfString());
		System.out.println("5. Reverse entire string:\t" + q1.reverseofString());
		System.out.println("6.Replace java with SQL:\t" + q1.s.replaceAll("java", "SQl"));
		System.out.println("7.Letter at the center:\t" + q1.s.charAt(q1.noofwords / 2));
		System.out.println("8.Index of j at center:\t" + q1.s.indexOf("j"));
		System.out.println("9.Number of times each letter repeated:\t");
		System.out.println("10.Identify a letter which is not repeated:\t");
		System.out.println("11.Identify the index of each word:\t");
		System.out.println("12.Identify the index of each word:\t");
		System.out.println("13.Convert entire String to upper case:\t" + q1.s.toUpperCase());

	}

}