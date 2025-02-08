package Arrays;

import java.util.*;;

public class Arrays {
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Inputs fot Array ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Arrays Inputs are : ");
        for(int i = 0 ; i< 10 ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
