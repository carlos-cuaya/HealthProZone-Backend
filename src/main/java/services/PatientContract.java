package services;

import java.util.Optional;
import persistence.Patient;

public interface PatientContract {

	Iterable<Patient> findAll();

	Patient create(Patient pacient);

	Optional<Patient> find(Long id);

}