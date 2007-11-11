
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
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
	
	public Vector<Vector> llistaPartners() throws RemoteException {
		Vector<Object> v;
		Vector<Vector> vv = new Vector<Vector>();
		
		for (Enumeration<Partner> e = (c.llistaPartners()).elements() ; e.hasMoreElements() ;) {
					Partner p = e.nextElement();

					v = new Vector<Object>();
					v.add(p.getIdEmpresa());
					v.add(p.getNom());
					v.add(p.getAdresa());
					v.add(p.getDataReg());
					vv.add(v);
		}
		
		return vv;
	}

	public Vector<Vector> llistaContractes() throws RemoteException {
		Vector<Object> v;
		Vector<Vector> vv = new Vector<Vector>();
		
		for (Enumeration<Contracte> e = (c.llistaContractes()).elements() ; e.hasMoreElements() ;) {
					Contracte c = e.nextElement();

					v = new Vector<Object>();
					v.add(c.getIdContracte());
					v.add(c.getIdEmpresa());
					v.add(c.getDataAlta());
					v.add(c.getDataRescicio());
					v.add(c.getPreu());
					vv.add(v);
		}
		
		return vv;
	}
	
	public Vector<Vector> llistaContractes(String nomEmpresa) throws RemoteException {
		Vector<Object> v;
		Vector<Vector> vv = new Vector<Vector>();
		
		for (Enumeration<Contracte> e = (c.llistaContractes(nomEmpresa)).elements() ; e.hasMoreElements() ;) {
					Contracte c = e.nextElement();

					v = new Vector<Object>();
					v.add(c.getIdContracte());
					v.add(c.getIdEmpresa());
					v.add(c.getDataAlta());
					v.add(c.getDataRescicio());
					v.add(c.getPreu());
					vv.add(v);
		}
		
		return vv;
	}
	
	public Vector<String> llistaNomsEmpreses() throws RemoteException {
		
		Vector<String> v = new Vector<String>();
		
		for (Enumeration<Partner> e = (c.llistaPartners()).elements() ; e.hasMoreElements() ;) {
					Partner p = e.nextElement();
					v.add(p.getNom());
		}
		
		return v;
	}

	public void inserirContracte(String idContracte, String nomEmpresa, String dataAlta,
			String dataRescicio, String preu) throws RemoteException {
	
			SimpleDateFormat d = new SimpleDateFormat();
		try {
			c.inserirContracte(new Integer(idContracte),nomEmpresa,d.parse(dataAlta), d.parse(dataRescicio),new Integer(preu));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


