public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 15;
        int check = 0;
        for(int i = 2; i<n;i++)
        {
            if(n%i == 0)
            {
                check = 1;
            }
        }
        if(check == 1)
        System.out.println("Num is Not Prime");
        else
        System.out.println("Num is Prime");
    }
}
