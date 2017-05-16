/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Person Class      *
*     Mini-Project 1    *
********************** */

public class Person {
	private String id;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	
	public Person() {
		id = "";
		password = "";
		firstName = "";
		lastName = "";
		email = "";
	}
	
	public Person(String IDIN, String passIn, String firstIn, String lastIn,
				  String eIn) {
		id = IDIN;
		password = passIn;
		firstName = firstIn;
		lastName = lastIn;
		email = eIn;
	}
	
	public void setID(String IDIN) {
		id = IDIN;
	}
	
	public String getID() {
		return id;
	}
	
	public void setPassword(String passIn) {
		password = passIn;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String firstIn) {
		firstName = firstIn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastIn) {
		lastName = lastIn;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setEmail(String eIn) {
		email = eIn;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output = ("" + getID() + "\n" + getPassword() + "\n" + 
						  getFirstName() + " " + getLastName() + "\n" +
						  getEmail() + "\n");
		return output;
	}
} //end class