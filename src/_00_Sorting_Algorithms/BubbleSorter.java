package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		if (!intArraySorted(array)) {
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						int placeholder = array[j];
						array[j] = array[i];
						array[i] = placeholder;
				//		display.updateDisplay();
					}
				}
			}
		}
		
		display.updateDisplay();
		
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
