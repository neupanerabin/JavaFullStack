package Dao;

public class Item {
    private int itemId;
    private String productName;
    private float productPrice;

    public Item(int itemId, String productName, float productPrice) {
        this.itemId = itemId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Add getters and setters as needed

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
