import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("type a number");
		int number = scan.nextInt();
		if (number < 25 && number >= 0) {
		
			switch (number) {
			case 0, 1, 2, 3, 4, 5, 6, 7, 17, 18, 19, 20, 21, 22, 23, 24:
				System.out.println("free time");
				break;
			case 8, 9, 10, 11, 13, 14, 15, 16:
				System.out.println("work time");
				break;
			case 12:
				System.out.println("lunch break");
				break;
			}
		}
	}

}
