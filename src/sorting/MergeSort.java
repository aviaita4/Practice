package sorting;

import utility.Utility;

public class MergeSort {

	public static void main(String argv[]) {
		
		int [] array = {5,4,3,2,1,6,8,4};
		
		Utility.printArray(array);
	
		// Sort
		
		array = mergeSort(array, 0, array.length-1);

		
		Utility.printArray(array);
	}

	private static int[] mergeSort(int[] array, int i, int j) {

		if(j-i < 0) return new int[0];
		if(j==i) {
			int [] ans= new int[1];
			ans[0] = array[i];
			return ans; 
		}
		
		int[] left = mergeSort(array, i, (i+j)/2);
		int[] right = mergeSort(array, (i+j)/2 + 1, j);
		
		int[] merged = new int[left.length+right.length];
		
		merge(merged,left,right);
		return merged;
	}

	private static void merge(int[] merged, int[] left, int[] right) {

		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<left.length && j<right.length) {
			if(left[i] <= right[j]) {
				merged[k] = left[i];
				i++;
			}else {
				merged[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(j<right.length) {
			merged[k] = right[j];
			j++;
			k++;
		}
		
		while(i<left.length) {
			merged[k] = left[i];
			i++;
			k++;
		}
		
	}
	
	
	
}
