package solid_principles.single_Responsibility;

public class InvoicePrinter {
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		// printing the implementation
		System.out.println("Invoice details:");
		System.out.println("Marker: " + invoice.getMarker().name);
		System.out.println("Color: " + invoice.getMarker().color);
		System.out.println("Price per unit: Rs" + invoice.getMarker().price);
		System.out.println("Quantity: " + invoice.getQuantity());
		System.out.println("Total: Rs" + invoice.calculateTotal());
	}

}
