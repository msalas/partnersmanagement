
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class Client{

 public static void main(String[] args) {
  try {
     // System.setSecurityManager(new RMISecurityManager());
   // Es busca el servei ServicioX -- forward
   // Localitzem i instanciem objecte de la classe remota RemoteImpl
   // I obtenim el RemoteImplStub   
   RemoteInterface c = (RemoteInterface)Naming.lookup("rmi://localhost/ServicioX");
   System.out.println( c.incr(4) );
   System.out.println( c.mesg("Luis") );
  }
  catch (MalformedURLException murle) {
   System.out.println("MalformedURLException: " + murle);
  }
  catch (RemoteException re) {
   System.out.println("RemoteException: " + re);
  }
  catch (NotBoundException nbe) {
   System.out.println("NotBoundException: " + nbe);
  }
  catch (java.lang.ArithmeticException ae) {
   System.out.println("java.lang.ArithmeticException: " + ae);
  }
 }
}


