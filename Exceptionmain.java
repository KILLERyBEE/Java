
import Exception_handling.Userdefined;
import java.io.*;
public class Exceptionmain {
    public static void main(String s[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 6 digit Password");
        String pass = br.readLine();
        try
        {
            if(pass.length()>6)
            {
                throw new Userdefined("Cannot be more than 6 digit");
            }
            else
            {
                System.out.println("Correct password");
            }
        }
        catch(Userdefined e)
        {
            System.out.println(e.getMessage());
        }
    }
}
