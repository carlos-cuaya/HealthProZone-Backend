package persistence;

import org.springframework.data.repository.CrudRepository;

/*
*	This interface defines the operations CRUD for the Patient
*/
public interface PatientRepository extends CrudRepository<Patient, Long> {

}