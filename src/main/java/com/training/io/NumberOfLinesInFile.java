package com.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfLinesInFile {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ksowmya\\Desktop\\a.txt");
		int count =0;
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine())!=null)
		{
			count++;
		}
		
		System.out.println(count);
		fr.close();

}
}