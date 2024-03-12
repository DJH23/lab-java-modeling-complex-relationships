package com.example.Modeling_Complex_Relationships.exercises.EventManagement;

import jakarta.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    // Constructors, getters, and setters

    public Speaker() {
    }

    public Speaker(String name, String presentationDuration, Conference conference) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conference = conference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(String presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
}
