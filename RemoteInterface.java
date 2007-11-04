import java.rmi.Remote;
import java.rmi.RemoteException;

// Interficie per execució remota -- forward
public interface RemoteInterface extends Remote {
    public long incr(long a)     throws RemoteException;
    public String mesg(String a) throws RemoteException;
}

