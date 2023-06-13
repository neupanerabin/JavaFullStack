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


import javax.swing.*;

public class Rough {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Complaint Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a text area to enter the complaint
        JTextArea complaintTextArea = new JTextArea();
        complaintTextArea.setLineWrap(true);

        // Create a submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String complaint = complaintTextArea.getText();
            JOptionPane.showMessageDialog(frame, "Complaint submitted:\n" + complaint);
            complaintTextArea.setText(""); // Clear the text area
        });

        // Add components to the frame
        frame.getContentPane().add(new JScrollPane(complaintTextArea));
        frame.getContentPane().add(submitButton, "South");

        // Set layout manager
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Display the frame
        frame.setVisible(true);
    }
}
