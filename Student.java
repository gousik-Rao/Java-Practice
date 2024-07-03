import java.util.Scanner;

public class Student{
    private String name;
    private int[] grades;
    private int gradeCount;
    
    // constructor
    public Student(String name, int maxGrades){
        this.name = name;
        this.grades[] = new int[maxGrades];
        this.gradeCount = 0;
    }
    
    public void addGrade(int grade){
        if(gradeCount < grades.length){
            grades[gradeCount] = grade;
            gradeCount++;
        }else{
            System.out.println("Cannot add more grades");
    }
    
    public double calculateAverage(){
        if(gradeCount == 0){
            return 0;
        }
         int sum = 0;
         for(int i = 0; i < gradeCount; i++){
             sum += grades[i];
         }
         
         return (double) sum / gradeCount;
    }
    
    public void printStudentInfo(){
    
    }
    
    
}
