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

	
	public GestorContracte() throws errorConnexioBD {
		super();
		g = new GestorBD();
		g.obrirConnexioBD();
	
	}


	public Vector<Contracte> llistaContractes() throws errorSQL{
		
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
			throw new errorSQL(e.toString());
		}
	
		return v;
	}

	
public Vector<Contracte> llistaContractes(String nomEmpresa) throws errorSQL{
		
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
			throw new errorSQL(e.toString());
		}
	
		return v;
	}

public void inserirContracte(Integer idContracte, String nomEmpresa, Date dataAlta,
		Date dataRescicio, Integer preu) throws errorSQL {

	Connection con = g.getConn();

	PreparedStatement pstmt = null;
	Statement stmt = null;
	Integer i = new Integer(1);
	try {
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String s = "SELECT id_empresa from empresa_partner where nombre='"+nomEmpresa+"'";
		ResultSet rs = stmt.executeQuery(s);
		if(rs.next()) i= rs.getInt(1); 
		rs.close();
		stmt.close();
			
		pstmt = con.prepareStatement("insert into contrato values(?,?,?,?,?);");
		pstmt.setInt(1,idContracte);
		pstmt.setInt(2,i);
		pstmt.setTimestamp(3,new java.sql.Timestamp ( dataAlta.getTime()));
		pstmt.setTimestamp(4,new java.sql.Timestamp ( dataRescicio.getTime()));
		pstmt.setInt(5,preu);
		
		pstmt.execute();
		pstmt.close();
	
	} catch (SQLException e) {
		throw new errorSQL(e.toString());
	}
}

public void finalize() throws errorConnexioBD{
		g.tancarConnexioBD();
	}
}