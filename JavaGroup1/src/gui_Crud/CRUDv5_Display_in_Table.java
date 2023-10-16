package gui_Crud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import jdbcv3.CRUDV1;

public class CRUDv5_Display_in_Table extends JFrame implements ActionListener {

	public CRUDv5_Display_in_Table() {
		// Create the table and model

		boolean result = new CRUDV1().selectAll(); // call CRUDV1 file

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		CRUDv5_Display_in_Table frame = new CRUDv5_Display_in_Table();

	}

}
