package com;

import java.io.FileOutputStream;

public class ByteOutputDemo {

	public static void main(String[] args) {

		String s1 = "Navya";
		try {

			FileOutputStream fos = new FileOutputStream("./abc.txt",true);

			byte[] data = s1.getBytes();

			for (byte b : data) {
				//System.out.print(b);
			}
			
			

			//fos.write(data); // writes entire byte array
			char[] charData=s1.toCharArray();
			
			for(int i=0;i<charData.length;i++) {
				int d=charData[i];
				fos.write(d); // each character of a string as ASCII value
				//System.out.print((int)charData[i]);
				
			}

			//fos.close();
			System.out.println("--- Writing is Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
