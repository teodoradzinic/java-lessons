import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("type a num");
		int number = scan.nextInt();

		if ((number % 10) == 0) {
			System.out.println("Number is round");
		} else {
			System.out.println("Number is not round");
		}
		if ((number % 2) == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is not even");
		}
		int luckyNumber = 14;
		if (number == luckyNumber) {
			System.out.println("Number is your lucky number");
		} else {
			System.out.println("Number is not a lucky number :((((");
		}
		if (number > 9 && number <100) {
			System.out.println("number has two digits");
		}else {
			System.out.println("number does not have two digits");
		}
	}
}
