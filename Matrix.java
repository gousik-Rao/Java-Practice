import java.util.*;

public class Matrix{
    public static void main(String args[]){
	

        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        
        Matrix m=new Matrix();
        m.display(matrix);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
        	
        	int temp=matrix[i][j];
        	
        	matrix[i][j]=matrix[j][i];
        	matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        
        System.out.println("\nRotated Matrix");
        m.display(matrix);
    
    
    }
        
    public void display(int[][] matrix){
        for(int[] row : matrix){
            for(int num : row){
                System.out.print(num+" ");
            }
            System.out.println("");
        }
	
	
    }
    
}
    
    
    
