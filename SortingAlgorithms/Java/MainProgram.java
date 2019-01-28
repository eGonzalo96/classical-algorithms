//
//	This 'main' method shall run the sorting algorithm
// 		that we'll choose. It'll take the console input.
//
//	Algorithms supported until this commit:
//		1. QuickSort
//		2. MergeSort
//		3. SelectionSort
//		4. Recursive SelectionSort
//		5. InsertionSort
//
import java.util.ArrayList;

public class MainProgram {
	
	//
	//	Variable containing an object that will call
	// 	the sorting algorithm of our election.
	//
	static private SortingClass sortingObject;

	
	//
	// Main method.
	//
	public static void main(String[]  args) {
		
		if(args.length < 1) {
			sortingObject = getSortingObject(1);
		} else {
			sortingObject = getSortingObject(
					Integer.parseInt(args[0]));
		}
		
		
		ArrayList<Integer> listToSort = new ArrayList<>();
		
		listToSort.add(13); 
		listToSort.add(19); 
		listToSort.add(9); 
		listToSort.add(5); 
		listToSort.add(12); 
		listToSort.add(8); 
		listToSort.add(7); 
		listToSort.add(4); 
		listToSort.add(21);
		listToSort.add(2); 
		listToSort.add(6); 
		listToSort.add(1);
		
		System.out.println("List of integers: " + listToSort.toString());
		sortingObject.sort(listToSort);
		System.out.println("Algorithm: " + 
				sortingObject.getClass().toString());
		System.out.println("Sorting the list: " + listToSort.toString());
		
	}
	
	
	//
	//	Method returning a SortingObject. If you want to add a new
	// 		algorithm, you need to create a new SortingClass object
	//		(through the SortingClass interface) and create the
	//		corresponding object in a new case.
	//
	public static SortingClass getSortingObject(int sortingAlgorithm) {
		
		SortingClass sortingObject = null;
		
		switch(sortingAlgorithm) {
			case 1:
				sortingObject = new QuickSort();
				break;
			case 2:
				sortingObject = new MergeSort();
				break;
			case 3:
				sortingObject = new SelectionSort();
				break;
			case 4:
				sortingObject = new RecursiveSelectionSort();
				break;
			case 5:
				sortingObject = new InsertionSort();
				break;
			default:
				sortingObject = new QuickSort();
		}
		
		return sortingObject;
	}
	
}