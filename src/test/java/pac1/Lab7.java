package pac1;

import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		person p = new person("Hemasri","Gajjalasetty",'F');
		Contact c =new Contact("6303511218");
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFirstName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		System.out.println("Phone Number: "+c.contact);
		
	}
}
