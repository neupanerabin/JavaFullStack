package week3.Day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import myLibrary.BasicIo;

public class ArrayBasic6 {

	public static void main(String[] args) {
		// Declare an array
		// Initialize an array from the number of csv(data.csv) file.
		// Calculate sum and average
		// Find minimum , and max number
		// search specific number 
		// Sort numbers in ASC order and export in csv file.
		// Sort numbers in DEC order and export in csv file.
		// Export (write) sum,  average, minimum and max number in text file 
		
		final int MAX = 100;
		int nums [] = new int[MAX];
		
			//parsing a CSV file into Scanner class constructor  
			try {
				List<List<String>> data = new ArrayList<>();// list of lists to store data
				String file = "numbers.csv";// file path
				FileReader fr = new FileReader(file);	// read file 
				BufferedReader br = new BufferedReader(fr);

				// Reading until we run out of lines
				String line = br.readLine();
				while (line != null) {
					List<String> lineData = Arrays.asList(line.split(","));// splitting lines
					data.add(lineData);
					line = br.readLine();
				}

				// printing the fetched data
				for (List<String> list : data) {
					for (String str : list)
						BasicIo.printMessage(str + " ");
					BasicIo.newLine();
				}
				  int sum = 0;
		            for (List<String> list : data) {
		                for (String str : list) {
		                    int num = Integer.parseInt(str.trim()); // Convert each string to an integer
		                    sum += num; // Add the number to the sum
		                }
		            }
		            BasicIo.printMessage("Sum: " + sum);

				
				br.close();
			} catch (Exception e) {
				BasicIo.printMessage(e);
	
			}
			finally{
				BasicIo.printMessage(" ");
			}
			}

}

