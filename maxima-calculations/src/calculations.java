import java.util.Arrays;
import java.util.Scanner;

public class calculations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] numbers = new int[10];
		int counter = 0;
		boolean bool = true;
		do {
			System.out.println("Type a Number or Q if you wish to stop");
			String line = scan.nextLine();
			if (line.charAt(0) == 'q' || line.charAt(0) == 'Q') {
				bool = false;
			}
			else {
				num = Integer.parseInt(line);
				numbers[counter] = num;

				counter++;
			}
		} while (bool);

		int max = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Max = " + max);
	}

}
