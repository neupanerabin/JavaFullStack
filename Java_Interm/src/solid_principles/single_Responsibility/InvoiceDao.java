package solid_principles.single_Responsibility;

public class InvoiceDao {
	
	private Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDb(Invoice invoice) {
		// save to database Implementation
        System.out.println("Invoice saved to the database.");

	}
}
