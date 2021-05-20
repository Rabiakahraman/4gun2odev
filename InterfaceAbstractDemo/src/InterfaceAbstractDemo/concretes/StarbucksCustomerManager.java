package InterfaceAbstractDemo.concretes;

import InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.abstracts.ICustomerCheckService;
import InterfaceAbstractDemo.entities.Customer;

public abstract class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private ICustomerCheckService customercheckService;
	

	public StarbucksCustomerManager(ICustomerCheckService customercheckService) {
		super();
		this.customercheckService = customercheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		if (customercheckService.CheckIfRealPerson(customer))
		{
		  System.out.println("starbucks veri tabanýna kaydedildi" + customer.getFirstName() + " " + customer.getLastName());
		}
		else {
			System.out.println("geçerli kiþi deðildir");
		}
		
	}

	
	
	
	

}
