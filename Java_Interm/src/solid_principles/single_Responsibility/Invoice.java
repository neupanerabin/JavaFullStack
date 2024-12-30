package solid_principles.single_Responsibility;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        if (marker == null) {
            throw new NullPointerException("Marker is not initialized.");
        }
        return marker.price * this.quantity;
    }

    public Marker getMarker() {
        return marker;
    }

    public int getQuantity() {
        return quantity;
    }
}
