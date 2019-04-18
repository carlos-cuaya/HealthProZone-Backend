package services;

import persistence.Patient;

public interface PatientContract {

	Iterable<Patient> findAll();

	Patient create(Patient pacient);

	Patient getById(Long id);

}