public class SubArray{
    public static void main (String []args){
	int i,cSum=0,mSum=Integer.MIN_VALUE;
	int[] arr={-2,1,-3,4,-1,2,1,-5,4};

	for(i=0;i<arr.length;i++){
	    if(cSum < 0){
		cSum=0;
	    }
	    cSum+=arr[i];
	    mSum=Math.max(mSum,cSum);
	}
	System.out.println(mSum);
    }
}
