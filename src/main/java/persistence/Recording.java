package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

/**
* this class represents the recording data(identification, recording type and patient) of patients as an entity
*/

@Data
@Entity
public class Recording {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    @JsonBackReference
    private Patient patient;
}