package com.spring.basics.spring_in_5_steps;

public class BinarySearchImpl {
	
	
	private SortAlgorithm sortAlgorithm;	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// implement sorting logic 
		
		//CASE 1 scenario - Tightly coupling
		/*Bubble sort Algorithm - BinarySearchImpl is tightly couple with bubble sort, we make any changes in bubble sort, 
		then we have make changes in binarySearch 
		to make them loosly couple - try to implement in seperate class and create an instance of it*/
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}



}
