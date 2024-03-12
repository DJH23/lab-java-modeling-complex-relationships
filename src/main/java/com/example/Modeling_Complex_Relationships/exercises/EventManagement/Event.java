package com.example.Modeling_Complex_Relationships.exercises.EventManagement;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="event_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Guest> guests;

    // Constructors, getters, and setters

    public Event() {
    }

public Event(LocalDate date, String duration, String location, String title, List<Guest> guests) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
