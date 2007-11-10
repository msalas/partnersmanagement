import java.rmi.server.*;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Vector;

// Implementació del servei -- forward
public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    
	GestorPartner gp;
	GestorContracte gc;
	
	// Constructor para declarar que puede ocurrir "RemoteException"
    public RemoteImpl() throws RemoteException {
    	
    	super(); 
    	System.out.println("Dins Remote IMPL");
    	gp = new GestorPartner();
    	System.out.println("Dp Gestor Parnter");
    	gc = new GestorContracte();
    
    }

	@Override
	public void inserirContracte(Integer idContracte, Integer p, Date dataAlta,
			Date dataRescicio, Integer preu) throws RemoteException {
	
	}

	@Override
	public Vector<Contracte> llistaContractes() throws RemoteException {
		
		return null;
	}

	@Override
	public Vector<Contracte> llistaContractes(Integer idPartner)
			throws RemoteException {

		return null;
	}

	@Override
	public Vector<Partner> llistaPartners() throws RemoteException {
		
		try{
		
			return gp.llistaPartners();
		
		}catch(Exception e){
			
		}finally{
// Si tanquem connexio llavors la propera vegada que fem consulta peta
			// pq evidentment hem tancat la connexio
			//gp.finalize();
		}
	
		return null;
	}
    
    
}

