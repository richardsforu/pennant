package com;

import java.io.FileWriter;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		try {
			
			String s1="Character data suppose to be in file";
			FileWriter fw=new FileWriter("./xyz.txt",true);
			fw.write(s1);
			
			System.out.println("----- Done ...");
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
