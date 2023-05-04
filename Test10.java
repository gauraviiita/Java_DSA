package A2Q10;
import java.util.Scanner;
public class Test10 extends Student10{
	int mark1, mark2;
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark1 and mark2 : ");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
	}
	void output() {
		super.output();
		System.out.println("Mark1 and "
				+ "Mark2 are: "+ mark1 + " "+ mark2);
	}
}
