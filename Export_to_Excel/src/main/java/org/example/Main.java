package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // Call the exportToExcel method
        exportToExcel();
    }

    public static void exportToExcel() {
        // Database connection
        String jdbcUrl = "jdbc:mysql://localhost:3306/Mhiits";
        String username = "root";
        String password = "Neupane@11";

        // SQL query to retrieve data
        String query = "SELECT * FROM Student";

        // Excel file details
        String excelFilePath = "output.xlsx";

        try (
                // Establish a database connection
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                // Create a prepared statement
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                // Execute the query and get the result set
                ResultSet resultSet = preparedStatement.executeQuery();
                // Create an Excel workbook
                Workbook workbook = new XSSFWorkbook()) {
            // Create an Excel sheet
            Sheet sheet = workbook.createSheet("Data");

            // Create the header row
            Row headerRow = sheet.createRow(0);

            // Assuming the ResultSet metadata contains column names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                Cell cell = headerRow.createCell(i - 1);
                cell.setCellValue(metaData.getColumnName(i));
            }

            // Populate data rows
            int rowNum = 1;
            while (resultSet.next()) {
                Row row = sheet.createRow(rowNum++);
                for (int i = 1; i <= columnCount; i++) {
                    Cell cell = row.createCell(i - 1);
                    cell.setCellValue(resultSet.getString(i));
                }
            }

            // Write the workbook to an Excel file
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
            }

            System.out.println("Data has been written to the Excel file: " + excelFilePath);

        } catch (SQLException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}