//Lance Daniel - CSCI 1370 Software Development w/ Java
//University of Houston - Clear Lake  Summer 2017 
//For more info, contact me at LinkedIn:// lance-daniel

import java.util.*;
public class lettergrade {

public static void main(String[] args) {

int grade = 0;
double sum = 0;
int count= 0;
Scanner in = new Scanner(System.in);
//a. I use the while-loop so that I wouldn't have to re-start the program with every new grade as stated in the homework
System.out.println("Please enter your Grade :");
grade = in.nextInt();
while(grade>=0) //b. Use any score less than zero when running program to stop the while loop.
{
sum = sum + grade;
count++;
System.out.print("Grade is "+grade+ " -> letter ");
//KEY: Greater than 90 = "A"; Greater than 80 to 89 = "B", Greater than 70 to 79 = "C", Greater than 60 to 70 = "D", and 60 or below = "F"
//c. below I use If and Else statements to determine the grade.
if(grade>90)
System.out.println("Grade: A"); //prints out the grades of each letter grade
else if(grade>80 && grade<=90)
System.out.println("Grade: B");
else if(grade>70 && grade<=80)
System.out.println("Grade: C");
else if(grade>60 && grade<=70)
System.out.println("Grade: D");
else
System.out.println("Grade: F");
//d. Input grade and letter grade should be output to screen with each number grade input.
System.out.println("Enter your Grade :");
grade = in.nextInt();
}
double avg = sum/count; //in order to get AVERAGE GRADE, enter a number lower than zero!
System.out.print("Average Grade is "+avg+ " letter ");
if(avg>90)
System.out.println("Your Final average Grade is A  :) "); //result in avg grade of A
else if(avg>80 && avg<=90)
System.out.println("Your Final average Grade is B");//results in avg grade of B
else if(avg>70 && avg<=80)
System.out.println("Your Final average Grade is C"); //result in avg grade of C
else if(avg>60 && avg<=70)
System.out.println("Your Final average Grade is D"); //result in avg grade of D
else
System.out.println("Your Final average Grade is F :( "); //result in avg grade of F
//e. Finally, this will calculate and output the average grade for students input for the grade. 

}//end of the main method
}//this ends the program



