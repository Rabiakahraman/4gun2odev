package InterfaceAbstractDemo.concretes;

import InterfaceAbstractDemo.abstracts.ICustomerCheckService;
import InterfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
