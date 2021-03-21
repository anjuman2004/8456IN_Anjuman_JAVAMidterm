package math.problems;

import java.util.Scanner;
//Done

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Number for factorial:");
//        int number = scanner.nextInt();


        System.out.println("Factorial Result using Iteration: "+factorialUsingIteration(7));
        System.out.println("***************************");
        System.out.println("Factorial Result using Recursion: "+factorialUsingRecursion(7));

    }

//Factorial using iteration
    public static long factorialUsingIteration(long number) {

        long factorialProduct1 = 1;

        for(int i=1; i<=number; i++) {
            factorialProduct1 = factorialProduct1 * i;
        }
        return factorialProduct1;
    }

    //Factorial using recursion
    public static long factorialUsingRecursion(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialUsingRecursion(n - 1);
        }
    }


}
