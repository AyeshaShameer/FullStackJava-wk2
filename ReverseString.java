package wk2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr,inStr1 = "";        // input String
        int inStrLen;        // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();   // use next() to read a String
        inStrLen = inStr.length();

        for (int i = inStrLen - 1; i >= 0; --i) {
            inStr1 = inStr1 + inStr.charAt(i);
        }
        System.out.print("Reverse of the String " + inStr + " is " + inStr1);
    }
}
