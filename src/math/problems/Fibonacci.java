package math.problems;

public class Fibonacci {
//Done
    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {

        System.out.print(fibonacciNumbers(40));
    }

public static int fibonacciNumbers(int n){
    int F1 = 0;
    int F2 = 1;
    int sum;
    System.out.println("First " + n + " Fibonacci Terms: ");

    for (int i = 1; i < n; ++i)
    {
        System.out.println(F1 );

        sum = F1 + F2;
        F1 = F2;
        F2 = sum;
    }
    return F1;

}



}
