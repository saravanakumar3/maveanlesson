
package com.chainsys.mavenlessons.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@Column(name = "DOC_ID")     //DOC_ID
	/*
	 * DOC_NAME DOB SPECIALITY CITY PHONE_NO FEES
	 */
	private int id;
	@Column(name = "DOC_NAME")
	private String doc_name;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "SPECIALITY")
	private String speciality;
	@Column(name = "CITY")
	private String city;
	@Column(name = "PHONE_NO")
	private long phNo;
	@Column(name = "FEES")
	private float fee;
	// Bidirectional Association

	@OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Appointment> appointment;
	public List<Appointment> getAppointments() {
		return this.appointment;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDoc_name() {
		return doc_name;
	}



	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getSpeciality() {
		return speciality;
	}



	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public long getPhNo() {
		return phNo;
	}



	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}



	public float getFee() {
		return fee;
	}



	public void setFee(float fee) {
		this.fee = fee;
	}



	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return String.format(" { %d, %s, %s, %s, %s,%d," + ",%.2f }", id, doc_name, dob, speciality, city, phNo,
				fee);
	}
}
