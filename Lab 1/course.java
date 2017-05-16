/* ****************************
*		 Alex Helfrich        *
*        Comp 1302-04         *
*        Course Class         *
**************************** */

public class Course {
	private int courseID;
	private String courseName;
	private String description;
	private int creditHours;
	
	public Course() 
	{
		setCourseID(0);
		setCourseName("");
		setCreditHours(0);
		setDescription("");
	}
	
	public Course(int courseIDIn, String courseNameIn, String descriptionIn,
					int creditHoursIn) 
	{
		setCourseID(courseIDIn);
		setCourseName(courseNameIn);
		setDescription(descriptionIn);
		setCreditHours(creditHoursIn);
	}
	
	public int getCourseID() {
		return courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getCreditHours() {
		return creditHours;
	}
	
	public void setCourseID(int courseIDIn) {
		courseID = courseIDIn;
	}
	
	public void setCourseName(String courseNameIn) {
		courseName = courseNameIn;
	}
	
	public void setDescription(String descriptionIn) {
		description = descriptionIn;
	}
	
	public void setCreditHours(int creditHoursIn) {
		creditHours = creditHoursIn;
	}
	
	public void display() 
	{
		String output = "" + this.getCourseID() + "\n" + this.getCourseName() + 
					"\n" + this.getDescription() + "\n" + this.getCreditHours() 
					+ "\n";
		System.out.printf(output);
	}
	
	public static void main(String args[]) {
		Course c1;
		c1 = new Course(1302, "Programming II", "Description", 4);
		c1.display();
	}
}