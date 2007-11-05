import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;


public class GestorPartner {

	private GestorBD g;

	
	public GestorPartner() {
		super();
		g = new GestorBD();
		g.obrirConnexioBD();
	
	}


	public Vector<Partner> llistaPartners() throws RemoteException {
		
		Vector<Partner> v = new Vector<Partner>();
				
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * from empresa_partner");

			
			
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		return null;
	}

	public void finalize(){
		g.tancarConnexioBD();
	}
}
