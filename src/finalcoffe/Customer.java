package finalcoffe;

public class Customer implements IEntity {
	int id ;
	String firstName;
	String lastName;
	int dateYear;
	String nationalIdString;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateYear, String nationalIdString) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateYear = dateYear;
		this.nationalIdString = nationalIdString;
	}

}
