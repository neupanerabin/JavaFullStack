package exceptionTest;

import myLibrary.BasicIo;
import java.io.File;
import java.io.FilenameFilter;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileClassTest {

	public static void main(String[] args) {
		// File(String pathname)
		// File(URI uri)
		// pathname --> absolute pathname
		// pathname --> relative pathname
		
		try {
			boolean result;
			File file = new File("/Users/rabin/eclipse-workspace/hello"); // Absolute path
			File f1 = new File("/Users/rabin/eclipse-workspace/newfiles.txt");


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
	
	/*
			//long	lastModified()
			long lastModified = file.lastModified();	// File into lastModified
			Date lastModifiedDate = new Date(lastModified);	// changed into date
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// Display format of date and time
			String formattedDate = dateFormat.format(lastModifiedDate);		// insert modified date and time into display format
			BasicIo.printMessage("Last Modified Date :"+ formattedDate);	// Display the date and time
	*/		
			//long	length()
		//	BasicIo.printMessage(file.length());	// display the length of the file


			
			// String[]	list()
			

/*	       
 // String[]	list(FilenameFilter filter)	
			FilenameFilter filter = (dir, name) -> name.endsWith(".txt");	// Filter file  take .txt file in scanned

			String[] filteredList = file.list(filter);	// take .txt file to dsiplay 
			for(String files: filteredList) {	// Display .txt files
				BasicIo.printMessage(files);	// Display
				BasicIo.newLine();
			}
*/			
		
	/*		//File[]	listFiles()
			File[] filelist = file.listFiles();		// scan all the file in the given directory
			for(File listfile:filelist) {			// loop used to display all the files
				BasicIo.printMessage(listfile);
				BasicIo.newLine();
			}
	*/		
	/*		
			// File[]	listFiles(FileFilter filter)
			FilenameFilter filter = (dir, name) -> name.endsWith("");	// scan all available files and folders

			String[] listFiles = file.list(filter);	// take file to display 
			for(String files: listFiles) {	// Display all available files
				BasicIo.printMessage(files);	// Display
				BasicIo.newLine();
			}
	*/
			// static File[]	listRoots()
	/*		
			File[] rootfile = f1.listRoots();		 // detect all the files
			for(File rootlist:rootfile) {		// loop used
				BasicIo.printMessage(rootlist);	// Display
				BasicIo.newLine();
				
			}
	*/		
			// boolean	mkdir()
	/*		if(!file.exists()) {	// if file doesn't exists then create file
				boolean results = file.mkdir();		// boolean with make directory
				if(results) {	// check if file exists or not
					BasicIo.printMessage("Successfully created "+file.getAbsolutePath());
				}
				else {
					BasicIo.printMessage("Failed creating "+file.getAbsolutePath());
				}
			}
			else {
				BasicIo.printMessage("pathname already exists");
			}
	*/
			/*
			// boolean mkdirs()
			if(!file.exists()) {	// if file doesn't exist hen only create files
				boolean results = file.mkdirs();		// boolean with make directory
				if(results) {	// check if file exists or not
					BasicIo.printMessage("Successfully created "+file.getAbsolutePath());
				}
				else {
					BasicIo.printMessage("Failed creating "+file.getAbsolutePath());
				}
			}
			else {
				BasicIo.printMessage("pathname already exists");
			}
	*/
		/*
			// boolean	renameTo(File dest)	
			File dest_file = new File("/Users/rabin/eclipse-workspace/hello");	// dest file name to rename given file
			if(file.exists()) {	// if file exist then only rename files
				boolean results = file.renameTo(dest_file);		// boolean with make directory
				if(results) {	// check if file exists or not
					BasicIo.printMessage("Successfully created ");
				}
				else {
					BasicIo.printMessage("Failed creating ");
				}
			}
			else {
				BasicIo.printMessage("Failed to rename files");
			}
	*/
	/*
			// boolean	setExecutable(boolean executable)
			if(file.exists()) {	// check file exists or not
				boolean results = file.setExecutable(true);		// set boolean value
				if(results) {
					BasicIo.printMessage("Operation successfull: "+results);	// Display output
				}
				else {
					BasicIo.printMessage(results+":Operation failed");	// Display output
				}
			}else {
					BasicIo.printMessage("File doesn't exist");	// Display output
				}
	*/		
	/*
			// boolean	setExecutable(boolean executable, boolean ownerOnly)
			if(file.exists()) {
				// set file as executable considering if the user is the owner or not
				boolean results = file.setExecutable(true, false);
				// evaluate the result
				if(results){
					System.out.println("Operation succeeded: "+results);
				}
				else{
					System.out.println("Operation failed"+results);
				}
			}else{
				System.out.println("File does not exist"+file);
			}
	*/
	/*		// boolean	setLastModified(long time)
			if(file.exists()){
				Calendar cal = Calendar.getInstance();	// import and declare objects of calendar
				long modDate = cal.getTimeInMillis();	// Take date and time
				boolean results = file.setLastModified(modDate);	
				Date lastModifiedDate = new Date(modDate);	// changed into date
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// Display format of date and time
				String formattedDates = dateFormat.format(lastModifiedDate);
				
				// check if the rename operation is success
				if(results){
					System.out.println("Operation Success: "+formattedDates);	// Display the output
				}else{
					System.out.println("Operation failed: "+formattedDates);	// Display the output
				}
				
			}else{
				System.out.println("File does not exist");
			}
	*/	
		/*
			//	boolean	setReadable(boolean readable)
			if(file.exists()) {
				// set file as executable considering if the user is the owner or not
				boolean results = file.setReadable(true);
				// evaluate the result
				if(results){
					System.out.println(" allow to read operation: "+results);
				}
				else{
					System.out.println("disallow to read operation "+results);
				}
			}else{
					BasicIo.printMessage("File doesn't exist" );
			}	
	*/
	/*		// boolean	setReadable(boolean readable, boolean ownerOnly)
			if(file.exists()) {		// check if file exists or not
				boolean results = file.setReadable(true, false);
				if(results) {	// evaluate the results
					BasicIo.printMessage("files are readable :");
				}
				else {
					BasicIo.printMessage("files are not readable");
				}
			}else {
					BasicIo.printMessage("File doesn't exist" );
				}
	*/		
	/*		
			// boolean	setReadOnly()
			if(file.exists()) {
				boolean results = file.setReadOnly();
				if(results) {
					BasicIo.printMessage("Files are readable");
				}
				else {
					BasicIo.printMessage("File doesn't exist" );
				}
			}
		*/
		/*
			// boolean	setWritable(boolean writable)
			if(file.exists()) {		// check if file exists or not
				boolean results = file.setWritable(true);
				if(results) {	// evaluate the results
					BasicIo.printMessage("files are writeable :");
				}
				else {
					BasicIo.printMessage("files are not writeable");
				}
			}else {
					BasicIo.printMessage("File doesn't exist" );
				}
	*/		
	/*		
		//	 boolean	setWritable(boolean writable, boolean ownerOnly)
			if(file.exists()) {		// check if file exists or not
				boolean results = file.setReadable(true, false);
				if(results) {	// evaluate the results
					BasicIo.printMessage("files are writeable :");
				}
				else {
					BasicIo.printMessage("files are not eriteable");
				}
			}else {
					BasicIo.printMessage("File doesn't exist" );
				}
		*/
//		// Path	toPath()
//			if(file.exists()) {
//				Path paths = file.toPath();	// display the path of the files
//				BasicIo.printMessage("Paths:"+paths);
//			}
//			
		// String	toString()
			String str =file.toString();	// Returns the pathname string of this abstract pathname 
			BasicIo.printMessage("String : "+str);	// Display output
	
			//URI	toURI()		
			URI uri = file.toURI();	// represents this abstract path name
			BasicIo.printMessage(" URI : "+uri);	// Display output
			BasicIo.newLine();
			// URL   toURL
			URL url = file.toURL();		// represent the path 
			BasicIo.printMessage("URL" +url);
			
		}catch (Exception e) {	
			BasicIo.printMessage(e.getMessage());
		
		}
		
		
	}
}
