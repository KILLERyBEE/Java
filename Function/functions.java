package Function;
import java.util.*;

public class functions {

    public static void Fibonacci(int n)
    {
        int a=0,b=1,c;
        while(n>=0)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }
    }

    public static int AddTwoNumbers(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
    Fibonacci(5);
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("\nEnter Num 1 ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 ");
        int num2 = sc.nextInt();
        System.out.println("Sum Of these Two Numbers is " + AddTwoNumbers(num1, num2));
    }
    }
}
