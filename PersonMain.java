package pac1;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		person p = new person("Hemasri","Gajjalasetty",'F');
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFirstName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		


	}

}
