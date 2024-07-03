import java.util.Scanner;

public class Space{
    public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    String str = s.nextLine().trim();// Reads entire line and not just word
    
    StringBuilder lastWord = new StringBuilder();
    
    int length = 0, n = str.length();
    
    for(int i = n-1; i >= 0; i--){
        char currentChar = str.charAt(i);
        if(currentChar == ' ' && length > 0){
            break;
        }
        else if(currentChar != ' '){
        lastWord.append(currentChar);
            length++;
        }
    }
    
    lastWord.reverse();
    System.out.println("The last word is '"+lastWord+"' with length '"+length+"'");
   }
}
