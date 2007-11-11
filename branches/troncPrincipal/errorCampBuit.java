
public class errorCampBuit extends Exception {
	String msg="";
	
	public errorCampBuit(String mis){
		this.msg= mis;
	}
	
	public String getMessage(){
		return msg;
	}
}
