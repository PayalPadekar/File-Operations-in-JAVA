package com.File_Operations;

import java.io.File;
import java.io.FileOutputStream;

public class WritttingDataFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("xyz.txt");
		
		FileOutputStream fos = new FileOutputStream(f1);
		
		byte a[] = {65, 66, 67, 68};
		
		fos.write(a);
		System.out.println("Data Written Done...");

	}

}
