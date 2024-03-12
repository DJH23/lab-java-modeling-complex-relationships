package com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Guest;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.GuestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {

    List<Guest> findByStatus(GuestStatus status);

    List<Guest> findByEventId(Long eventId);

    List<Guest> findByNameContainingIgnoreCase(String name);

    List<Guest> findByStatusAndEventId(GuestStatus status, Long eventId);
}
