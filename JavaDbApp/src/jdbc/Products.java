package jdbc;

public class Products {
	
	private int id;
	private String productId;
	private String productName;
	private String productCatId;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCatId() {
		return productCatId;
	}
	public void setProductCatId(String productCatId) {
		this.productCatId = productCatId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", productId=" + productId + ", productName=" + productName + ", productCatId="
				+ productCatId + ", price=" + price + "]";
	}
	public Products(int id, String productId, String productName, String productCatId, float price) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.productCatId = productCatId;
		this.price = price;
	}

}
