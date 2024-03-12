package com.example.Modeling_Complex_Relationships.EventManagementTests;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Guest;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.GuestStatus;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories.GuestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class GuestRepositoryTest {

    @Autowired
    private GuestRepository guestRepository;

    @Test
    void whenFindByStatus_thenReturnGuests() {
        // Assume testDataSetup() populates the in-memory database with test data
        testDataSetup();

        List<Guest> attendingGuests = guestRepository.findByStatus(GuestStatus.ATTENDING);

        assertThat(attendingGuests).isNotEmpty();
        assertThat(attendingGuests).hasSize(2);
        assertThat(attendingGuests.get(0).getStatus()).isEqualTo(GuestStatus.ATTENDING);
        assertThat(attendingGuests.get(1).getStatus()).isEqualTo(GuestStatus.ATTENDING);
    }

    // Additional test cases here
    private void testDataSetup() {
        // Clear existing data to avoid conflicts
        guestRepository.deleteAll();

        // Create and save test entities
        Guest guest1 = new Guest();
        guest1.setName("John Doe");
        guest1.setStatus(GuestStatus.ATTENDING);

        Guest guest2 = new Guest();
        guest2.setName("Jane Roe");
        guest2.setStatus(GuestStatus.NOT_ATTENDING);

        Guest guest3 = new Guest();
        guest3.setName("Sam Sepiol");
        guest3.setStatus(GuestStatus.ATTENDING);

        guestRepository.save(guest1);
        guestRepository.save(guest2);
        guestRepository.save(guest3);
    }
}
