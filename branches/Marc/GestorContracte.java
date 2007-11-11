import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Date;
import java.util.Vector;


public class GestorContracte {

	private GestorBD g;

	
	public GestorContracte() {
		super();
		g = new GestorBD();
		g.obrirConnexioBD();
	
	}


	public Vector<Contracte> llistaContractes(){
		
		Vector<Contracte> v = new Vector<Contracte>();
		Contracte c = null;
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * from contrato");
			
			while(rs.next()){
				c = new Contracte(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getInt(5));
				v.add(c);
			}
				
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return v;
	}

	
public Vector<Contracte> llistaContractes(String nomEmpresa){
		
		Vector<Contracte> v = new Vector<Contracte>();
		Contracte c = null;
		Connection con = g.getConn();

		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String s = "SELECT c.id_contrato, c.id_empresa,c.fecha_alta,c.fecha_recision,c.importe from contrato c, empresa_partner e where c.id_empresa=e.id_empresa and e.nombre='"+nomEmpresa+"'";
			
			ResultSet rs = stmt.executeQuery(s);

			
			while(rs.next()){
				c = new Contracte(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getInt(5));
				v.add(c);
			}
				
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return v;
	}

public void inserirContracte(Integer idContracte, String nomEmpresa, Date dataAlta,
		Date dataRescicio, Integer preu) {

	Connection con = g.getConn();

	PreparedStatement stmt = null;
	try {
		stmt = con.prepareStatement("insert into contrato values(?,?,?,?,?);");
		stmt.setInt(1,idContracte);
// Falta acabar d'omplir..
		
		stmt.execute();
		stmt.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

public void finalize(){
		g.tancarConnexioBD();
	}
}