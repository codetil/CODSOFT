import java.util.*;
public class Task_no_2 {
    //Task no 2 :- Student grade calculator...
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Welcome! \nStudent Grade Calculator...\nEnter number of subjects : ");
     int numSubjects = sc.nextInt();
     int[] marks = new int [numSubjects];
     int totalmarks = 0;

     for(int i=0; i<numSubjects; i++){
        System.out.println("Enter marks for subject "+(i+1)+": ");
        marks[i] = sc.nextInt();
        while (marks[i] < 0 || marks[i] > 100) {
            System.out.println("Invalid input!\n Please enter marks between 0 and 100: ");
            marks[i] = sc.nextInt();
        } 
        totalmarks += marks[i];
     }
     // Calculate average percentage
     double averagePercentage = (double) totalmarks / numSubjects;

     // Grade calculation
     char grade;
     if (averagePercentage >= 90) {
         grade = 'A';
     } else if (averagePercentage >= 80) {
         grade = 'B';
     } else if (averagePercentage >= 70) {
         grade = 'C';
     } else if (averagePercentage >= 60) {
         grade = 'D';
     } else if (averagePercentage >= 50) {
        grade = 'E';
    }  else {
         grade = 'F';
     }

     // Displaying results
     System.out.println("Total Marks: " + totalmarks);
     System.out.println("Average Percentage: " + averagePercentage+" %");
     System.out.println("Grade: " + grade);
     sc.close();
    }  
}
