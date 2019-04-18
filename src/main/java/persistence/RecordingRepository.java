package persistence;

import org.springframework.data.repository.CrudRepository;

/*
* This interface defines the operations CRUD for the Patient's recording
*/

public interface RecordingRepository extends CrudRepository<Recording, Long> {

}