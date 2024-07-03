import java.util.Scanner;

public class Reverse{
	public static void main(String[] arg){
	    Scanner s = new Scanner(System.in);
	    String str = s.next();

	    
	    // convert String to char array
	    
	    char[] c = str.toCharArray();
	    int n = c.length;
	    for(int i=0;i < n/2;i++){
	        if(c[i] != c[n-1-i]){
	            char temp = c[i];
	            c[i] = c[n-1-i];
	            c[n-1-i] = temp;
	        }
	    }
	    
	    String revString = new String(c);
	    System.out.println(revString);
	}
	
}
