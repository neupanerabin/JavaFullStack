package readFromDB_Write_csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ReadFromDB_writein_csv {

    public static Connection connect() throws SQLException {
        // Replace the connection details with your own
        String url = "jdbc:mysql://localhost:3306/sql12624803";	// url to connect with database
        String username = "root";	// database user name
        String password = "Neupane@11";	 // database password
        return DriverManager.getConnection(url, username, password);
    }

    public static void exportToCSV(JTable tableToExport, String pathToExportTo) {
        try {
            Connection conn = connect();	// Connection request for database
            Statement stmt = conn.createStatement();	
            String sql = "SELECT * FROM tbl_person";	// select all data from table name
            ResultSet rs = stmt.executeQuery(sql);		// execute statement

            final DefaultTableModel model = new DefaultTableModel();	// declaration of table model
            model.addColumn("PID");	// id
            model.addColumn("Name");	// name
            model.addColumn("Address");	// address

            while (rs.next()) {	// search till value found
                int pid = rs.getInt("pid");
                String name = rs.getString("name");
                String address = rs.getString("address");
                model.addRow(new Object[]{pid, name, address});	// add value to table row
            }

            JFrame frame = new JFrame("Person data");	// frame title

            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(20, 20, 200, 200);	// table location in frame 

            JButton btnExport = new JButton("EXPORT");	// Button create
            btnExport.setBounds(100, 250, 70, 30);		// Button position

            frame.setSize(400, 500);	// overall frame size
            frame.setLayout(null);	// add layout	
            frame.add(btnExport);	// add button to frame
            frame.add(scrollPane);	// add scrollpane to frame

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

            btnExport.addActionListener(e -> {
                try (FileWriter csv = new FileWriter(new File("/Users/rabin/eclipse-workspace/readfromdatabase.csv"))) {	// file write to csv file location
                    for (int i = 0; i < model.getColumnCount(); i++) {	// total columns count
                        csv.write(model.getColumnName(i) + ",");	// write the columns name
                    }
                    csv.write("\n");	// file write

                    for (int i = 0; i < model.getRowCount(); i++) {		// count total no of columns
                        for (int j = 0; j < model.getColumnCount(); j++) {	// get total columns count
                            csv.write(model.getValueAt(i, j).toString() + ",");		// write value of row and column to csv
                        }
                        csv.write("\n");	// write to csv file 
                    }

                    csv.close();	// csv file close
                    System.out.println("Data exported successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JTable table = new JTable();
        exportToCSV(table, "data.csv");
    }
}
