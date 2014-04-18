import java.rmi.*;

interface SquareOne extends Remote {
    long square(int i) throws RemoteException;
}