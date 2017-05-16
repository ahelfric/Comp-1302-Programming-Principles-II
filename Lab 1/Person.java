/* ****************************
*		 Alex Helfrich        *
*        Comp 1302-04         *
*        Person Class         *
**************************** */

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	
	public Person() 
	{
		setFirstName("");
		setLastName("");
		setAddress("");
		setEmail("");
	}
	
	public Person(String firstNameIn, String lastNameIn, String addressIn,
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String addressIn) {
		address = addressIn;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String emailIn) {
		email = emailIn;
	}
	
	public void display() {
		String output = getFirstName() + "\n" + getLastName() + "\n" + 
						getAddress() + "\n" + getEmail() + "\n";
		System.out.printf(output);
	}
	
	public static void main(String args[]) {
		Person p1;
		p1 = new Person("Mario", "Mario", "1234 Mushroom Road", 
						"mariomario@mushkingdom.net");
		p1.display();
	}
}