package Tread_package;

public class My_Thread1 extends Thread {
    @Override
    public void run()
    {
        for(int i = 101; i<=200 ; i++)
        {
            System.out.println("Thread 2 : " + i);
        }
    }
}
