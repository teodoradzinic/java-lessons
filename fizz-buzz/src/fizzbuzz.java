
public class fizzbuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			fizzBuzz(i);
		}
	}

	public static void fizzBuzz(int i) { // revision
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.printf("FizzBuzz(%d)!\n", i);
		} else if (i % 3 == 0) {
			System.out.printf("Fizz(%d)!\n", i);
		} else if (i % 5 == 0) {
			System.out.printf("Buzz(%d)!\n", i);
		} else {
			System.out.println(i + "!");
		}
	}
}
