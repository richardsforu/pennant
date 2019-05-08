package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class DataDemo {

	public static void main(String[] args) {

		try {

			InputStreamReader dis = new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(dis);
			
			System.out.println("Input Number: ");
			int x = Integer.parseInt(br.readLine());
			System.out.println("X: " + x);
			System.out.println("Input Character: ");
			int ch=br.read();
			System.out.println("Character is "+(char)ch);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
