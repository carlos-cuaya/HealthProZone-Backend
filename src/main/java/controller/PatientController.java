package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import persistence.Patient;
import persistence.Recording;

import services.PatientContract;
import services.RecordingContract;


@RestController
@RequestMapping
public class PatientController {

	@Autowired
	private PatientContract patientService;

	@Autowired
	private RecordingContract recordingService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/patients")
	public Iterable<Patient> list() {
		return patientService.findAll();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/recording")
	public Recording insertRecording(@RequestBody Recording recording) {
		return recordingService.create(recording);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/recording/{patientId}")
	public Patient getRecordingsByIdPatient(@PathVariable(value = "patientId") long patientId) {
		return patientService.getById(patientId);
	}
    
}