package sorting;

import utility.Utility;

public class SelectionSort {

	public static void main(String argv[]) {
		
		int [] array = {5,4,3,2,1,6,8};
		
		Utility.printArray(array);
	
		// Sort
		
		int minInd = 0;
		int min = array[minInd];
		
		for(int ind = 0; ind< array.length; ind++) {
			minInd = ind;
			min = array[minInd];
			for(int i=ind; i<array.length; i++) {
				if(array[i]<min) {
					min = array[i];
					minInd = i;
				}
			}
			swap(array, ind, minInd);
		}

		Utility.printArray(array);
	}

	private static void swap(int[] array, int ind, int minInd) {

		int temp = array[ind];
		array[ind] = array[minInd];
		array[minInd] = temp;
		
	}
	
}
