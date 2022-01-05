package finalcoffe;

import java.rmi.RemoteException;

public class coffeshop {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"ÞERAFETTÝN","ALTUNTAÞ",1997,"47152510926"));
		

	}

}
