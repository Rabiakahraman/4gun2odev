package InterfaceAbstractDemo;

import java.time.LocalDate;

import InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.concretes.NeroCustomerManager;
import InterfaceAbstractDemo.concretes.StarbucksCustomerManager;
import InterfaceAbstractDemo.entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1,"rabia","korkmaz","121212122122",LocalDate.of(1998, 11, 7)));

    			
    }
 

}
