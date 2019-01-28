import java.util.ArrayList;

public interface SortingClass {
	
	//
	// 	Interface used as an abstraction of the sorting algorithms.
	// 		'sort' method will call the corresponding algorithm in the class.
	//
	//	For example, inside the class "MergeSort", 'sort' method will call:
	//			mergeSort(list, 0, list.size()-1);
	//		where 'mergeSort' is a private and static method of the class.
	//
	//	This interface follows the 'Dependency Inversion Principle' and
	//		'Open-Closed Principle', both postulated by Uncle Bob.
	// 	
	public void sort(ArrayList<Integer> list);
}
