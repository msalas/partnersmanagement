
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GestorBD {

	    private Connection conn = null;
	    private String url;
	    private String schema;
	    private String user;
	    private String pass;
	    private String driver;
		
	    public GestorBD() throws errorConnexioBD {
	    
	    	   Properties prop = null;
				try
				{ 
				  prop = new Properties();
				  FileInputStream fis = new FileInputStream("configuration.properties");
				  prop.load(fis);

				  this.url = prop.getProperty("url");
				  this.schema = prop.getProperty("schema");
				  this.user = prop.getProperty("username");
				  this.pass = prop.getProperty("password");
				  this.driver = prop.getProperty("driver");
							  
				  //Carrega el driver del postgre
				   Class.forName(driver);
				}
				catch (FileNotFoundException fnfe) 
				{
					throw new errorConnexioBD("Error: No s'ha trobat el fitxer configuration.properties");
				}
				catch (IOException ioe) 
				{
					throw new errorConnexioBD("Error: Problema amb el fitxer configuration.properties");
				}catch (ClassNotFoundException cnfe){
					throw new errorConnexioBD("Error: No s'ha pogut carregar el driver");
				}catch (Exception e){
					throw new errorConnexioBD("Error: No s'ha pogut establir la configuració de la Base de Dades");
				}
				

	    }
	    
		public void obrirConnexioBD() throws errorConnexioBD  
		{
		
			 try 
			 {
			   conn = DriverManager.getConnection(url,user,pass);
			 }catch (Exception e)
			 {throw new errorConnexioBD("No s'ha pogut obrir la connexió amb la Base de Dades");
			  }
		}

		public void tancarConnexioBD()throws errorConnexioBD
		{
			try
			{
				conn.close(); 
			}
			catch (Exception e)
			{
				throw new errorConnexioBD("No s'ha pogut tancar la connexió de la Base de Dades");
				
			}
		}

		public Connection getConn() {
			return conn;
		}

		public void setConn(Connection conn) {
			this.conn = conn;
		}

	}

