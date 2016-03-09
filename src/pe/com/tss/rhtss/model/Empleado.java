package pe.com.tss.rhtss.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5633141466929303556L;
	private Integer idEmployee;
	private String firstName;
	private String secondName;
	private String firstLastName;
	private String secondLastName;
	private String documentType;
	private String numberIdentityDocument;
	private Integer idCountry;
	private Integer idMedic;

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getNumberIdentityDocument() {
		return numberIdentityDocument;
	}

	public void setNumberIdentityDocument(String numberIdentityDocument) {
		this.numberIdentityDocument = numberIdentityDocument;
	}

	public Integer getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}

	public Integer getIdMedic() {
		return idMedic;
	}

	public void setIdMedic(Integer idMedic) {
		this.idMedic = idMedic;
	}

}
