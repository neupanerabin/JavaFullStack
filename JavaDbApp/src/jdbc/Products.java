package jdbc;

public class Products {
	
	private String productId;
	private String productName;
	private String productCatId;
	private float price;
	
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
		return "Products [ productId=" + productId + ", productName=" + productName + ", productCatId="
				+ productCatId + ", price=" + price + "]";
	}
	public Products( String productId, String productName, String productCatId, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCatId = productCatId;
		this.price = price;
	}

}
