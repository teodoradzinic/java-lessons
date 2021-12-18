import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int array[] = { 25, 20, 35, 40, 1, 12 }; // array to sort

		for (int i = 0; i < array.length; i++) { // going through every element in array

			while (i > 0 && array[i] < array[i - 1]) { // comparing the element to the previous one, if the value is
				int element = array[i]; // lower then they change places
				array[i] = array[i - 1];
				array[i - 1] = element; // // changing places
				i--; // also checking all the previous elements
			}

		}
		System.out.println(Arrays.toString(array));
	}

}
