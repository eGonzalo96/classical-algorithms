//
//
//
import java.util.ArrayList;

public class MergeSort implements SortingClass {

	
	//
	//	Dummy function that will be called from the outside
	//		of the class. It only receives the array list containing
	// 		the elements to sort. It calls the 'sort' function using
	// 		the parameters of the original array list
	@Override
	public void sort(ArrayList<Integer> list) {
	
		mergeSort(list, 0, list.size()-1);
		
	}
	
	
	//	Function that implements the 'mergeSort' algorithm,
	// 		This algorithm has an average-case complexity of Θ(n log(n))
	//		and a worst-case complexity of O(n log(n)).
	//
	private void mergeSort(
			ArrayList<Integer> list, int lowerIndex, int higherIndex) {
		
		if(higherIndex > lowerIndex) {
			
			//
			//	Getting the middle point of the array.
			//
			int middlePoint = (higherIndex + lowerIndex)/2;
			
			//
			//	Left side of the array
			//
			mergeSort(list, lowerIndex, middlePoint);
			
			//
			//	Right side of the array
			//
			mergeSort(list, middlePoint+1, higherIndex);
			
			//
			//	Merging both lists
			//
			merge(list, lowerIndex, middlePoint, higherIndex);
		} 
	}
	
	
	//
	// 
	//
	private void merge(ArrayList<Integer> list, 
			int lowerIndex, int middlePoint, int higherIndex) {
		
		// 	Template array list
		ArrayList<Integer> newList = new ArrayList<>();
		
		// 	Indexes 
		int leftIndex  = lowerIndex,
			rightIndex = middlePoint + 1,
			extraIndex;
		
		//
		//	Comparing and merging the list elements in the new list
		//
		while(leftIndex <= middlePoint && rightIndex <= higherIndex) {
			
			int leftElement  = list.get(leftIndex);
			int rightElement = list.get(rightIndex);
			
			if(leftElement <= rightElement) {
				newList.add(leftElement);
				leftIndex++;
			} else if(leftElement >= rightElement) {
				newList.add(rightElement);
				rightIndex++;
			}
			
		} 
		
		int top,
			init;
		
		//
		//	If there's any element left, we must
		// 		get it into the new list.
		//
		if(leftIndex > middlePoint) {
			top  = higherIndex;
			init = rightIndex;		
		} else {
			top  = middlePoint;
			init = leftIndex;
		}
		
		
		for(extraIndex = init;
				extraIndex <= top;
				extraIndex++) {
				
			newList.add(list.get(extraIndex));
		}
		
		//
		//	New list elements get into the original list.
		//
		int newListIndex = 0;
		for(extraIndex = lowerIndex; 
				extraIndex <= higherIndex; 
				extraIndex++) {
			
			list.set(extraIndex, newList.get(newListIndex++));
		}
			
	}
	

}

