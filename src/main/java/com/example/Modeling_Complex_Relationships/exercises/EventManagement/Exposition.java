package com.example.Modeling_Complex_Relationships.exercises.EventManagement;

import jakarta.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Exposition extends Event {
    private String theme;
    private int expectedAttendance;

    // Constructors, getters, and setters

    public Exposition() {
    }

    public Exposition(String theme, int expectedAttendance) {
        this.theme = theme;
        this.expectedAttendance = expectedAttendance;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getExpectedAttendance() {
        return expectedAttendance;
    }

    public void setExpectedAttendance(int expectedAttendance) {
        this.expectedAttendance = expectedAttendance;
    }
}
