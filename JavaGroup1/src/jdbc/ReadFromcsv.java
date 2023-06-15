package jdbc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ReadFromcsv {
	
	public static void main(String[] args) {
		List<List<String>> records = new ArrayList<>();
		try {
			String csvfilepath = "/Users/rabin/Documents/Student.csv";
			BufferedReader bufferead = new BufferedReader(new FileReader(csvfilepath));
			String line;
			while((line = bufferead.readLine()) != null) {
				String[] values = line.split(line);
		        records.add(Arrays.asList(values));
			}
			// Display data
			for(List<String> list:records) {
				for(String str:list) {
					System.out.println(str);
				}
			}
			
		}
		catch(Exception ex) {
			System.out.printf("Eroor in files"+ex.getMessage());
		}
		
		
	}

}
