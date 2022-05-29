package oopExample;

import java.util.ArrayList;

public class CustomerManager {
	  ArrayList<Customer> listCustomerName;
	
	
	public CustomerManager() {
		listCustomerName=new ArrayList<>();
	}

	public void add(Customer customer) {
		System.out.println(customer.customerName+" adli kisi eklendi");
		
		listCustomerName.add(customer);
	
	}
	
	public void getAll() {
		for (Customer customer : listCustomerName) {
			System.out.println(customer.customerName);
		}
	}
	
	public void remove(int id) {
		for (Customer customer : listCustomerName) {
			if(customer.customerId==id) {
				listCustomerName.remove(id);
			}
		}
		getAll();
	}

	

	

	
	
	
	

}
