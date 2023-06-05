import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import myLibrary.BasicIo;

public class Rough {

    public static void main(String[] args) {
        final int MAX = 100;
        int[] nums = new int[MAX];

        try {
            List<List<String>> data = new ArrayList<>(); // List of lists to store data
            String file = "numbers.csv"; // File path
            FileReader fr = new FileReader(file); // Read file
            BufferedReader br = new BufferedReader(fr);

            // Reading until we run out of lines
            String line = br.readLine();
            while (line != null) {
                List<String> lineData = Arrays.asList(line.split(",")); // Splitting lines
                data.add(lineData);
                line = br.readLine();
            }

            // Printing the fetched data
            for (List<String> list : data) {
                for (String str : list)
                    BasicIo.printMessage(str + " ");
                BasicIo.newLine();
            }

            // Calculating the sum of the numbers
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
        } finally {
            BasicIo.printMessage(" ");
        }
    }

}
