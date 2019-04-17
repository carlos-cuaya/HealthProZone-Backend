package persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import app.HealthProZoneBackendApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HealthProZoneBackendApplication.class)
public class PacientRepositoryTests {

	@Autowired
	PatientRepository patientRepository;

	@Test
	public void getAllPatientsTest(){
		patientRepository.findAll();
	}
}