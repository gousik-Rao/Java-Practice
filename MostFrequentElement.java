import java.util.Scanner;
import java.util.HashMap;

public class MostFrequentElement{
    public static void main(String[] arg){
         Scanner s = new Scanner(System.in);
         
         int size = s.nextInt();
         
         int[] arr = new int[size];
         
         System.out.println("Enter array of elements:");
         for(int i = 0; i < arr.length; i++){
             arr[i] = n.nextInt();
         }
         
         HashMap<Integer, Integer> frequencyMap = HashMap<>();
         int mostFrequentElement = arr[0];
         int highestFrequency = 0;
         
         for(int num : arr){
             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
             if(frequencyMap.get(num) > highestFrequency){
                 highestFrequency = frequencyMap.get(num);
                 mostFrequentElement = num;
             }
         }
         
         System.out.println("Most frequent element is: "+mostFrequentElement);
         
    }
}
