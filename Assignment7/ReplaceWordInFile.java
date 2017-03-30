package com.Assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceWordInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		File f = new File("C:\\Users\\public\\Dinesh.txt");
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String content = br.readLine();
			System.out.println("content of the file:\t"+content);
			System.out.println("Enter the old word which you want to replace \t");
			String oldWord = scan.next();
			System.out.println("Enter the new word:\t");
			String newWord = scan.next();
			System.out.println("Replace a word of the file:\t "+content.replaceAll(oldWord, newWord));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
