package entities;

public class Orderitem {

	private Integer quantity;
	private Double price;
	
	
	private Product product;
	
	
	public Orderitem() {
	}
	

	public Orderitem(int quantity,Double price, Product product) {
		this.price = price;
		this.quantity = quantity;
		this.product = product;
	}

	
	
	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public double subTotal() { 
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}
