package oopExample;

public class Product {
	//encapsulation
	private int Id;
	private String productName;
	private int unitPrice;
	private double discount;
	
	
	public Product() {
		System.out.println("Çalýþtý");
	}
	public Product(int id,String productName,int unitPrice,double discount) {
		this();//parametresiz constructor u çalýþtýrdý.
		this.Id=id;
		this.productName=productName;
		this.unitPrice=unitPrice;
		this.discount=discount;
		
	}
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	
	

}
