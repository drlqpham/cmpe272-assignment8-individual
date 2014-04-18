import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class Square extends UnicastRemoteObject implements SquareOne {

    Square() throws RemoteException{}

    public long square(int x) throws RemoteException {
	return x*x;
    }

    public static void main(String[] args) {
	System.setSecurityManager(new RMISecurityManager());
	try {
	    Square s = new Square();
	    Naming.bind("//localhost:2013/Square", s);
	    System.out.println("Computing Squares");
	} catch(Exception e) {
	    e.printStackTrace();
	}
    }
}