//
//	Recursive implementation of
//		the selection sort algorithm
//
import java.util.ArrayList;

public class RecursiveSelectionSort implements SortingClass {

	//
	//	Dummy function that will be called from the outside
	//		of the class. It only receives the array list containing
	// 		the elements to sort. It calls the 'sort' function using
	// 		the parameters of the original array list.
	//
	@Override
	public void sort(ArrayList<Integer> list) {
		
		recursiveSelectionSort(list, 0);
		
	}
	
	
	//
	// Unknown (by me) time complexity.
	//
	private void recursiveSelectionSort(
			ArrayList<Integer> list, int initialIndex) {
		
		int higherIndex = 
				list.size();
		
		if(initialIndex != higherIndex) {
		
			int i;
			int smallerElementIndex = initialIndex;
			
			for(i = initialIndex; i < higherIndex; i++) {
				
				//
				//	Getting the smaller element index in the
				//		list [initialIndex... higherIndex]
				//
				if(list.get(i) < list.get(smallerElementIndex)) {
					smallerElementIndex = i;
				}						
			}
			
			exchangeElements(list, initialIndex, smallerElementIndex);
			
			//
			//	Working on the next sublist of the main list.
			//
			recursiveSelectionSort(list, ++initialIndex);
		}
		
	}
	
	
	//
	//	Function used to exchange the smaller element to the
	//		beginning of the array.
	//
	private void exchangeElements(
			ArrayList<Integer> list, int firstIndex, int secondIndex) {
		
		int firstElementAux  = list.get(firstIndex),
			secondElementAux = list.get(secondIndex);
		
		list.set(firstIndex, secondElementAux);
		list.set(secondIndex, firstElementAux);
		
	}
	
}
