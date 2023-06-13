package myLibrary;

import java.io.BufferedReader;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class BasicIo {
	public static void printMessage(String message) { // static use for single user
		System.out.print(message);
	}
	
	public static void printMessage(BufferedReader br) {
		System.out.print(br);
		
	}
	public static void printMessage(int message) { // static use for single user
		System.out.print(message);
	}


	public static void printMessage(String label, String message) { // static use for single user
		System.out.print(label + " : " + message);
	}

	public static void printMessage(String label, double message) {
		System.out.print(label + " : " + message);
	}

	public static void newLine() {
		System.out.println();
	}

	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}

	public static int readInt() {	// for read integer 
		return (Integer.parseInt(readString()));
	}

	public static char readCharacter() {
		return (new Scanner(System.in).nextLine().charAt(0));
	}
	
	public static void printMessage(Exception e) { // display for exception
		System.out.print(e);
	}
	public static void printMessage(List<String> list) { // display list
		System.out.print(list);
	}
	public static double nextDouble() {
		return 0;
	}
	public static String next() {
		return null;
	}
	public static void printMessage(boolean before) { // for display the boolean value
		System.out.print(before);
	}
	
	public static void printMessage(File file) { // Display the file
		System.out.print(file);
	}
	
	public static void printMessage(long l) { // Display for long
		System.out.print(l);
	}
	public static void printMessage(Path paths) { // for display of paths
		System.out.print(paths);
	}
	public static void printMessage(URI uri) {
		System.out.println(uri);
	}

}
