import java.rmi.server.*;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Vector;

// Implementació del servei -- forward
public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    
	
	
	// Constructor para declarar que puede ocurrir "RemoteException"
    public RemoteImpl() throws RemoteException { super(); }

	@Override
	public void inserirContracte(Integer idContracte, Partner p, Date dataAlta,
			Date dataRescicio, Integer preu) throws RemoteException {
			
	}

	@Override
	public Vector<Contracte> llistaContractes() throws RemoteException {
		
		return null;
	}

	@Override
	public Vector<Contracte> llistaContractes(String idPartner)
			throws RemoteException {

		return null;
	}

	@Override
	public Vector<Partner> llistaPartners() throws RemoteException {
		
		return null;
	}
    
    
}

