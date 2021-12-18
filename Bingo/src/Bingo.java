
import java.util.ArrayList;

public class Bingo {

	public static void main(String[] args) {

		int number;
		int index = 0;
		int column = 0;
		int increment = 1;

		System.out.println(" * * * * * * * * * * * * * ");
		System.out.printf("| %1s  | %1s  | %1s  | %1s  | %1s  |\n", "B", "I", "N", "G", "O");
		System.out.println(" * * * * * * * * * * * * * ");

		int[][] card = new int[5][5];
		ArrayList<Integer> list = new ArrayList<>();
		while (column < card.length) {

			while (list.size() < 5) {
				number = (int) (Math.random() * 15) + increment;

				if (!list.contains(number))
					list.add(number);
			}
			for (int i = 0; i < list.size(); i++) {
				card[index++][column] = list.get(i);
			}

			index = 0;

			increment += 15;

			list.clear();

			column++;
			card[2][2] = 0;
		}

		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card.length; j++) {
				System.out.printf("| %2d ", card[i][j]);
			}
			System.out.println("|");
		}
		System.out.println(" * * * * * * * * * * * * * ");
	}

}
