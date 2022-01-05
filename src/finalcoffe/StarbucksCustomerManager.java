package finalcoffe;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private ICustomerCheckService customerCheckService;
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			super.save(customer);
			
		}
		else {
			
			
			System.out.println("Bulunamadý");
		} 
	}

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	

	

	

}
