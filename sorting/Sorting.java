package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static Random random = new Random();
	public static int randomInt;
	static int[] arr = new int[15]; //The array we will be sorting, has a predifined length of 15, this ofcourse can be changed later
	public static boolean isSorted = false; //Is true when the array is sorted
	public static int temp;
	
	//static int arr[] =  new int[] {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
	
	public static void main(String[] args) {
		generateArray(arr);
		printArray(arr);
		sortArray(arr);
		printArray(arr);
	}

	private static void printArray(int[] array) { //Method to print the array in a readable fashion ([I@6d06d69c) is just rubbish
		if(isSorted){
			System.out.println("The sorted array is: ");
			System.out.println(Arrays.toString(arr)); //Thanks Java 5 for adding this 
		}else if(!isSorted){
			System.out.println("The unsorted array is: ");
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void sortArray(int[] array) {
		System.out.println("Sorting array...");
		for(int j = 0; j<array.length; j++){
			for(int n = 0; n < array.length - 1; n++){
				if(array[n] > array[n+1]){
					temp = array[n+1]; //Store var in temp var
					array[n+1] = array[n]; //Store bigger int in next spot
					array[n] = temp; //Put smaller number in previous spot
			
				}	
			}
		}	
		
		isSorted = true; //For funzies
	}

	private static void generateArray(int[] array) {
		for(int i = 0; i < array.length; i++){ //filling the array
			randomInt = random.nextInt(10000); //get a random number ranging from 0-1000
			array[i] = randomInt;
		}
		
	}

}
