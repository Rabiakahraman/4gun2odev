package InterfaceAbstractDemo.abstracts;

import InterfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	
	public void Save(Customer customer) {
		System.out.println("kay�t yap�ld�" + customer.getFirstName());	}

}
