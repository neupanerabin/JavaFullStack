//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.StandardCopyOption;
//
//public class Rough {
//
//    public static void main(String[] args) {
//        try {
//            File sourceFolder = new File("/Users/rabin/eclipse-workspace/sourceFolder");  // Source folder
//            File destinationFolder = new File("/Users/rabin/eclipse-workspace/destinationfolder");  // Destination folder
//
//            // Get files in the source folder
//            File[] files = sourceFolder.listFiles();
//
//            if (files != null) {
//                // Iterate over files and copy them to the destination folder
//                for (File file : files) {
//                    File destinationFile = new File(destinationFolder, file.getName());
//                    Files.copy(file.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//                    System.out.println("Copied file: " + file.getName());
//                }
//
//                System.out.println("Files copied successfully");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Rough {
	
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
