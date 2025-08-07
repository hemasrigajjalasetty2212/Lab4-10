package pac1;
//import java.util.Scanner;
public class person {
	 
	String firstName;
	String lastName;
	char gender;
	
	
	person(String fn, String ln, char gen){
		this.firstName = fn;
		this.lastName=ln;
		this.gender=gen;
	}
		
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
		
}
 

 