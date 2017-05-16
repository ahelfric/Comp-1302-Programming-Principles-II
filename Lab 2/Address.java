/* ****************************
*	    Alex Helfrich         *
*        Comp 1302-04         *
*        Address Class        *
*	    	   Lab 2          *
**************************** */

public class Address {
	private String street;
	private String city;
	private String state;
	private int zipcode;
	
	public Address() 
	{
		setStreet("");
		setCity("");
		setState("");
		setZipcode(0);
	}
	
	public Address(String streetIn, String cityIn, String stateIn, 
				   int zipcodeIn) 
	{
		setStreet(streetIn);
		setCity(cityIn);
		setState(stateIn);
		setZipcode(zipcodeIn);
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String streetIn) {
		street = streetIn;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String cityIn) {
		city = cityIn;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String stateIn) {
		state = stateIn;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcodeIn) {
		zipcode = zipcodeIn;
	}
	
	public void display() 
	{
		String output = "" + getStreet() + "\n" + getCity() + "\n" + getState() +
						"\n" + getZipcode() + "\n";
		System.out.printf(output);
	}
	
	public static void main(String args[]) {
		Address d1;
		d1 = new Address("4578 Ramen Avenue", "Yakisoba City", 
						 "The state of Japan", 12346);
		d1.display();
	}
	
	public String toString() 
	{
		return "" + getStreet() + "\n" + getCity() + ", " + getState() 
					+ " " + getZipcode();
	}
}