package exceptionTest;

import java.io.File;

public class fileClassTest {

	public static void main(String[] args) {
		// File(String pathname)
		// File(URI uri)
		// pathname --> absolute pathname
		// pathname --> relative pathname
		boolean result;
		File file;
		file = new File("/Users/rabin/eclipse-workspace"); // Absolute path
		System.out.println("____");

		/*
		 * // boolean canExecute() result = file.canExecute(); if(result) {
		 * System.out.print("File can execute"); } else {
		 * System.out.println("File cannnot execute "); }
		 */

		/*
		 * // boolean can read if(file.canRead()) { System.out.println("Can execute"); }
		 * else { System.out.println("cannot execute "); }
		 * 
		 */
		// boolean can read
		
		//boolean canWrite()
		if(file.canWrite())
			{
			System.out.println("Can execute");
			}
		 else { System.out.println("cannot execute "); 
		 }
		
		// 	compareTo(File pathname)
		
	}
}
