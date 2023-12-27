package MasteringTheFundamentals.CHALLENGE5;

import java.lang.*;
import java.util.*;

public class Q2LCMEasy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int OA = A;
        int OB = B;

        while(B % A != 0){
            int remainder = B % A;
            B= A;
            A= remainder;
        }
        int gcd = A;
        int lcm = (OA * OB) / gcd;
        System.out.println(lcm);
    }
}

/*
Implement a program that takes two positive integers A and B in the input and prints their LCM.

Definition of LCM :
The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B).
And the LCM is the smallest or least positive integer that is divisible by both A and B.
* */
