package persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import app.HealthProZoneBackendApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HealthProZoneBackendApplication.class)
public class PacientRepositoryTests {

	@Autowired
	PatientRepository patientRepository;

	@Test
	public void getAllPatientsTest(){
		assertThat(patientRepository.findAll()).isEmpty();

		assertThat(patientRepository.findAll()).hasSize(1);
        //assertThat(findAll).containsOnly(webBooking);
        //assertThat(customer.getId()).isGreaterThan(-1L);
		//assertThat(customer.getName()).isEqualTo("T. Testing");
		//assertThat(customer.getEmail()).isEqualTo("t.testing@test123.tst");
		//assertThat(repository.findById(customer.getId())).isEqualTo(customer);
	}
}