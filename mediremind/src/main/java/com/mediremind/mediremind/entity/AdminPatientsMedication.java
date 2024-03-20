package com.mediremind.mediremind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="Admin_Patient_Medication")
public class AdminPatientsMedication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long indexId;
	
	@Column(nullable = false)
	private Long adminspatientId;
	
	@Column(nullable = false)
	private String medicineN1;
	
	@Column(nullable = true)
	private String medicineN2;
	
	@Column(nullable = true)
	private String medicineN3;
	
	@Column(nullable = true)
	private String medicineN4;
	
	@Column(nullable = true)
	private String medicineN5;
	
	@Column(nullable = true)
	private String medicineN6;
	
	@Column(nullable = true)
	private String medicineN7;
	
	@Column(nullable = true)
	private String medicineN8;
	
	@Column(nullable = true)
	private String medicineN9;
	
	@Column(nullable = true)
	private String medicineN10;

	// ---------------- Getter & Setter ----------------------
	
	/**
	 * @return the indexId
	 */
	public Long getIndexId() {
		return indexId;
	}

	/**
	 * @param indexId the indexId to set
	 */
	public void setIndexId(Long indexId) {
		this.indexId = indexId;
	}

	/**
	 * @return the adminspatientId
	 */
	public Long getAdminspatientId() {
		return adminspatientId;
	}

	/**
	 * @param adminspatientId the adminspatientId to set
	 */
	public void setAdminspatientId(Long adminspatientId) {
		this.adminspatientId = adminspatientId;
	}

	/**
	 * @return the medicineN1
	 */
	public String getMedicineN1() {
		return medicineN1;
	}

	/**
	 * @param medicineN1 the medicineN1 to set
	 */
	public void setMedicineN1(String medicineN1) {
		this.medicineN1 = medicineN1;
	}

	/**
	 * @return the medicineN2
	 */
	public String getMedicineN2() {
		return medicineN2;
	}

	/**
	 * @param medicineN2 the medicineN2 to set
	 */
	public void setMedicineN2(String medicineN2) {
		this.medicineN2 = medicineN2;
	}

	/**
	 * @return the medicineN3
	 */
	public String getMedicineN3() {
		return medicineN3;
	}

	/**
	 * @param medicineN3 the medicineN3 to set
	 */
	public void setMedicineN3(String medicineN3) {
		this.medicineN3 = medicineN3;
	}

	/**
	 * @return the medicineN4
	 */
	public String getMedicineN4() {
		return medicineN4;
	}

	/**
	 * @param medicineN4 the medicineN4 to set
	 */
	public void setMedicineN4(String medicineN4) {
		this.medicineN4 = medicineN4;
	}

	/**
	 * @return the medicineN5
	 */
	public String getMedicineN5() {
		return medicineN5;
	}

	/**
	 * @param medicineN5 the medicineN5 to set
	 */
	public void setMedicineN5(String medicineN5) {
		this.medicineN5 = medicineN5;
	}

	/**
	 * @return the medicineN6
	 */
	public String getMedicineN6() {
		return medicineN6;
	}

	/**
	 * @param medicineN6 the medicineN6 to set
	 */
	public void setMedicineN6(String medicineN6) {
		this.medicineN6 = medicineN6;
	}

	/**
	 * @return the medicineN7
	 */
	public String getMedicineN7() {
		return medicineN7;
	}

	/**
	 * @param medicineN7 the medicineN7 to set
	 */
	public void setMedicineN7(String medicineN7) {
		this.medicineN7 = medicineN7;
	}

	/**
	 * @return the medicineN8
	 */
	public String getMedicineN8() {
		return medicineN8;
	}

	/**
	 * @param medicineN8 the medicineN8 to set
	 */
	public void setMedicineN8(String medicineN8) {
		this.medicineN8 = medicineN8;
	}

	/**
	 * @return the medicineN9
	 */
	public String getMedicineN9() {
		return medicineN9;
	}

	/**
	 * @param medicineN9 the medicineN9 to set
	 */
	public void setMedicineN9(String medicineN9) {
		this.medicineN9 = medicineN9;
	}

	/**
	 * @return the medicineN10
	 */
	public String getMedicineN10() {
		return medicineN10;
	}

	/**
	 * @param medicineN10 the medicineN10 to set
	 */
	public void setMedicineN10(String medicineN10) {
		this.medicineN10 = medicineN10;
	}
	
	
	
}
