
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
	
	public void connexioRMI() throws RemoteException, MalformedURLException, NotBoundException{
	
		
		     // System.setSecurityManager(new RMISecurityManager());
		   // Es busca el servei ServicioX -- forward
		   // Localitzem i instanciem objecte de la classe remota RemoteImpl
		   // I obtenim el RemoteImplStub   
		   c = (RemoteInterface)Naming.lookup("rmi://localhost:1099/ServicioX");
		 
		 

	}
	
	public Vector<Vector> llistaPartners() throws RemoteException, errorSQL {
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

	public Vector<Vector> llistaContractes() throws RemoteException, errorSQL {
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
	
	public Vector<Vector> llistaContractes(String nomEmpresa) throws RemoteException, errorSQL {
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
	
	public Vector<String> llistaNomsEmpreses() throws RemoteException, errorSQL {
		
		Vector<String> v = new Vector<String>();
		
		for (Enumeration<Partner> e = (c.llistaPartners()).elements() ; e.hasMoreElements() ;) {
					Partner p = e.nextElement();
					v.add(p.getNom());
		}
		
		return v;
	}

	public void inserirContracte(String idContracte, String nomEmpresa, String dataAlta,
			String dataRescicio, String preu) throws RemoteException, errorSQL, errorData {
			
		
		 DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 
	        try
	        {                         
	             c.inserirContracte(new Integer(idContracte),nomEmpresa,df.parse(dataAlta),df.parse(dataRescicio),new Integer(preu));	            
	        } catch (ParseException e)
	        {
	         throw new errorData("Error: Format de data incorrecte");   
	        }
		
		
		
	}

}


