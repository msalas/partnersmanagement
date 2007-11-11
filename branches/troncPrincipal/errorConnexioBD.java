
public class errorConnexioBD extends Exception {

	String msg="";
	
	public errorConnexioBD(String mis){
		this.msg= mis;
	}

	public String getMessage(){
		return msg;
	}
}
