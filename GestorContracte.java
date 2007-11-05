import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;


public class GestorContracte {

	private GestorBD g;

	
	public GestorContracte() {
		super();
		g = new GestorBD();
		g.obrirConnexioBD();
	
	}


	public Vector<Contracte> llistaContracte(){
		
		Vector<Contracte> v = new Vector<Contracte>();
		Contracte c = null;
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * from contractes");
			
			while(rs.next()){
				c = new Contracte(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getInt(5));
				v.add(c);
			}
				
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return v;
	}

	
public Vector<Contracte> llistaContracte(Integer idEmpresa){
		
		Vector<Contracte> v = new Vector<Contracte>();
		Contracte c = null;
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * from contractes wjere id_empresa="+idEmpresa);
			
			while(rs.next()){
				c = new Contracte(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getInt(5));
				v.add(c);
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