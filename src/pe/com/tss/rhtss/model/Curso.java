package pe.com.tss.rhtss.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Curso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6370353372526182828L;

	private Integer nCodCur;
	private String vNomCur;
	private Integer idEmployee;

	public Curso() {
		nCodCur = -1;

	}

	public Integer getnCodCur() {
		return nCodCur;
	}

	public void setnCodCur(Integer nCodCur) {
		this.nCodCur = nCodCur;
	}

	public String getvNomCur() {
		return vNomCur;
	}

	public void setvNomCur(String vNomCur) {
		this.vNomCur = vNomCur;
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}
	

}
