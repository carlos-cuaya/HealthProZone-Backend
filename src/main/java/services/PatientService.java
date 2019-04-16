package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import persistence.Patient;
import persistence.PatientRepository;



@Service
public class PatientService implements PatientContract {

	@Autowired 
	private PatientRepository patientRepository;

	public Iterable<Patient> findAll() {
		return patientRepository.findAll();
	}

	public Patient create(Patient pacient) {
		return patientRepository.save(pacient);
	}

	public Optional<Patient> find(Long id){
		return patientRepository.findById(id);
	}

}