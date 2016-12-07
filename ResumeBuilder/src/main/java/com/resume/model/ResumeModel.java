package com.resume.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="resume_tbl")
public class ResumeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//add photo
	//add signature
	//add date and also add date and time int login table and other tables for last access or last modified.
	@Id
	@GeneratedValue
	@Column(name="resumeId")
	private Integer resumeID;
	@Column(name="userId")
	private Integer userID;
	@Column(name="title")
	private String resumeTitle;
	@Column(name="fname")
	private String firstName;
	@Column(name="mname")
	private String middleName;
	@Column(name="lname")
	private String lastName;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="marital_status")
	private String maritalStatus;
	@Column(name="email")
	private String emailID;
	@OneToOne(cascade=CascadeType.ALL)
	private LocalAddressModel localAddressModel;
	@OneToOne(cascade=CascadeType.ALL)
	private PermanentAddressModel permanentAddressModel;
	public Integer getResumeID() {
		return resumeID;
	}
	public void setResumeID(Integer resumeID) {
		this.resumeID = resumeID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getResumeTitle() {
		return resumeTitle;
	}
	public void setResumeTitle(String resumeTitle) {
		this.resumeTitle = resumeTitle;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
	public LocalAddressModel getLocalAddressModel() {
		return localAddressModel;
	}
	public void setLocalAddressModel(LocalAddressModel localAddressModel) {
		this.localAddressModel = localAddressModel;
	}
	public PermanentAddressModel getPermanentAddressModel() {
		return permanentAddressModel;
	}
	public void setPermanentAddressModel(PermanentAddressModel permanentAddressModel) {
		this.permanentAddressModel = permanentAddressModel;
	}
	
	
	
	

}
