import java.util.*;

public class LargestNumber{
    public static void main(String[] arg){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        int[] arr = new int[5];
        System.out.println("Enter a array of numbers: ");
        Scanner s = new Scanner(System.in);
        
	for(int i = 0;i < arr.length;i++){
	    arr[i] = s.nextInt();
	}
	
	for(int i=0;i<arr.length;i++){
	
	    if(arr[i] > largest){
	        secondLargest = largest;
	        largest = arr[i];
	    }
	    else if(arr[i] > secondLargest && arr[i] != largest){
	        secondLargest = arr[i];
	    }
    
        }
        
        
        System.out.println("Second Largest number is: "+secondLargest);
    }
}
	    
