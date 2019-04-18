package services;

import java.util.Optional;
import persistence.Recording;

public interface RecordingContract {

	Iterable<Recording> findAll();

	Recording create(Recording recording);

}