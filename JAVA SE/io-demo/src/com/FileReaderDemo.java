package com;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {
			
			File file=new File("./xyz.txt");
			if(!file.exists()) {
				return;
			}
			
			FileReader fr=new FileReader(file);
			
			for(int i=0;i<file.length();i++) {
				System.out.print((char)fr.read());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
