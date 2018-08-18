package wk1;

public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lower bound to sum
        int upperbound = 100; // The upper bound to sum

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     // same as "sum = sum + number"
        }
        average= sum / upperbound;

        System.out.println("Ths sum of numbers from 1 to 100 is"  +sum);
        System.out.println("Ths average of numbers from 1 to 100 is"  +average);
    }
}
