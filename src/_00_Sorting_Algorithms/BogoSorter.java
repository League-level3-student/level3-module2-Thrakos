package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	
	Random rand = new Random();
	Random ran = new Random();
	
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		while (!intArraySorted(array)) {
			
			int ran1 = rand.nextInt(array.length);
			int ran2 = ran.nextInt(array.length);
			
			int placeholder = array[ran1];
			int two = array[ran2];
			
			array[ran1] = two;
			array[ran2] = placeholder;
			
			display.updateDisplay();
			
		}
		
	}
	
	static boolean intArraySorted(int[] array) {
		
		boolean hrmmmnrmmm = true;
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				hrmmmnrmmm = false;
			}
		}
		return hrmmmnrmmm;
	}
	
}
