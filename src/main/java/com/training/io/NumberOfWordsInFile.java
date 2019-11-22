package com.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWordsInFile {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ksowmya\\Desktop\\a.txt");
		String[] words=null;
		int wc = 0;
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s= br.readLine())!=null) {
			words=s.split(" ");
			wc = wc +words.length;
		}
		System.out.println(wc);
		fr.close();
	}

}
