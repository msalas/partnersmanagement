import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;


public class GestorPartner {

	private GestorBD g;

	
	public GestorPartner() {
		super();
		g = new GestorBD();
		g.obrirConnexioBD();
	
	}


	public Vector<Partner> llistaPartners(){
		
		Vector<Partner> v = new Vector<Partner>();
		Partner p = null;
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * from empresa_partner");
			
			while(rs.next()){
				p = new Partner(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
				v.add(p);
			}
				
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		return v;
	}

	public void finalize(){
		g.tancarConnexioBD();
	}
}
