package math.problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

        listOfPrimeNumbers();

    }

    public static void listOfPrimeNumbers(){

        int i;
        int count;

        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }

}
