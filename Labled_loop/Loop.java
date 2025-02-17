package Labled_loop;

public class Loop 
{
    public void Labled_Loop()
    {
        Loop1:
        for(int i=1;i<10;i++)
        {
            Loop2:
            for(int j=2;j<=10;j++)
            {
                System.out.println(i + " * " + j + " = " + (i*j));
                if(i==5)
                {
                    break Loop1;
            
                }
            }
        }
        
    }
}
