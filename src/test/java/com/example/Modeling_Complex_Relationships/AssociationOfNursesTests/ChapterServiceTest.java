package com.example.Modeling_Complex_Relationships.AssociationOfNursesTests;

import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Chapter;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Repositories.ChapterRepository;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Services.ChapterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ChapterServiceTest {

    @Mock
    private ChapterRepository chapterRepository;

    @InjectMocks
    private ChapterService chapterService;

    @Test
    public void testFindById_WhenChapterExists() {
        Chapter chapter = new Chapter();
        chapter.setId(1L);
        Mockito.when(chapterRepository.findById(1L)).thenReturn(Optional.of(chapter));

        Optional<Chapter> foundChapter = chapterService.findById(1L);

        Assertions.assertTrue(foundChapter.isPresent());
        Assertions.assertEquals(1L, foundChapter.get().getId());
        Mockito.verify(chapterRepository).findById(1L);
    }

    @Test
    public void testFindById_WhenChapterDoesNotExist() {
        Mockito.when(chapterRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.empty());

        Optional<Chapter> foundChapter = chapterService.findById(1L);

        Assertions.assertFalse(foundChapter.isPresent());
        Mockito.verify(chapterRepository).findById(1L);
    }

    // Additional test cases as needed...
}
