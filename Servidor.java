import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Servidor {
  public Servidor() { // El constructor del servei -- forward
   try {
   //System.setSecurityManager(new RMISecurityManager());
    RemoteInterface ri = new RemoteImpl();
    
    // Publica al servei de noms la instancia de la classe RemoteImpl
    // Anunciant-la i substituint-la per una anterior si existís
    Naming.rebind("rmi://localhost/ServicioX", ri);
    
   //Comprovar totes les Excepcions que es poden llençar
   } catch (Exception e) { e.printStackTrace(); }
  }

  public static void main(String args[]) {
    new Servidor();
  }
}

