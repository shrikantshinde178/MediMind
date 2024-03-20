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
@Table( name = "Patient" )
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long indexId;
	
	@Column(nullable = false, unique = true)
	private String emailId;
	
	@Column(nullable= false)
	private String password;
	
	@Column(nullable= false)
	private String confirmPassword;
	
// ---------------- Getter & Setter ------------------

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
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
