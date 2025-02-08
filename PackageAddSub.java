
import Maths_s.Addition;
import Maths_s.Subtraction;



public class PackageAddSub {
    public static void main(String[] args) {
        Addition ob = new Addition();
        Subtraction s = new Subtraction();
        System.out.println("Addition of 10 + 20 = " + ob.add(10,20));
        System.out.println("Subtraction of 20 - 10 = " + s.sub(20,10));
    }
}
