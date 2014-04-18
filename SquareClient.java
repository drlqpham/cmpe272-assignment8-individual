import java.rmi.*;
import java.rmi.registry.*;

public class SquareClient {

    public static void main(String[] args) {
	System.setSecurityManager(new RMISecurityManager());
	try {
	    SquareOne t = (SquareOne) Naming.lookup("//localhost:2013/Square");
	    for(int i = 0; i < 10; i++)
		System.out.println("Square (" + i + ") = " + t.square(i));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}