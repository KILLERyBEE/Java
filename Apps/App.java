package Apps;

import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter value of A");
        int a = sc.nextInt();
        System.out.println("Enter The vaue of B");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The addition of both Numbers is ");
        System.out.println(c);
        System.out.print("Your Name is "+name);
        sc.close();
    }
}
