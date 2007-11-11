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

	
	public void inserirContracte(Integer idContracte, String nomEmpresa, Date dataAlta,
			Date dataRescicio, Integer preu) throws RemoteException {
	
		//gc.inserirContracte(idContracte, nomEmpresa, dataAlta, dataRescicio, preu);
		System.out.println("Ara faria INSERT");
	}

	
	public Vector<Contracte> llistaContractes() throws RemoteException {
		try{
			
			return gc.llistaContractes();
		
		}catch(Exception e){
			
		}finally{
			// 	Si tanquem connexio llavors la propera vegada que fem consulta peta
			// pq evidentment hem tancat la connexio
			//gp.finalize();
		}
	
		return null;
	}

	
	public Vector<Contracte> llistaContractes(String nomEmpresa)
			throws RemoteException {
		
		try{
			
			return gc.llistaContractes(nomEmpresa);
		
		}catch(Exception e){
			
		}finally{
			// 	Si tanquem connexio llavors la propera vegada que fem consulta peta
			// pq evidentment hem tancat la connexio
			//gp.finalize();
		}
	
		return null;
	}

	
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

