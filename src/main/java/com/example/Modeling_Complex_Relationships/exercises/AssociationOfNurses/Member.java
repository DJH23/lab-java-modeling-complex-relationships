package com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    // Constructors, Getters, and Setters

    public Member() {
    }

    public Member(Long id, String name, MemberStatus status, LocalDate renewalDate, Chapter chapter) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.chapter = chapter;
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

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
}
