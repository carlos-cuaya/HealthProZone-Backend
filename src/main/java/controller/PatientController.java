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

	@GetMapping("/patients")
	public Iterable<Patient> list() {
		return patientService.findAll();
	}

	@PostMapping("/recording")
	public Recording insertRecording(@RequestBody Recording recording) {
		return recordingService.create(recording);
	}

	@GetMapping("/recording/{patientId}")
	public Patient getRecordingsByIdPatient(@PathVariable(value = "patientId") long patientId) {
		return patientService.getById(patientId);
	}
    
}