package ads;

public class Algorithm {
	
	private static int findMinimum(int[] array, int start, int end) {
		int lowest = array[start];
		int index = start;
		for (int i = start + 1; i < end; i++) {
			if (array[i] < lowest) {
				lowest = array[i];
				index = i;
			}
		}
		return index;
	}

	private static int findMinimum(int[] array) {
		return findMinimum(array, 0, array.length);
	}
	
	private static void swap(int arr[], int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	static void bubbleSort(int[] array) {
		boolean sorted = false;
		boolean firstRun = true;
		while (firstRun || !sorted) {
			firstRun = false;
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					sorted = false;
				}
			}
		}
	}
	
	static void linearSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = findMinimum(array, i, array.length);
			swap(array, index, i);
		}
	}
	
	static void quickSort(int[] array) {
		
	}

}
