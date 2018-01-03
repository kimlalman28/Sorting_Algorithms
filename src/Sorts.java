import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * Kimberly Lalmansingh
 * CSCI 323 Assignment 1
 */

public class Sorts {
	//Each array will hold the elements of the respected file read in and will then 
	//be altered by the sort method and will then contain the elements in sorted order
	static int[] ISarray8 = new int[8];
	static int[] ISarray16 = new int[16];
	static int[] ISarray32 = new int[32];
	static int[] ISarray64 = new int[64];
	static int[] ISarray128 = new int[128];
	static int[] ISarray256 = new int[256];
	static int[] ISarray512 = new int[512];
	static int[] ISarray1024 = new int[1024];
	static int[] ISarray2048 = new int[2048];
	static int[] ISarray4096 = new int[4096];
	static int[] ISarray8192 = new int[8192];
	static int[] ISarray16384 = new int[16384];
	
	static int[] MSarray8 = new int[8];
	static int[] MSarray16 = new int[16];
	static int[] MSarray32 = new int[32];
	static int[] MSarray64 = new int[64];
	static int[] MSarray128 = new int[128];
	static int[] MSarray256 = new int[256];
	static int[] MSarray512 = new int[512];
	static int[] MSarray1024 = new int[1024];
	static int[] MSarray2048 = new int[2048];
	static int[] MSarray4096 = new int[4096];
	static int[] MSarray8192 = new int[8192];
	static int[] MSarray16384 = new int[16384];
	
	static int[] HSarray8 = new int[8];
	static int[] HSarray16 = new int[16];
	static int[] HSarray32 = new int[32];
	static int[] HSarray64 = new int[64];
	static int[] HSarray128 = new int[128];
	static int[] HSarray256 = new int[256];
	static int[] HSarray512 = new int[512];
	static int[] HSarray1024 = new int[1024];
	static int[] HSarray2048 = new int[2048];
	static int[] HSarray4096 = new int[4096];
	static int[] HSarray8192 = new int[8192];
	static int[] HSarray16384 = new int[16384];
	
	static int[] QSarray8 = new int[8];
	static int[] QSarray16 = new int[16];
	static int[] QSarray32 = new int[32];
	static int[] QSarray64 = new int[64];
	static int[] QSarray128 = new int[128];
	static int[] QSarray256 = new int[256];
	static int[] QSarray512 = new int[512];
	static int[] QSarray1024 = new int[1024];
	static int[] QSarray2048 = new int[2048];
	static int[] QSarray4096 = new int[4096];
	static int[] QSarray8192 = new int[8192];
	static int[] QSarray16384 = new int[16384];
	
	
	public static void main(String args[]){
		//create a SortMethods object that will allow methods in class to be used
	    SortMethods S = new SortMethods();
	    //Insertion Sort on all 12 arrays
		System.out.println("INSERTION SORT");
		System.out.println();
		
		//Files will first be read in and elements will be stored in arrays before sorts are called
		storeElements("Num8.txt", ISarray8, MSarray8, HSarray8, QSarray8);
		S.InsertionSort(ISarray8);
		
		storeElements("Num16.txt", ISarray16, MSarray16, HSarray16, QSarray16);
		S.InsertionSort(ISarray16);
	
		storeElements("Num32.txt", ISarray32, MSarray32, HSarray32, QSarray32);
		S.InsertionSort(ISarray32);
		
		storeElements("Num64.txt", ISarray64, MSarray64, HSarray64, QSarray64);
		S.InsertionSort(ISarray64);
		
		storeElements("Num128.txt", ISarray128, MSarray128, HSarray128, QSarray128);
		S.InsertionSort(ISarray128);
		
		storeElements("Num256.txt", ISarray256, MSarray256, HSarray256, QSarray256);
		S.InsertionSort(ISarray256);
		
		storeElements("Num512.txt", ISarray512, MSarray512, HSarray512, QSarray512);
		S.InsertionSort(ISarray512);
		
		storeElements("Num1024.txt", ISarray1024, MSarray1024, HSarray1024, QSarray1024);
		S.InsertionSort(ISarray1024);
		
		storeElements("Num2048.txt", ISarray2048, MSarray2048, HSarray2048, QSarray2048);
		S.InsertionSort(ISarray2048);
		
		storeElements("Num4096.txt", ISarray4096, MSarray4096, HSarray4096, QSarray4096);
		S.InsertionSort(ISarray4096);
		
		storeElements("Num8192.txt", ISarray8192, MSarray8192, HSarray8192, QSarray8192);
		S.InsertionSort(ISarray8192);
		
		storeElements("Num16384.txt", ISarray16384, MSarray16384, HSarray16384, QSarray16384);
		S.InsertionSort(ISarray16384);
			
	
	runMergeSorts(S); //will run Merge Sort for all 12 arrays
	runHeapSorts(S); //will run Heap Sort for all 12 arrays
	runQuickSorts(S); //will run Quick Sort for all 12 arrays
	}
	
