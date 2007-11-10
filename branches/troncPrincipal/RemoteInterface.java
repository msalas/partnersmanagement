import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Vector;

// Interficie per execuci� remota -- forward
public interface RemoteInterface extends Remote {
    public Vector<Partner> llistaPartners()     throws RemoteException;
    public Vector<Contracte> llistaContractes() throws RemoteException;
    public Vector<Contracte> llistaContractes(Integer idPartner) throws RemoteException;
    public void inserirContracte(Integer idContracte, Integer p, Date dataAlta,
			Date dataRescicio, Integer preu) throws RemoteException;
}

