
public class errorData extends Exception {
	String msg="";
	
	public errorData(String mis){
		this.msg= mis;
	}
	
	public String getMessage(){
		return msg;
	}
}
