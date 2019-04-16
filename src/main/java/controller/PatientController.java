package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import persistence.Patient;
import services.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private final PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@GetMapping
	public Iterable<Patient> list() {
	return patientService.findAll();
	}
}