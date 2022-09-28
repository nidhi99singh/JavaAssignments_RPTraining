
public class Product {

	private long productId;
	private String productName;
	private String category;
	private double price;
	
	public Product(long productId, String productName, String category, double price) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public Product() {
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("[Product Name:"+getProductName() +",Category:" +getCategory()+",Price: "+getPrice()+",ProductId: "+getProductId());
}
}