import Constructor.*;

public class Constmain {
   public static void main(String s[]) 
   {
      Default ob = new Default();
      ob.display();
      Parameterize ob1 = new Parameterize(34);
      ob1.display();
      Coppy c1 = new Coppy(5);
      Coppy c2 = new Coppy(c1);
      c2.display();


   }
}
