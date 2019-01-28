//
//	Iterative implementacion of insertion sort.
//
import java.util.ArrayList;

public class InsertionSort implements SortingClass {

	//
	//	Dummy function that will be called from the outside
	//		of the class. It only receives the array list containing
	// 		the elements to sort. It calls the 'sort' function using
	// 		the parameters of the original array list.
	//
	@Override
	public void sort(ArrayList<Integer> list) {
		
		insertionSort(list);
		
	}
	
	
	//
	// 	The insertion sort algorithm has an average-case
	//		of θ(n^2) and a best-case of O(n^2).
	//
	private void insertionSort(ArrayList<Integer> list) {
		
		int higherIndex = list.size();
		
		for(int i = 1; i < higherIndex; i++) {
			
			int j = i;
			
			while(list.get(j-1) > list.get(j)
					&& i > 0) {
				
				exchangeElements(list, j, j-1);
				j--;
			}
			
		}
		
	}

	
	//
	//	Auxiliary function that exchanges the 
	// 		elements of two given indexes in a list.
	//
	private void exchangeElements(
			ArrayList<Integer> list, int indexOne, int indexTwo) {

		int aux1 = list.get(indexOne),
			aux2 = list.get(indexTwo);
		
		list.set(indexOne, aux2);
		list.set(indexTwo, aux1);
		
	}
	
}
