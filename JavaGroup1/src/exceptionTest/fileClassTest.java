package exceptionTest;

import myLibrary.BasicIo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class fileClassTest {

	public static void main(String[] args) {
		// File(String pathname)
		// File(URI uri)
		// pathname --> absolute pathname
		// pathname --> relative pathname
		
		try {
			boolean result;
			File file = new File("/Users/rabin/eclipse-workspace"); // Absolute path
			File f1 = new File("/Users/rabin/eclipse-workspace/newfile.txt");


			System.out.println("____");

			/*
			 * // boolean canExecute() result = file.canExecute(); if(result) {
			 * System.out.print("File can execute"); } else {
			 * System.out.println("File cannot execute "); }
			 */

			/*
			 * // boolean can read if(file.canRead()) { System.out.println("Can execute"); }
			 * else { System.out.println("cannot execute "); }
			 * 
			 */
		
			/*
			//boolean canWrite()
			if(file.canWrite())
				{
				System.out.println("Can execute");
				}
			 else { System.out.println("cannot execute "); 
			 }
			
			
			
			
			// 	compareTo(File pathname)
			File f = new File("/Users/rabin/eclipse-workspace/newfile.txt");
			int compare = file.compareTo(file);
			if(compare == 0) {
				BasicIo.printMessage("Can execute");
				}
			else {
				BasicIo.printMessage("cannot execute");
			}

		
			// boolean	createNewFile()
			c
				if(f1.createNewFile()) {		// new file create
					BasicIo.printMessage("File create successfully");
				}
				else {
					BasicIo.printMessage("Failed to create new file");
				}
			*/
			
			/*
			// createTempFile(String prefix, String suffix)
            // create a temp file
            File f = File.createTempFile("geeks", null);
            // check if the file is created
            if (f.exists()) {
                // the file is created
                // as the function returned true
                 BasicIo.printMessage("Temp File created: "+ f.getName());
            }
            else {
                // display the file cannot be created
                // as the function returned false
                BasicIo.printMessage("Temp File cannot be created: "+ f.getName());
            }
            
			
			
			
            String prefix = "myPrefix"; // Prefix for the temporary file
            String suffix = ".txt"; // Suffix for the temporary file

            // Create a temporary file using the specified prefix and suffix
            File tempFile = File.createTempFile(prefix, suffix);

            // Print the absolute path of the temporary file
            BasicIo.printMessage("Temporary file path: " + tempFile.getAbsolutePath());
            
            */
           //  createTempFile(String prefix, String suffix, File directory)
/*
            String prefixs = "myPrefix"; // Prefix for the temporary file
            String suffixs = ".txt"; 	// Suffix for the temporary file

            File filePath = new File("/Users/rabin/eclipse-workspace"); // Directory where the temporary file should be created
            // Create a temporary file using the specified prefix, suffix, and directory
            File tempFiles = File.createTempFile(prefixs, suffixs, filePath);

            // Print the absolute path of the temporary file
            BasicIo.printMessage("Temporary file path: " + tempFiles.getAbsolutePath());
            BasicIo.newLine();
       
            */
           
			/*
			//	delete()
			File deletefile = new File("/Users/rabin/eclipse-workspace/myPrefix625134266552921416.txt");
			if(deletefile.delete()) {
				BasicIo.printMessage("File deleted successfully");
			}
			else {
				BasicIo.printMessage("Failed to delete file");
			}
		
			
			// 	deleteOnExit()
			File deleteonexit = new File("/Users/rabin/eclipse-workspace/myPrefix15549392452823036480.txt");
			deleteonexit.deleteOnExit();		// delete the file 
			
			*/
			
			
			// equals(Object obj)
            
          
            
       /*     
            // exists()
            if(file.exists()) {		// Directory with the condition 
            	BasicIo.printMessage("file exist:");
            }
            else {
            	BasicIo.printMessage("File path does not exist");
            }
            
            
            // 	getAbsoluteFile()
            BasicIo.newLine();
            BasicIo.printMessage(file.getAbsoluteFile());	// Display the absolute file path
             if(file.getAbsoluteFile() != null) {		// condition and 
            	BasicIo.printMessage("File path shown successfully");
            }
            else {
            	BasicIo.printMessage("Failed to show ");
            }
            
          
            
            //String	getAbsolutePath()
            BasicIo.printMessage(file.getAbsolutePath());
            
            if(file.getAbsolutePath() != null) {   // condition and if else loop
            	BasicIo.printMessage("File path shown successfully");
            }
            else {
            	BasicIo.printMessage("Failed to show Absolute Path ");
            }
            
            
        	// getCanonicalFile()
            if(file.getCanonicalFile() != null) {		// condition check 
            	BasicIo.printMessage("Cannonical File shown successfully");
            }
            else {
            	BasicIo.printMessage("Failed to show Cannonical file ");
            }
                        
            // getCanonicalPath()
            if(file.getCanonicalPath() != null) {		// condition check 
            	BasicIo.printMessage("Cannonical  path shown successfully");
            }
            else {
            	BasicIo.printMessage("Failed to show Cannonical path ");
            }
            
            //long 	getFreeSpace()
            BasicIo.printMessage(file.getFreeSpace());
            
            // 	getName()
            //BasicIo.printMessage(file.getName());
            if(file.getName() != null) {
            	BasicIo.printMessage("Name get successfully");
            }
            else {
            	BasicIo.printMessage("Unable to get Name ");
            }
            
           
        	// String	getPath()
            BasicIo.printMessage("file path : "+file.getPath());
            
            */
            
            /*
            //long	getTotalSpace()
          long space = file.getTotalSpace();
          BasicIo.printMessage("Long space : "+space/1024/1034/1024);

            // long	getUsableSpace()
            long results = file.length();
            BasicIo.printMessage(results+ ":Bytes");
            
            */
            
	/*		
            // Copy file
			File source = new File("/Users/rabin/eclipse-workspace/Assignment1.txt");	// source file 
			File copyfile = new File("/Users/rabin/eclipse-workspace/CopyFile.txt");	// Destination file 

            Files.copy(source.toPath(), copyfile.toPath());	// copy from source to destination
            System.out.println("File copied successfully");	// Display        
		
*/		
		/*	// Another method to copy files
	        File sourceFolder = new File("/Users/rabin/eclipse-workspace/sourceFolder");		// source location
	        File destinationFolder = new File("/Users/rabin/eclipse-workspace/destinationfolders");	// destination location

	        if (!destinationFolder.exists()) {	// check if folder exist or not
	            destinationFolder.mkdirs(); // Create the destination folder if it doesn't exist
	        }
	        File[] files = sourceFolder.listFiles(); // Get all files from the source folder

	        if (files != null) {	// check if the files is null or not
	            for (File flee : files) {
	                File destinationFile = new File(destinationFolder, flee.getName());	// get the name of folder
	                	// copy files from source to destination and remove existing
	                    Files.copy(flee.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);																		
	                    BasicIo.newLine();
	                    BasicIo.printMessage("Copied file: " + flee.getName());	// Display the copied files name
	            }
	            BasicIo.printMessage("Source folder copied to the destination folder.");	// display the message
	        } else {
	            BasicIo.printMessage("Source folder is empty or does not exist.");	// Display the message
	        }
	    
*/
	/*
			//int	hashCode()
			int b;
			if(file !=null) {
				 b = file.hashCode();	// execute to the file
				BasicIo.printMessage("Hash code : "+b);	// Display value and code
			}
*/			
		/*	
			// boolean	isAbsolute()
			if(file!=null) {
				BasicIo.printMessage(file.isAbsolute());	// if absolute then true will display
			}
			*/
			
			// boolean isFile()
	//		BasicIo.printMessage(f1.isFile());
			// boolean isHidden()
	//	BasicIo.printMessage(file.isHidden());	// true if file is hidden false otherwise
			
			//long	lastModified()
			BasicIo.printMessage(file.lastModified());
	
		}catch (Exception e) {	
			BasicIo.printMessage(e.getMessage());
		
		}
		
		
	}
}
