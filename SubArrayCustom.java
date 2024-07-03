import java.util.*;

public class SubArrayCustom{
    public static void main(String args[]){
	

	Scanner s=new Scanner(System.in);
	SubArrayCustom sa = new SubArrayCustom();
	
	System.out.println("Enter 6 number in the array:");
	
	int[] arr = new int[6];
	for(int i=0;i<6;i++){
	arr[i]=s.nextInt();
	}
	int maxSumOfSubArray=sa.maxSumArray(arr);
	
	System.out.println("Maximum Sum of sub array:"+maxSumOfSubArray);
    }
    
    
    public int maxSumArray(int num[]){
    
        int currentSum=num[0],maxSum=num[0];
        
        for(int i=1;i<num.length;i++){
        
            currentSum=Math.max(currentSum+num[i],num[i]);
            
            
            maxSum=Math.max(maxSum,currentSum);
            
            
            
        }
        
        return maxSum;
    }
}
