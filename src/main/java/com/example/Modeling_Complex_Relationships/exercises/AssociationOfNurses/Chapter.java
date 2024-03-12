package com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private Member president;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Member> members;

    // Constructors, Getters, and Setters

    // No-argument constructor
    public Chapter() {
    }
    public Chapter(Long id, String name, String district, Member president, List<Member> members) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
