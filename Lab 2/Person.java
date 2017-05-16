/* ****************************
*	    Alex Helfrich         *
*        Comp 1302-04         *
*        Person Class         *
*	    	   Lab 2          *
**************************** */

public class Person {
	private String firstName;
	private String lastName;
	private Address addressData;
	private String email;
	
	public Person() 
	{
		Address add01 = new Address();
		
		setFirstName("");
		setLastName("");
		setAddress(add01);
		setEmail("");
	}
	
	public Person(String firstNameIn, String lastNameIn, Address addressIn,
				  String emailIn) 
	{
		setFirstName(firstNameIn);
		setLastName(lastNameIn);
		setAddress(addressIn);
		setEmail(emailIn);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstNameIn) {
		firstName = firstNameIn;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastNameIn) {
		lastName = lastNameIn;
	}
	
	public Address getAddress() {
		return addressData;
	}
	
	public void setAddress(Address addressIn) {
		addressData = addressIn;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String emailIn) {
		email = emailIn;
	}
	
	public void display() {
		//String output = getFirstName() + " " + getLastName() + "\n" + 
		//				getAddress() + "\n" + getEmail() + "\n";
		System.out.printf(this.toString());
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + "\n" + 
		           getAddress() + "\n" + getEmail() + "\n";
	}
	
	public static void main(String args[]) {
		Person p1;
		Address add02 = new Address("4578 Ramen Avenue", 
						"Yakisoba City", "The state of Japan", 12346);
		p1 = new Person("Mario", "Mario", add02, 
						"mariomario@mushkingdom.net");
		p1.display();
	}
}