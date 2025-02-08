package Constructor;

public class Coppy {
    int a;
    public Coppy(int b)
    {
        a = b;
    }
    public Coppy(Coppy ob)
    {
        a = ob.a;
    }
    public void display()
    {
        System.out.println("A = " + a);
    }
}
