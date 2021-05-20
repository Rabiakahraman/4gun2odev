package InterfaceAbstractDemo.concretes;

import InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		

		System.out.println("Nero i�in veritaban�na kaydedildi : " + customer.getFirstName() + " " + customer.getLastName());
	}

}
