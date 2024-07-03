package pack.Practice;

import java.util.Scanner;

public class MaxDifference {
	
	// method to find maximum difference
	public int maxDifference(int[] arr, int n ) {
		if(n < 2) {
			return 0;
		}
		int minElement = arr[0]; // min element
		int maxDifference = Integer.MIN_VALUE;// max difference
		
		for(int i = 1; i < n; i++) { // start from 2nd element
			
			// updating maxDifference
			if(arr[i] - minElement > maxDifference) {
				maxDifference = arr[i] - minElement;
			}
			
			// updating minElement
			if(arr[i] < minElement) {
				minElement = arr[i];
				
			}
		}
		
		return maxDifference;
	}
	
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter array size:");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("\nEnter Array elements:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		MaxDifference md = new MaxDifference();
		
		System.out.println("Maximum Difference: "+md.maxDifference(arr,n));
		
		s.close();
	}
	
}
