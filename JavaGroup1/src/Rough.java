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


import java.io.FileReader;
import java.io.IOException;

public class Rough {
    public static void main(String[] args) {
        try {
            FileReader fread = new FileReader("/Users/rabin/eclipse-workspace/output.txt"); // Replace with the actual file path
            
            int character;
            while ((character = fread.read()) != -1) {
                System.out.print((char) character);
            }
            
            fread.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
