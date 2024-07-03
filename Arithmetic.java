// package Mypack;

public class Arithmetic{
	int a,b;
	Arithmetic ar;
    public Arithmetic(int a,int b){
    	this.a = a;
    	this.b = b;
    }
    public static void main(String[] arg){
        Arithmetic ar = new Arithmetic(24,6);
        
        ar.add(20,5);
    }
    
    public void add(int a,int b){
        System.out.println(a + b);
    }
    
}
