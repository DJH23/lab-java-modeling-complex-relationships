package com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Services;

import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Chapter;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Repositories.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ChapterService {
    private final ChapterRepository chapterRepository;

    @Autowired
    public ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    public Optional<Chapter> findById(Long id) {
        return chapterRepository.findById(id);
    }

    // Additional methods to handle chapters...
}
