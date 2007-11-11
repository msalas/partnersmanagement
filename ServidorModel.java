
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ServidorModel{
	
	private RemoteInterface ri;
	
	public ServidorModel() throws errorConnexioBD, RemoteException{
				ri = new RemoteImpl();
	}
	
	public void engegarServidor() throws RemoteException, MalformedURLException{

	
			// Publica al servei de noms la instancia de la classe RemoteImpl
		    // Anunciant-la i substituint-la per una anterior si existís
		    Naming.rebind("rmi://localhost/ServicioX", ri);
			    
			
	    
	}

	public void aturarServidor() throws RemoteException, MalformedURLException, NotBoundException{
		// Treu el servei del servei de noms
		        Naming.unbind("rmi://localhost/ServicioX");
		
	}

}
