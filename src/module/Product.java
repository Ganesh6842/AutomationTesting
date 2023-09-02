package module;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	private int producQty;

	public Product(int productId, String productName, double price, int producQty) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = price;
		this.producQty = producQty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProducQty() {
		return producQty;
	}

	public void setProducQty(int producQty) {
		this.producQty = producQty;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", producQty=" + producQty + "]";
	}
}
