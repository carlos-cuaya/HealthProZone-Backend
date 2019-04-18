package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

import java.util.List;

/**
* This class represents the patient data (identification and name) as and entity
*/

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name="patient_id")
	@JsonManagedReference
	private List<Recording> recordingList;
}