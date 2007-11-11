import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorModel{
	
	private RemoteInterface ri;
	
	public ServidorModel(){
			try {
				ri = new RemoteImpl();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public void engegarServidor(){

		try {
			// Publica al servei de noms la instancia de la classe RemoteImpl
		    // Anunciant-la i substituint-la per una anterior si existís
		    Naming.rebind("rmi://localhost/ServicioX", ri);
			    
			   //Comprovar totes les Excepcions que es poden llençar
			   } catch (Exception e) { e.printStackTrace(); }	
	    
	}

	public void aturarServidor(){

		try {
		   
			// Treu el servei del servei de noms
		        Naming.unbind("rmi://localhost/ServicioX");
			    
			   //Comprovar totes les Excepcions que es poden llençar
                 } catch (Exception e) { e.printStackTrace(); }	
	    
	}

}
