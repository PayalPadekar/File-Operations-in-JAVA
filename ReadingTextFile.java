package com.File_Operations;

import java.io.File;
import java.io.FileInputStream;

public class ReadingTextFile {

	 public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("abc.txt");
		
		FileInputStream fis = new FileInputStream(f1);
		
		int k = fis.read();
		
		while(k != -1) {
			System.out.println((char)k);
			k = fis.read();
		}

	}

}
