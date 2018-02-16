package sorting;

public class InsertionSort {

public static void main(String argv[]) {
		
		int [] array = {5,4,3,2,1,6,8};
		
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
	
		// Sort
		
		int minInd = 0;
		int min = array[minInd];
		
		for(int i=0; i<array.length-1; i++) {
			if(array[i+1] < array[i]) {
				int j = 0;
				while(array[i+1]>=array[j]) j++;
				insert(array, i+1, j);
			}
		}
		
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

private static void insert(int[] array, int i, int j) {

	int temp = array[i];
	
	for(int ind = i; ind>j; ind--) {
		array[ind] = array[ind-1];
	}
	
	array[j] = temp;
}

	
}
