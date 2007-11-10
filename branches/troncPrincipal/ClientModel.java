
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.Vector;

public class ClientModel{

	RemoteInterface c;
	
	public ClientModel(){
		
	}
	
	public void connexioRMI(){
	
		try {
		     // System.setSecurityManager(new RMISecurityManager());
		   // Es busca el servei ServicioX -- forward
		   // Localitzem i instanciem objecte de la classe remota RemoteImpl
		   // I obtenim el RemoteImplStub   
		   c = (RemoteInterface)Naming.lookup("rmi://localhost:1099/ServicioX");
		 
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
	
	public Vector<Partner> llistaPartners() throws RemoteException {
		
		return c.llistaPartners();
	}
}


