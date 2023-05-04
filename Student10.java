package A2Q10;
import java.util.Scanner;
public class Student10 {
	String name;
	int roll;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your roll number: ");
		roll = sc.nextInt();
	}
	void output() {
		System.out.println("Name: "+ name);
		System.out.println("Roll number: "+ roll);
	}
}
