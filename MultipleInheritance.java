

interface base
{
   public void display(); 
}
class Base1 implements base 
{
    @Override
    public void display()
    {
        System.out.println("Base  Display ");
    }
}

class Multiple extends Base1 
{
    public void display()
    {
        System.out.println("Base1 Display  : ");
    }
} 

public class MultipleInheritance {
    public static void main(String[] args) {
        Multiple ob = new Multiple();
        Base1 ob1 = new Base1();
        base ref ;
        ref = ob;
        ref.display();
        ref = ob1;
        ref.display();
    }

}
