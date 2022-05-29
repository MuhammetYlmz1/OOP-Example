package oopExample;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1=new Product();
		product1.setId(15);
		product1.setProductName("Bilgisayar1");
		product1.setUnitPrice(2000);
		product1.setDiscount(10);
		
		System.out.println("Product1 Yeni fiyat : "+product1.getUnitPriceAfterDiscount());

		
		
		Product product2=new Product();
		product2.setId(16);
		product2.setProductName("Bilgisayar2");
		product2.setUnitPrice(3000);
		product2.setDiscount(8);
		
		System.out.println("Product2 Yeni fiyat : "+product2.getUnitPriceAfterDiscount());
		
		
		
		Product product3=new Product(17,"Bilgisayar3",4000,10);
		
		Product[] products= {product2,product1,product3};
		
		System.out.println(products.length);
	
		for (Product product : products) {
			System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getUnitPrice());
		}
		
		System.out.println("-----------------------------------------------------");
		
		Category category1 =new Category();
		category1.setId(1);
		category1.setName("Elektronik");
		
		Category category2 =new Category();
		category2.setId(2);
		category2.setName("Beyaz Eþya");
		
		System.out.println(category1.getName());
		
		
		System.out.println("--------------------------------------------");
		
		
		ProductManager productManager=new ProductManager();
		productManager.add(product1);
		productManager.add(product2);

		System.out.println("--------------------------------------------");

		Customer customer1=new Customer(1,"Muhammet","Yilmaz","Istanbul");
		Customer customer2=new Customer(2, "Ahmet","Kara", "Ankara");
		Customer customer3=new Customer(3,"Ayþe","Yýldýz","Istanbul");
		Customer customer4=new Customer(4, "Fatma","Boða", "Ankara");
		Customer customer5=new Customer(5,"Ali","Kýzýl","Istanbul");

			
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(customer1);
		customerManager.add(customer2);
		customerManager.add(customer3);
		customerManager.add(customer4);
		customerManager.add(customer5);
		System.out.println("-----------------------------------------");
		customerManager.getAll();
		System.out.println("-----------------------------------------");
		customerManager.remove(4);
		
	
	
	}
	

}
