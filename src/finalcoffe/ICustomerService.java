package finalcoffe;

import java.rmi.RemoteException;

public interface ICustomerService  {
	void save(Customer customer) throws NumberFormatException, RemoteException;

}
