package Tread_package;

public class My_Thread extends Thread{
    @Override
    public void run()
    {
        for(int i = 1;i<=100; i++)
        {
            System.out.println("THREAD 1 : " + i);
        }
    }
}

