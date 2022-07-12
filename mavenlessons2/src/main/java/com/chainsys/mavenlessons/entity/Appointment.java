package com.chainsys.mavenlessons.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = " Appointment")
public class Appointment {
	@Id
	@Column(name = "APPOIMENT_ID ")  
	private int id;                   
	@Column(name = "APPOIMENT_DATE")
	private Date appoint_Date;         
	
//	@Column(name = "DOC_ID")
//	private String doc-Id;
	
	@Column(name="PATIENT_NAME")
	
	private String patient_Name;

	@Column(name = "FEES_COLLECTED")
	private float fee_collected;
	// joincolumn map the column(DOC_ID) of current Entity Appointment
	// with the  primaryKey asspciated Entity Doctor
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APPOIMENT_ID" , nullable = false,
	insertable = false ,updatable = false)
	@JsonIgnore
	private Doctor doctor; // it point to entity class
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAppoint_Date() {
		return appoint_Date;
	}

	public void setAppoint_Date(Date appoint_Date) {
		this.appoint_Date = appoint_Date;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public float getFee_collected() {
		return fee_collected;
	}

	public void setFee_collected(float fee_collected) {
		this.fee_collected = fee_collected;
	}
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %.2f",id, 
				appoint_Date, patient_Name, fee_collected );
	}
	
}