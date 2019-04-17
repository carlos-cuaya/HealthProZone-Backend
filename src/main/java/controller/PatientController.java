package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import persistence.Patient;
import services.PatientContract;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientContract patientService;

	@GetMapping
	public Iterable<Patient> list() {
	return patientService.findAll();
	}
}