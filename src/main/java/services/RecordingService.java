package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import persistence.Recording;
import persistence.RecordingRepository;


@Service
public class RecordingService implements RecordingContract {

	@Autowired 
	private RecordingRepository recordingRepository;

	public Iterable<Recording> findAll() {
		return recordingRepository.findAll();
	}

	public Recording create(Recording recording) {
		return recordingRepository.save(recording);
	}

}