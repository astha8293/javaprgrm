import java.util.Scanner;

public class name
{
	public static void main(String args[])
	{
		String fname , lname;
		int age;
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first name :");
		fname = ab.next();
		System.out.println("Enter last name :");
		lname = ab.next();
		System.out.println("Enter age:");
		age = ab.nextInt();

		System.out.println("First Name = " +fname);
		System.out.println("Last Name = " +lname);
		System.out.println("Age = " +age);
	}
}

