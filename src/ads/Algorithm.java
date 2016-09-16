package ads;

import java.util.Random;

public class Algorithm {

	/** Sorts an int array using the bubble sort algorithm.
	 * @param array The int array that is going to be sorted.
	 */
	static void bubbleSort(int[] array) {
		boolean sorted = false;
		boolean firstRun = true;
		
		while (firstRun || !sorted) {
			firstRun = false;
			sorted = true;
			
			/* Traverses the array and if the current element is higher
			 * than than the next, the elements swap place. */
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					sorted = false;
				}
			}
		}
	}
	
	/** Sorts an int array using the linear sort algorithm.
	 * @param array The int array that is going to be sorted.
	 */
	static void linearSort(int[] array) {
		/* Finds the lowest value and swaps the that value with the value at first index.
		 * The algorithm is now finished with this index and goes to the next and repeats. */
		for (int i = 0; i < array.length - 1; i++) {
			int index = findMinimum(array, i, array.length);
			swap(array, index, i);
		}
	}
	
	/** Sorts an int array using the quicksort algorithm.
	 * @param array The int array that is going to be sorted.
	 */
	public static void quickSort(int[] array) {
		/* The wall is an index that specifies the unsorted part of the array.
		 * The elements to the left of the wall is sorted
		 * and the elements to the right is not. */
		int wall = 0;
		
		// Do sorting until the wall is moved completely to the right
		while (wall < array.length - 1) {
			
			/* The pivot element is the last element in the array
			 * and is the one being compared. */
			int pivot = array[array.length - 1];
			
			// Loop through all the elements on the right side of the wall
			for (int i = wall; i < array.length; i++) {
				int current = array[i];
				if (current < pivot) {
					/* If the current element is smaller than the pivot,
					 * those elements swap place,
					 * and the wall is moved one element to the right. */
					swap(array, wall, i);
					pivot = array[array.length - 1];
					wall++;
				} else if (i == array.length - 1) {
					/* When the unsorted side has been traversed,
					 * the element to the right of the wall
					 * and the pivot are swapped. */
					swap(array, wall, array.length - 1);
					pivot = array[array.length - 1];
					wall++;
				}
			}
		}
	}
	
	/** Searches a part of an int array for the element with the lowest value.
	 * @param array The int array to search.
	 * @param start The start index to start the search.
	 * @param end The end index to stop the search.
	 * @return Returns the index with the lowest value.
	 */
	public static int findMinimum(int[] array, int start, int end) {
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

	/** Finds the index of the int array element with the lowest value.
	 * @param array The int array to search.
	 * @return Returns the index with the lowest value.
	 */
	public static int findMinimum(int[] array) {
		return findMinimum(array, 0, array.length);
	}
	
	/** Searches a part of an int array for the element with the highest value.
	 * @param array The int array to search.
	 * @param start The start index to start the search.
	 * @param end The end index to stop the search.
	 * @return Returns the index with the highest value.
	 */
	public static int findMaximum(int[] array, int start, int end) {
		int highest = array[start];
		int index = start;
		for (int i = start + 1; i < end; i++) {
			if (array[i] > highest) {
				highest = array[i];
				index = i;
			}
		}
		return index;
	}
	
	/** Finds the index of the int array element with the highest value.
	 * @param array The int array to search.
	 * @return Returns the index with the highest value.
	 */
	public static int findMaximum(int[] array) {
		return findMaximum(array, 0, array.length);
	}
	
	/** Swaps two elements in an int array
	 * @param array The array to perform the swapping on.
	 * @param i Index of the first element.
	 * @param j Index of the second element.
	 */
	public static void swap(int array[], int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}
	
	public static int[] randPermutable(int n) {
		Random r = new Random();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = r.nextInt(n) + 1;
		}
		return array;
	}


}
