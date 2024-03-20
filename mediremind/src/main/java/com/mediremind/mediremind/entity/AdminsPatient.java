package com.mediremind.mediremind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AdminsPatient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
	
	@Column(nullable = false, unique = true)
	private String patientName;

	@Column(nullable = false, unique = true)
	private String patientEmailId;
	
	@Column(nullable = false)
	private Long patientMobile;
	
	@Column(nullable = false, unique = true)
	private Long patientUID;
	
	@Column(nullable = false)
	private String patientAddress;
	
	@Column(nullable = false)
	private int patientPincode;
	
	// ------------- Getter & setter ----------------

	/**
	 * @return the patientId
	 */
	public Long getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientEmailId
	 */
	public String getPatientEmailId() {
		return patientEmailId;
	}

	/**
	 * @param patientEmailId the patientEmailId to set
	 */
	public void setPatientEmailId(String patientEmailId) {
		this.patientEmailId = patientEmailId;
	}

	/**
	 * @return the patientMobile
	 */
	public Long getPatientMobile() {
		return patientMobile;
	}

	/**
	 * @param patientMobile the patientMobile to set
	 */
	public void setPatientMobile(Long patientMobile) {
		this.patientMobile = patientMobile;
	}

	/**
	 * @return the patientUID
	 */
	public Long getPatientUID() {
		return patientUID;
	}

	/**
	 * @param patientUID the patientUID to set
	 */
	public void setPatientUID(Long patientUID) {
		this.patientUID = patientUID;
	}

	/**
	 * @return the patientAddress
	 */
	public String getPatientAddress() {
		return patientAddress;
	}

	/**
	 * @param patientAddress the patientAddress to set
	 */
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	/**
	 * @return the patientPincode
	 */
	public int getPatientPincode() {
		return patientPincode;
	}

	/**
	 * @param patientPincode the patientPincode to set
	 */
	public void setPatientPincode(int patientPincode) {
		this.patientPincode = patientPincode;
	}
	

}
