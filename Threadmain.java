
import Tread_package.My_Thread;
import Tread_package.My_Thread1;

public class Threadmain {
    public static void main(String[] args) {
        My_Thread ob = new My_Thread();
        My_Thread1 ob2 = new My_Thread1();
        ob.setPriority(8);
        ob2.start();
        ob.start();
        

    }
}
