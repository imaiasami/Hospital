package com.example.dao;

import java.util.List;

import com.example.vo.Doctor;
import com.example.vo.Patient;
import com.example.vo.Reservation;
import com.example.vo.Schedule;

public interface HospitalMapper {
	
	int addDoctor(Doctor doctor);
	Doctor searchDoctorBySsn(String ssn);
	Doctor searchDoctorBySeq(int seq_doc);
	List<Doctor> searchDoctorByName(String name);
	List<Doctor> searchDoctorByDept(String dept);
	int updateDoctor(Doctor doctor);
	
	int addPatient(Patient patient);
	Patient searchPatientBySsn(String ssn);
	Patient searchPatientBySeq(int seq_pat);
	List<Patient>searchPatientByName(String name);
	int updatePatient(Patient patient);
	
	int addSchedule(Schedule schedule);
	Schedule searchSchedule(Schedule schedule);
	int updateSchedule(Schedule schedule);
	
	int addReservation(Reservation reservation);
	Reservation searchReservation(Reservation reservation);
	List<Reservation> searchReservationByPat(int seq_pat);
	int deleteReservation(Reservation reservation);
	
}