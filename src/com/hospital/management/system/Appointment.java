package com.hospital.management.system;

import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateTime;
    
    //getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public Appointment(int id, Doctor doctor, Patient patient, LocalDateTime dateTime) {
		super();
		this.id = id;
		this.doctor = doctor;
		this.patient = patient;
		this.dateTime = dateTime;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}

