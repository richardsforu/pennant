package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) {

		try {

			boolean flag=true;
			if(flag)
				return;
			int x = 10 / 0;

			//

		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			System.out.println("---- finally ...");

		}

		System.out.println("--- Non Final");

	}

}
