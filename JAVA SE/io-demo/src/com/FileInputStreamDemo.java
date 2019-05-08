package com;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {
	
	public static void main(String[] args) {
		
		try {
			
			File fileLoc=new File("./abc.txt");
			if(!fileLoc.exists()) {
				return;
			}
			
		
			
			FileInputStream fis=new FileInputStream(fileLoc);
			
			
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fis.read());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println("--- Done ---");
		
		
	}

}
