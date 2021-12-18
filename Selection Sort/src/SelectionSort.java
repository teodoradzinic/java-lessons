import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) { // creating a random array
			array[i] = random.nextInt(100);
		}
		System.out.println("Unsorted Array:" + Arrays.toString(array).replace('[', ' ').replace(']', ' ')); // printing unsorted array

		for (int i = 0; i < array.length - 1; i++) {
			int min = i; // taking a index of the first unsorted element
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) { // comparing element to the elements on the right
					min = j; // taking index of smaller element
				}
			}
			if (min != i) { // swapping the values between smaller element and unsorted element
				int smaller = array[i];
				array[i] = array[min];
				array[min] = smaller;
			}
		}
		System.out.println();
		System.out.println("Sorted Array:" + Arrays.toString(array).replace('[', ' ').replace(']', ' ')); // printing sorted array
	}

}
