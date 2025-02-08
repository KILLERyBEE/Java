package Calculators;
import java.util.Scanner;


public class Calcu {
    public void Cal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Operation you want to perform");
        String a = sc.next();
        System.out.println("Enter Num 1");
        float num1 = sc.nextInt();
        System.out.println("ENter Num 2");
        float num2 = sc.nextInt();
        switch (a)
        {
            case "+":
            System.out.print("Addition is ");
            System.out.println(num1+num2);
            break;
            case "-":
            System.out.print("Subtraction is ");
            System.out.println(num1-num2);
            break;
            case "*":
            System.out.print("Multiplication is ");
            System.out.println(num1*num2);
            break;
            case "/":
            System.out.print("Division is ");
            System.out.println(num1/num2);
            break;
        }
        sc.close();
    }

};
