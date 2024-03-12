package com.example.Modeling_Complex_Relationships.exercises.EventManagement.Services;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Event;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public Optional<Event> findEventById(Long id) {
        return eventRepository.findById(id);
    }

    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    // Additional methods as needed...
}