	public static void runMergeSorts(SortMethods S){
		//Method to make Merge Sort calls
		System.out.println();
		System.out.println("MERGE SORT");
		System.out.println();
		
		S.Merge_Sort(MSarray8);
		S.Merge_Sort(MSarray16);
		S.Merge_Sort(MSarray32);
		S.Merge_Sort(MSarray64);
		S.Merge_Sort(MSarray128);
		S.Merge_Sort(MSarray256);
		S.Merge_Sort(MSarray512);
		S.Merge_Sort(MSarray1024);
		S.Merge_Sort(MSarray2048);
		S.Merge_Sort(MSarray4096);
		S.Merge_Sort(MSarray8192);
		S.Merge_Sort(MSarray16384);
	}
	
	public static void runHeapSorts(SortMethods S){
		//Method to make Heap Sort calls
		System.out.println();
		System.out.println("HEAP SORT");
		System.out.println();
		
		S.HeapSort(HSarray8);
		S.HeapSort(HSarray16);
		S.HeapSort(HSarray32);
		S.HeapSort(HSarray64);
		S.HeapSort(HSarray128);
		S.HeapSort(HSarray256);
		S.HeapSort(HSarray512);
		S.HeapSort(HSarray1024);
		S.HeapSort(HSarray2048);
		S.HeapSort(HSarray4096);
		S.HeapSort(HSarray8192);
		S.HeapSort(HSarray16384);	
	}
	
	
	public static void runQuickSorts(SortMethods S){
		//Method to make Quick Sort calls
		System.out.println();
		System.out.println("QUICK SORT");
		System.out.println();
	
		S.QuickSort(QSarray8);
		S.QuickSort(QSarray16);
		S.QuickSort(QSarray32);
		S.QuickSort(QSarray64);
		S.QuickSort(QSarray128);
		S.QuickSort(QSarray256);
		S.QuickSort(QSarray512);
		S.QuickSort(QSarray1024);
		S.QuickSort(QSarray2048);
		S.QuickSort(QSarray4096);
		S.QuickSort(QSarray8192);
		S.QuickSort(QSarray16384);
	}
	
	public static void storeElements(String f, int[] array1, int[] array2, int[] array3, int[] array4){
		//Method will read in file and read each element line by line and store them in the arrays that were passed by the function
		File input = new File (f);
		int i=0; //I will be storing elements starting from index 0
		try {
			Scanner line = new Scanner(input);
			String element = line.nextLine();
			
			while(!element.isEmpty()){
				//store element in arrays
				array1[i] = Integer.parseInt(element);
				array2[i] = Integer.parseInt(element);
				array3[i] = Integer.parseInt(element);
				array4[i] = Integer.parseInt(element);
				i++;
				element = line.nextLine();
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
} //end class
