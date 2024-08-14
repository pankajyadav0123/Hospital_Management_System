package com.hospital.management.system;

import java.time.LocalDateTime;

public class HospitalManagement {
    public static void main(String[] args) {
    	
        HospitalSystem hospital = new HospitalSystem();
        
        // Creating patients objects
        Patient patient1 = new Patient(1, "Pankaj", 22, "Male");
        Patient patient2 = new Patient(2, "Saanvi", 1, "Female");
       
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Creating doctors objects
        Doctor doctor1 = new Doctor(1, "Dr. BDK Patro", "Cardiology");
        Doctor doctor2 = new Doctor(2, "Dr. Kallu Singh", "Pediatrics");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Scheduling appointments
        hospital.scheduleAppointment(doctor1, patient1, LocalDateTime.now().plusDays(1));
        hospital.scheduleAppointment(doctor2, patient2, LocalDateTime.now().plusDays(2));
        
      //  System.out.println("Pankaj");
    }
}
