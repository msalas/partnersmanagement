import java.rmi.Naming;

public class ServidorModel{
	
	private RemoteInterface ri;
	
	public ServidorModel(){
	}
	
	public void engegarServidor(){

		try {
			RemoteInterface ri = new RemoteImpl();
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
