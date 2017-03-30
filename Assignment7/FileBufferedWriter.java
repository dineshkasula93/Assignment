package com.Assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileBufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		File f = new File("C:\\Users\\public\\Dinesh.txt");
		FileWriter fw;
		BufferedWriter bw;
		FileReader fr;
		BufferedReader br;
		try {
			if (f.exists()) {
				System.out.println("------------Writing to a file---------------");
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				System.out.println("if class is executed");
				System.out.println("Write to the file what u wish");
				bw.write(scan.nextLine());
				bw.close();

				System.out.println("------------Reading a file---------------");
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String content = br.readLine();
				System.out.println("Contesnt of the file:\t" + content + "\tNumber of words\t" + content.length());

				System.out.println("-------------------Replace a word int the file----------------");
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				System.out.println("Enter the old word which you want to replace \t");
				String newContent = content;
				String oldWord = scan.next();
				System.out.println("Enter the new word:\t");
				String newWord = scan.next();
				bw.write(newContent.replaceAll(oldWord, newWord));
				bw.close();
				System.out.println(br.readLine());

			} else {
				f.createNewFile();
				System.out.println("------------Writing to a file---------------");
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				System.out.println("else class is executed");
				System.out.println("Write to the file what u wish");
				bw.write(scan.nextLine());
				bw.close();

				System.out.println("------------Reading a file---------------");
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String content = br.readLine();
				System.out.println("Content of the file:\t" + content + "\t Number of words" + content.length());
				System.out.println("------------Replacing a word in the file---------------");

				System.out.println("-------------------Replace a word int the file----------------");
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				System.out.println("Enter the old word which you want to replace \t");
				String newContent = content;
				String oldWord = scan.next();
				System.out.println("Enter the new word:\t");
				String newWord = scan.next();
				String word = newWord;
				bw.write(newContent.replaceAll(oldWord, newWord));
				bw.close();
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
