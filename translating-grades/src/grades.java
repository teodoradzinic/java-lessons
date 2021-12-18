import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("type the grade");
		int grade = scan.nextInt();

		switch (grade) {
		case 1: System.out.println("very good");
		case 2:
			System.out.println("good");
		case 3:
			System.out.println("satisfactory");
		case 4:
			System.out.println("sufficient");
		case 5:
			System.out.println("not sufficient");
			default: throw new IllegalStateException("Unexpected value: " + grade);
		}

	}

}
