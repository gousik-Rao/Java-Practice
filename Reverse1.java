import java.util.*;

public class Reverse1{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        
        StringBuilder reverse = new StringBuilder();
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        
        for(int i = 0;i < str.length(); i++){
            char currentChar = str.charAt(i);
            reverse.append(currentChar);
        }
        
        reverse.reverse();
        System.out.println(reverse.toString());
        
    }
}
