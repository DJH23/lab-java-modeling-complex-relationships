package com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long> { }
