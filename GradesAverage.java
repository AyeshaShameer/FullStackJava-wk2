package wk2;

import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        int numInput = 0;
        int numStudent;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");

        numStudent = Integer.parseInt(in.next());   // use next() to read a String
        int[] arrStudent = new int[numStudent];


        do {
            System.out.print("\nEnter the grade for student " + (numInput + 1) + " : \n");
            int grade = Integer.parseInt(in.next());   // use next() to read a String

           //put the grade to array based on the index which is incremented by the loop
            if (grade >= 0 && grade <= 100) {
                 arrStudent[numInput] = grade;
            } else {
                System.out.println("Invalid grade. Enter a grade between 0 to 100 \n");
                numInput--;
            }
            numInput++;
        } while (numInput < numStudent);
        //sumup the array by loop
        int sumup = 0;
        for (int index = 0; index < arrStudent.length; index++) {
            sumup = sumup + arrStudent[index];
        }

        //print it out
        double average = sumup / numInput ;
        System.out.println("The Average is" +average);

    }
}
