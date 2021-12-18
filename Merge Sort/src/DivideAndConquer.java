import java.util.Arrays;
import java.util.Random;

public class DivideAndConquer {

	public static void main(String args[]) {
		Random random = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) { // creating a random array
			array[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(array).replace('[', ' ').replace(']', ' '));

		sort(array);
		
		System.out.println(Arrays.toString(array).replace('[', ' ').replace(']', ' '));
		System.out.println();
		System.out.println("Maximum value is: " + array[0]);

	}

	public static void sort(int[] array) {
		int arrayLength = array.length;
		if (arrayLength < 2) {
			return; //leave the method because there is nothing to be divided
		}
		int middle = arrayLength / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[arrayLength - middle];

		for (int i = 0; i < middle; i++) {
			leftArray[i] = array[i];
		}
		for (int i = middle; i < arrayLength; i++) {
			rightArray[i - middle] = array[i];
		}

		sort(leftArray);
		sort(rightArray);

		merge(array, leftArray, rightArray);

	}

	public static void merge(int[] array, int[] leftArray, int[] rightArray) {

		int leftLength = leftArray.length;
		int rightLength = rightArray.length;

		int i = 0, j = 0, k = 0;
		while (i < leftLength && j < rightLength) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < leftLength) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < rightLength) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
