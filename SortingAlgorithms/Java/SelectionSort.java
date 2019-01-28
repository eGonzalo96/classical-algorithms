//
//	Iterative implementation of the 
//		selection sort algorithm.
//
import java.util.ArrayList;

public class SelectionSort implements SortingClass {
	
	
	//
	//	Dummy function that will be called from the outside
	//		of the class. It only receives the array list containing
	// 		the elements to sort. It calls the 'sort' function using
	// 		the parameters of the original array list.
	//
	@Override
	public void sort(ArrayList<Integer> list)  {
		
		selectionSort(list);
		
	}
	
	
	//
	//	The selectionsort algorithm has an average-case 
	//		complexity of θ(n^2) and a worst-case complexity
	//		of O(n^2).
	//
	private void selectionSort(ArrayList<Integer> list) {
		
		int smallerElementIndex;
		int higherIndex =
				list.size();
		
		for(int i = 0; i < higherIndex; i++) {
			
			
			smallerElementIndex = i;
			
			for(int j = i; j < higherIndex; j++) {
				
				//
				//	Getting the smaller element index in the
				//		list [i... higherIndex]
				//
				if(list.get(j) < list.get(smallerElementIndex)) {
					smallerElementIndex = j;
				}
				
			}
			
			exchangeElements(list, i, smallerElementIndex);
		}
		
	}
	
	
	//
	//	Function used to exchange the smaller element to the
	//		beginning of the array.
	//
	public void exchangeElements(
			ArrayList<Integer> list, int firstIndex, int secondIndex) {
		
		int firstElementAux  = list.get(firstIndex),
			secondElementAux = list.get(secondIndex);
		
		list.set(firstIndex, secondElementAux);
		list.set(secondIndex, firstElementAux);
		
	}

}