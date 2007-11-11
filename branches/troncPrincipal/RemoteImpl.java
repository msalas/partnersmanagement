import java.rmi.server.*;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Vector;

// Implementació del servei -- forward
public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    
	GestorPartner gp;
	GestorContracte gc;
	
    public RemoteImpl() throws RemoteException, errorConnexioBD {
    	
    	super(); 
    	gp = new GestorPartner();
    	gc = new GestorContracte();
    
    }

	
	public Vector<Contracte> llistaContractes() throws RemoteException, errorSQL {
			return gc.llistaContractes();
	}

	
	public Vector<Contracte> llistaContractes(String nomEmpresa)
			throws RemoteException, errorSQL {
			return gc.llistaContractes(nomEmpresa);
	
	}

	
	public Vector<Partner> llistaPartners() throws RemoteException, errorSQL {
			return gp.llistaPartners();
		
	}


	
	public void inserirContracte(Integer idContracte, String nomEmpresa,
			Date dataAlta, Date dataRescicio, Integer preu)
			throws RemoteException, errorSQL {
		gc.inserirContracte(idContracte, nomEmpresa, dataAlta, dataRescicio, preu);
		
	}
    
    
}

