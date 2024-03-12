package com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Event;

public interface EventRepository extends JpaRepository<Event, Long> {}
