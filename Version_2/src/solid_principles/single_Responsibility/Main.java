package solid_principles.single_Responsibility;

public class Main {
	
	public static void main (String [] args) {
		Marker m = new Marker("Pen ", "Color" , 70);
		Invoice inv = new Invoice(m, 5);
		InvoicePrinter print = new InvoicePrinter(inv);
        InvoiceDao dao = new InvoiceDao(inv);

		inv.calculateTotal();
		print.printInvoice();
		
		print.printInvoice();
        dao.saveToDb(inv);
		
		
		
		
	}

}
