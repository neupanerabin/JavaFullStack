package jdbcv4;

import jdbcv3.CRUDV1;
import myLibrary.BasicIo;

public class MYSQLCRUDTest {

	public static void main(String[] args) {
		CRUD mysqlCRUD = new MySQLCrud();
		/*
		 * mysqlCRUD.insert(null); 
		 * mysqlCRUD.search(0) 
		 * mysqlCRUD.delete(0)
		 * mysqlCRUD.update(null) 
		 * mysqlCRUD.persons();
		 */
		/*int pid = 4;
		String name = "Ram";
		String address = "buspark";
		Person person = new Person(pid, name, address);
		mysqlCRUD.insert(person);
		
	*/	//search
		//mysqlCRUD.search(4);
		int num1 = BasicIo.readInt("Enter number : ");
		mysqlCRUD.search(num1);
		//Person person = new Person(num1);

		Person search =  mysqlCRUD.search(num1);
		if(search != null) {
			BasicIo.printMessage("Search Successfully : \n");
		}
		else {
			BasicIo.printMessage("Error to search \n");
		}
		
		mysqlCRUD.delete(num1);
		
	}

}
