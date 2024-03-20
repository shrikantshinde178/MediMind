package com.mediremind.mediremind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity   //for creating table
@Table(name="admin")   //specify the name of table in database
public class Admin {
		 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adminId;
	
	@Column(nullable= false, unique = true)
	private String adminName;
	
	@Column(nullable= false)
	private String password;
	
	@Column(nullable= false, unique = true)
	private String adminEmailId;

	@Column(nullable= false, unique = true)
	private Long contactNumber;
	
	@Column(nullable = false, unique = true)
	private String doctorLisenceNumber;
	
	@Column(nullable= false)
	private String hospitalName;
	
	@Column(nullable= false)
	private String hospitalAddress;
	
	@Column(nullable= false)
	private int pinCode;

// ------------ Getters & Setters -------------------
	
	/**
	 * @return the adminId
	 */
	public Long getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the adminEmailId
	 */
	public String getAdminEmailId() {
		return adminEmailId;
	}

	/**
	 * @param adminEmailId the adminEmailId to set
	 */
	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	/**
	 * @return the contactNumber
	 */
	public Long getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the doctorLisenceNumber
	 */
	public String getDoctorLisenceNumber() {
		return doctorLisenceNumber;
	}

	/**
	 * @param doctorLisenceNumber the doctorLisenceNumber to set
	 */
	public void setDoctorLisenceNumber(String doctorLisenceNumber) {
		this.doctorLisenceNumber = doctorLisenceNumber;
	}

	/**
	 * @return the hospitalName
	 */
	public String getHospitalName() {
		return hospitalName;
	}

	/**
	 * @param hospitalName the hospitalName to set
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	/**
	 * @return the hospitalAddress
	 */
	public String getHospitalAddress() {
		return hospitalAddress;
	}

	/**
	 * @param hospitalAddress the hospitalAddress to set
	 */
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	
}
