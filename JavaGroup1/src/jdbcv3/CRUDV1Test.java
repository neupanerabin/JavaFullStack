package jdbcv3;

import myLibrary.BasicIo;

public class CRUDV1Test {
	public static void main(String[] args) {
		
		int pid = 11;
		// insert
		
		String name = "Ram ";
		String Address = "ktm";
		boolean result = new CRUDV1().insert(pid, name, Address);
		if(result) {
			BasicIo.printMessage("Insert Record successfully \n");
		}
		else {
			BasicIo.printMessage("Error to insert connection \n");
		} 
		
		// Search 
		boolean search = new CRUDV1().search(pid);
		if(search) {
			BasicIo.printMessage("Search Successfully : \n");
		}
		else {
			BasicIo.printMessage("Error to search \n");
		}
		
		
		
	}
}
