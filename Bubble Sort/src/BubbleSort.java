import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 17, 55, 64, 2, 8, 25 };
		boolean sorted = false;
		int counter = array.length - 1;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < counter; i++) {

				if (array[i] > array[i + 1]) {
					int element = array[i];
					array[i] = array[i + 1];
					array[i + 1] = element;
					sorted = false;
				}
			}
			counter--;
		}
		System.out.println(Arrays.toString(array));

	}

}
