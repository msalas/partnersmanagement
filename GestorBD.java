import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorBD {

	    private Connection conn = null;
	    private String url;
	    private String schema;
	    private String user;
	    private String pass;
	    private String driver;
		
	    public GestorBD(){
	    
	    	   java.util.Properties prop = null;
				try
				{ 
				  prop = new java.util.Properties();
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
				catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				}
				catch (IOException ioe) 
				{
					ioe.printStackTrace();
				}
				catch (Exception e) 
				{ e.printStackTrace();
				}

	    }
	    
		public void obrirConnexioBD()
		{
		
			 try 
			 {
			   conn = DriverManager.getConnection(url,user,pass);
			 } 
			 catch (SQLException sqle) 
			 {sqle.printStackTrace();
			  }
			 catch (Exception e)
			 {e.printStackTrace();
			  }
		}

		public void tancarConnexioBD()
		{
			try
			{
				conn.close(); 
			}
			catch (SQLException sqle)
			{
				sqle.printStackTrace();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		public Connection getConn() {
			return conn;
		}

		public void setConn(Connection conn) {
			this.conn = conn;
		}

	}

