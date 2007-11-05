import java.util.Date;


public class Partner {
	
	private Integer idEmpresa;
	private String nom;
	private String adresa;
	private String tipus;
	private Date dataReg;
	
	
	public Partner() {
		super();
	}
	
	
	public Partner(Integer idEmpresa, String nom, String adresa, String tipus,
			Date dataReg) {
		super();
		this.idEmpresa = idEmpresa;
		this.nom = nom;
		this.adresa = adresa;
		this.tipus = tipus;
		this.dataReg = dataReg;
	}


	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	public Date getDataReg() {
		return dataReg;
	}
	public void setDataReg(Date dataReg) {
		this.dataReg = dataReg;
	}
	

}
