import java.rmi.server.*;
import java.rmi.RemoteException;

// Implementació del servei -- forward
public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    // Constructor para declarar que puede ocurrir "RemoteException"
    public RemoteImpl() throws RemoteException { super(); }
    
    public long incr(long a) throws RemoteException {
        return a+1;
    }
    
    public String mesg(String a) throws RemoteException {
        return "!Hola Amigo " + a + "!";
    }
}

