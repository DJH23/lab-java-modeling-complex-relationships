package com.example.Modeling_Complex_Relationships.exercises.EventManagement.Services;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories.SpeakerRepository;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpeakerService {

    private final SpeakerRepository speakerRepository;

    @Autowired
    public SpeakerService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public Speaker addSpeakerToConference(Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    public List<Speaker> findSpeakersByConference(Long conferenceId) {
        return speakerRepository.findByConferenceId(conferenceId);
    }

    // Update method for speaker details if necessary...

    // Additional methods as needed...
}
