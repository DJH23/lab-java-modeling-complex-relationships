package com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

    List<Speaker> findByConferenceId(Long conferenceId);

    List<Speaker> findByNameContainingIgnoreCase(String name);

    List<Speaker> findByPresentationDurationLessThanEqual(String duration);
}
