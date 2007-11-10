import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;


public class GestorPartner {

	private GestorBD g;

	
	public GestorPartner() {
		super();
		System.out.println("Dins Servidor 1");
		g = new GestorBD();
		System.out.println("Dins Servidor2");
		g.obrirConnexioBD();
	
	}


	public Vector<Partner> llistaPartners(){
		
		Vector<Partner> v = new Vector<Partner>();
		Partner p = null;
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from empresa_partner");
			
			while(rs.next()){
				p = new Partner(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getDate(4));
				v.add(p);
			}
				
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		return v;
	}

	public void finalize(){
		g.tancarConnexioBD();
	}
}
