import java.util.Date;


public class Contracte {
	
	private Integer idContracte;
	private Partner p;
	private Date dataAlta;
	private Date dataRescicio;
	private Integer preu;
	
	public Contracte() {
		super();
	}

	
	public Contracte(Integer idContracte, Partner p, Date dataAlta,
			Date dataRescicio, Integer preu) {
		super();
		this.idContracte = idContracte;
		this.p = p;
		this.dataAlta = dataAlta;
		this.dataRescicio = dataRescicio;
		this.preu = preu;
	}


	public Integer getIdContracte() {
		return idContracte;
	}

	public void setIdContracte(Integer idContracte) {
		this.idContracte = idContracte;
	}

	public Partner getP() {
		return p;
	}

	public void setP(Partner p) {
		this.p = p;
	}

	public Date getDataAlta() {
		return dataAlta;
	}

	public void setDataAlta(Date dataAlta) {
		this.dataAlta = dataAlta;
	}

	public Date getDataRescicio() {
		return dataRescicio;
	}

	public void setDataRescicio(Date dataRescicio) {
		this.dataRescicio = dataRescicio;
	}

	public Integer getPreu() {
		return preu;
	}

	public void setPreu(Integer preu) {
		this.preu = preu;
	}
	
	

}
