import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Vector;

// Interficie per execució remota -- forward
public interface RemoteInterface extends Remote {
    public Vector<Partner> llistaPartners()     throws RemoteException, errorSQL;
    public Vector<Contracte> llistaContractes() throws RemoteException, errorSQL;
    public Vector<Contracte> llistaContractes(String nomEmpresa) throws RemoteException, errorSQL;
    public void inserirContracte(Integer idContracte, String nomEmpresa, Date dataAlta,
			Date dataRescisio, Integer preu) throws RemoteException, errorSQL;
}

