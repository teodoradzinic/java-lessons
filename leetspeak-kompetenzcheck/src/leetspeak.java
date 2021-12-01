import java.util.Scanner;

public class leetspeak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Type some text:");
		String text = scan.nextLine();
		text = text.toUpperCase();

		char[] chars = text.toCharArray();

		char[] alpha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] leetspeak = { '@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R',
				'$', '7', 'U', 'V', 'W', 'X', 'Y', '2' };

		for (int i = 0; i < chars.length; i++) {
			
			for (int j = 0; j < alpha.length; j++)
				
				if (chars[i] == alpha[j]) {
					chars[i] = leetspeak[j];
				}
		}
		
		text = String.valueOf(chars);
		System.out.println(text);
	}

}
