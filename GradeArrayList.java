package com.company.wk3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int numStudents = sc.nextInt();
        int temp;
        ArrayList<Integer> GradesAverage = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Please enter the grade for student(0 to 100)" + (i+1));
            temp= sc.nextInt();
            if (temp >= 0 && temp <= 100) {
                GradesAverage.add(temp);
            } else {
                System.out.println("Invalid grade please enter again");
                i--;
            }
        }

        int sum=0;
        double average;

        for(int n: GradesAverage)
        {
            sum = sum+ n;
        }
        average = sum / numStudents;
        System.out.println("The average is :" +average);

    }
}
