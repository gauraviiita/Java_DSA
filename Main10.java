package A2Q10;
import java.util.*;
public class Main10 {

	public static void main(String[] args) {
		Test10 t1 = new Test10();
		t1.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score1 and 2: ");
		int grandtotal = t1.mark1 + t1.mark2 + Sport10.score1 + Sport10.score2;
		t1.output();
		System.out.println("Grand total is: " + grandtotal);
	}

}
