import java.util.Scanner;

public class chiffre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type some text");
		String text = scan.nextLine();

		System.out.println("Type a shift value between 1-26: ");
		int shift = scan.nextInt();
		if (shift > 0 && shift <= 26) {

			char[] chars = text.toCharArray();
			int lenght = chars.length;
			char[] newChars = new char[lenght];

			for (int i = 0; i < chars.length; i++) {
				int ascii = (int) chars[i];

				if (ascii >= 'A' && ascii <= 'Z') {
					if (ascii + shift > 'Z') {
						ascii = (ascii + shift + 'A'-1) % 'Z' ;
						newChars[i] += (char) ascii;
					} else {
						ascii += shift;
						newChars[i] += (char) ascii;
					}
				} else if (ascii >= 'a' && ascii <= 'z') {
					if (ascii + shift > 'z') {
						ascii = (ascii + shift + 'a'-1) % 'z' ;
						newChars[i] += (char) ascii;
					} else {
						ascii += shift;
						newChars[i] += (char) ascii;
					}
				}

				ascii = 0;
			}

			text = String.valueOf(newChars);
			System.out.println("Encrypted text: " + text);
		}else 
			System.out.println("invalid shift value");
	}

}
