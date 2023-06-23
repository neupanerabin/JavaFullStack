package jdbcv4;

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
		int pid = 2;
		String name = "Ram";
		String address = "buspark";

		Person person = new Person(pid, name, address);

		mysqlCRUD.insert(person);

	}

}
