package com.training.io;

import java.io.File;

public class FileExists {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\ksowmya\\Downloads\\assignments_io.txt");

		if (f.exists()) {
			System.out.println("File Exists");
		} else
			System.out.println("File Not Exists");

	}
}