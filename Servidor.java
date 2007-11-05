import java.rmi.Naming;
import java.awt.event.*;

public class Servidor {
  
	private VistaServidor vs;
	private ServidorModel sm;
	
	public Servidor() { // El constructor del servei -- forward
  
	  java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              vs = new VistaServidor(this).setVisible(true);
          }
      });
	  
	  sm = new ServidorModel();
	 
  }

  private void jButton1ActionPerformed(ActionEvent evt) {
	
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
   
	  Servidor s = new Servidor();
  }
  
}

public class ServidorModel(){
	
	public ServidorModel(){
		
		try {
			   //System.setSecurityManager(new RMISecurityManager());
			    RemoteInterface ri = new RemoteImpl();
			    
			    // Publica al servei de noms la instancia de la classe RemoteImpl
			    // Anunciant-la i substituint-la per una anterior si existís
			    Naming.rebind("rmi://localhost/ServicioX", ri);
			    
			   //Comprovar totes les Excepcions que es poden llençar
			   } catch (Exception e) { e.printStackTrace(); }	
	}
}

