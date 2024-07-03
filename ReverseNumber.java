import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        
        // convert integer to string
        String str = Integer.toString(num);
        StringBuilder strb = new StringBuilder(str);
        
        // reverse the string using reverse method in StringBuilder
        strb.reverse();
        
        // print the reversed string
        
        System.out.println(strb.toString());
        // System.out.println(reverseUsingArithmetic(num));
        
        s.close();
    }
    
    // To reverse a number without using StringBuilder class
    public static int reverseUsingArithmetic(int num){
        int reversedNum = 0;
        while(num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return reversedNum;
    }
}
