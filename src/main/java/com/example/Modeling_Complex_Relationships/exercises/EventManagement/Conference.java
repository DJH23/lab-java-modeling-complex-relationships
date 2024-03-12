package com.example.Modeling_Complex_Relationships.exercises.EventManagement;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Speaker> speakers;

    // Constructors, getters, and setters

    public Conference() {
    }

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
