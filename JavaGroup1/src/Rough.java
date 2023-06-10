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


  import myLibrary.BasicIo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Rough {

    public static void main(String[] args) throws IOException {
        File sourceFolder = new File("/Users/rabin/eclipse-workspace/sourceFolder");
        File destinationFolder = new File("/Users/rabin/eclipse-workspace/destinationfolder");

        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs(); // Create the destination folder if it doesn't exist
        }

        File[] files = sourceFolder.listFiles(); // Get all files from the source folder

        if (files != null) {
            for (File file : files) {
                File destinationFile = new File(destinationFolder, file.getName());
             
                    Files.copy(file.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    BasicIo.newLine();
                    BasicIo.printMessage("Copied file: " + file.getName());
                
            }
            BasicIo.printMessage("Source folder copied to the destination folder.");
        } else {
            BasicIo.printMessage("Source folder is empty or does not exist.");
        }
    }
}
