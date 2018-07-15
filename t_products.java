package javaapplication_practica;

public class t_products {

	private int Id;
	private String ProductName;
	private int ProductReview;

	public void setID(int value) {
		this.Id = value;
	}

	public void setProductName(String value) {
		this.ProductName = value;
	}

	public void setProductReview(int value) {
		this.ProductReview = value;
	}

	public int getID() {
		return this.Id;
	}

	public String getProductName() {
		return this.ProductName;
	}

	public int getProductReview() {
		return this.ProductReview;
	}

	public void setAll(int value, String value1, int value2) {
		this.Id = value;
		this.ProductName = value1;
		this.ProductReview = value2;
	}

}
