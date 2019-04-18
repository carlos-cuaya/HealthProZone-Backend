package persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import app.HealthProZoneBackendApplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HealthProZoneBackendApplication.class)
public class PacientRepositoryTests {

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	RecordingRepository recordingRepository;

	@Test
	public void getAllPatientsTest() {
		assertThat(patientRepository.findAll()).isNotEmpty();

	}

	@Test
	public void createPatientTest() {

		Patient patient = new Patient();
		patient.setName("Carlos");

		Patient createdPatient = patientRepository.save(patient);
		assertThat(createdPatient.getName()).isEqualTo(patient.getName());
	}

	@Test
	public void createPatientAndRecordingTest() {

		Patient patient = new Patient();
		patient.setName("Carli");

		List<Recording> recordingList = new ArrayList<>();
		Recording recording = new Recording();
		recording.setType("sangre");

		recordingList.add(recording);

		patient.setRecordingList(recordingList);

		Patient createdPatient = patientRepository.save(patient);
		assertThat(createdPatient.getName()).isEqualTo(patient.getName());
	}

	@Test
	public void createRecordingTest() {

		Optional<Patient> patient = patientRepository.findById(1l);

		Recording recording = new Recording();
		recording.setType("vista");
		recording.setPatient(patient.get());

		Recording createdRecording = recordingRepository.save(recording);
		assertThat(createdRecording.getType()).isEqualTo(recording.getType());
	}		

}