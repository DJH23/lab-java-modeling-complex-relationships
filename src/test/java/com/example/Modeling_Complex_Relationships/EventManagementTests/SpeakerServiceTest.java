package com.example.Modeling_Complex_Relationships.EventManagementTests;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories.SpeakerRepository;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Services.SpeakerService;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Speaker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SpeakerServiceTest {

    @Mock
    private SpeakerRepository speakerRepository;

    @InjectMocks
    private SpeakerService speakerService;

    @Test
    void testAddSpeakerToConference() {
        Speaker speaker = new Speaker();
        when(speakerRepository.save(any(Speaker.class))).thenReturn(speaker);

        Speaker savedSpeaker = speakerService.addSpeakerToConference(speaker);

        assertNotNull(savedSpeaker);
        verify(speakerRepository).save(any(Speaker.class));
    }
}
