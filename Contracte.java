import java.io.Serializable;
import java.util.Date;


public class Contracte implements Serializable {
	
	private Integer idContracte;
	private Integer idEmpresa;
	private Date dataAlta;
	private Date dataRescicio;
	private Integer preu;
	
	public Contracte() {
		super();
	}

	
	public Contracte(Integer idContracte, Integer idEmpresa, Date dataAlta,
			Date dataRescicio, Integer preu) {
		super();
		this.idContracte = idContracte;
		this.idEmpresa = idEmpresa;
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


	public Integer getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	

}
