public class SortMethods {
	int count = 0; //global variable count
	int heapsize; //global variable for heap sort so heapsize can be accessed in multiple methods

	/***********INSERTION SORT***********/
	public void InsertionSort(int[] array){
		count = 0; //initialize count to 0 
		int key; 
		int i=0;

		for(int j=1; j<array.length; j++){
			key = array[j];
			//insert a[j] into the sorted sequence
			i = j-1;
			while(i>=0 && array[i] > key){
				count++;
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key;
		}
		printArray(array, count); //print sorted array at end of sort
	}	

	/**************MERGE SORT**************/
	public void Merge_Sort(int[] array){
		count = 0; //initialize count to 0
		MergeSort(array, 0, array.length-1); //merge sort call with parameters
		printArray(array, count); //print sorted array at end of sort
	}
	
	private void MergeSort(int[] array, int p, int r){ //p = 0, r = length of array-1
		int q;
		if(p < r){
			q=(p+r)/2;
			MergeSort(array, p, q); //sort left half of array
		    MergeSort(array, q+1, r); //sort right half array
			Merge(array, p, q, r); //merge left and right sides of array
		}
	}

	private void Merge(int[] array, int p, int q, int r){ //p=0, q=mid r= length
		int n1 = (q-p)+1;
		int n2 = (r-q);
		int[] L = new int[n1]; //subarray for left side of array
		int[] R = new int[n2]; //subarray for right side of array

		//store values from original array into subarrays for sorting
		for(int i=0; i<n1; i++){
			L[i] = array[(p+i)];
		}
		for(int j=0; j<n2; j++){
			R[j] = array[(q+j+1)];
		}

		int i=0;
		int j=0;
		int k = p;
		
		while (i < n1 && j < n2){
			count++;
			//if value in left subarray is less than or equal than value in right subarray
			if (L[i] <= R[j]){
				array[k] = L[i];
				i++;
			}
			//if value in right subarray is less than value in left subarray
			else{
				array[k] = R[j];
				j++;
			}
			k++; //increment original array position after placing element in its sorted position
		}
		//add any remaining values left in left subarray after left and right subarray comparison
		while (i < n1){
			count++;
			array[k] = L[i];
			i++;
			k++;
		}
		//add any remaining values left in right subarray after left and right subarray comparison
		while (j < n2){
			count++;
			array[k] = R[j];
			j++;
			k++;
		}
	}

	/*************HEAP SORT***************/
	public void HeapSort(int[] array){
		count = 0; //initialize count to 0
		Build_Max_Heap(array); //array to tree representation using max heap
		//start sorting from last element to first element
		for(int i = array.length-1; i>=0; i--){
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapsize = heapsize - 1;
			Max_Heapify(array, 0); //rebalance tree by keeping bigger elements on top and smaller elements at bottom of tree
		}
		printArray(array, count); //print sorted array
	}

	private void Max_Heapify(int[] array, int i){
		int l, r, largest;
		l = 2*i+1; //left child
		r = 2*i+2; //right child
		
		if(r==array.length){ //this checks if a parent does not have a right child
			//if there is no right child we only need to analyze the left size
			if((l <= heapsize) && (array[l] > array[i])) largest = l;
			
			else largest = i;
		}
		else{ //if there is both a left and right child
			if((l <= heapsize) && (array[l] > array[i])) largest = l;
			
			else largest = i;

			if((r <= heapsize) && (array[r] > array[largest])) largest = r;
		}

		if(largest != i){
			//swap positions in tree to maintain heap property
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;
			count++;
			Max_Heapify(array, largest);
		}
	}
	
	private void Build_Max_Heap (int[] array){
		heapsize = array.length-1;
		for(int i=(array.length/2)-1; i>=0; i--){
			Max_Heapify(array, i); 
		}
	}

	/***************QUICK SORT*************/
	public void QuickSort(int[] array){
		count = 0; //initialize count to 0
		Quick_Sort(array, 0, array.length-1); //call quick sort sorting method
		printArray(array, count); //print sorted array
	}

	private void Quick_Sort(int[] array, int p, int r){
		int q;
		if(p<r){
			q = partition(array, p, r); //find pivot
			Quick_Sort(array, p, q-1); //sort elements to left of pivot
			Quick_Sort(array, q+1, r); //sort elements to right of pivot
		}
	}
	//method to split array using a pivot
	private int partition(int[] array, int p, int r){
		int x = array[r]; //set x to last element in array and use that as partition pivot
		int i = p-1; //set i to starting index of array
		for(int j=p; j<=r-1; j++){
			count++;
			//if element in jth position is less than or equal to pivot
			//swap element in ith position with element in jth position
			if(array[j] <= x){
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		array[r] = array[i+1];
		array[i+1] = x;
		return i+1;
	}	
	
	//Method to print sorted array
	private void printArray(int[] array, int count){
		System.out.println("Count: " +count+ " for array of size " + array.length);
		//commented out code was to get output from index 50-100
//		if (array.length>64){
//			for(int i=50; i<=100; i++){
//				System.out.print(array[i] + " ");
//			}
//		}
//		else{
			for(int i=0; i< array.length; i++){
				System.out.print(array[i] + " ");
			}
//		}
		System.out.println();
		System.out.println();
	}

}
