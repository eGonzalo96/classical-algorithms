//
//	Implementation according to the book
//		'Introduction to algorithms'
//		by Thomas H. Cormen
//
import java.util.ArrayList;

public class QuickSort implements SortingClass {

	//
	//	Dummy function that will be called from the outside
	//		of the class. It only receives the array list containing
	// 		the elements to sort. It calls the 'sort' function using
	// 		the parameters of the original array list.
	//
	@Override
	public void sort(ArrayList<Integer> listToOrder) {
		
		quickSort(listToOrder, 0, 
			 listToOrder.size() - 1);
		
	}
	
	//
	//	Function that implements the quicksort algorithm, which
	//  	has a  best-case and average-case complexity of Θ(n log(n)).
	// 		Its worst-case is O(n²).
	//
	private void quickSort(
			ArrayList<Integer> listToSort, int lowerIndex, int higherIndex) {
		
		if(lowerIndex < higherIndex) {
			
			//
			//	Partitioning the list according to the pivot element
			//
			int middlePoint = partition(listToSort, lowerIndex, higherIndex);
			
			//
			//	Sorting the left half of the list
			// 
			quickSort(listToSort, lowerIndex, middlePoint-1);
			
			//
			//	Sorting the right half of the list
			// 
			quickSort(listToSort, middlePoint+1, higherIndex);
			
		} 
		
	}
	
	//
	//  This function creates a partition using a pivot element
	//		of the list: every element to the right of it will be
	// 		lower; every element to the left of it will be greater.
	//
	private int partition(
			ArrayList<Integer> list, int lowerIndex, int higherIndex) {
		
		int pivot = list.get(higherIndex);
		int	i = lowerIndex - 1;
		int	j;
		
		for(j = lowerIndex; j < higherIndex; j++) {
			
			if(pivot >= list.get(j)) {
				i++;
				exchangeElements(list, i, j);
			}
		
		}
		
		exchangeElements(list, ++i, j);		
		return i;
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
