package finalcoffe;

import java.rmi.RemoteException;

public  class BaseCustomerManager implements ICustomerService{

    @Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Save to db : "+customer.firstName);
		
	}

}
