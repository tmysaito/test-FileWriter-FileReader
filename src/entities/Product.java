package entities;

public class Product {
	
	private String name;
	double price;
	int quantities;
	
	
	public Product(String name, double price, int quantities) {
		this.name = name;
		this.price = price;
		this.quantities = quantities;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
	
	public double value(double price, int quantities) {
		return price*quantities;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", value(price, quantities));
	}

}
