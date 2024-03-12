package com.example.Modeling_Complex_Relationships.EventManagementTests;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Guest;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.GuestStatus;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories.GuestRepository;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Services.GuestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GuestServiceTest {

    @Mock
    private GuestRepository guestRepository;

    @InjectMocks
    private GuestService guestService;

    @Test
    void testFindGuestsByStatus() {
        Guest guest = new Guest();
        guest.setStatus(GuestStatus.ATTENDING);

        when(guestRepository.findByStatus(GuestStatus.ATTENDING)).thenReturn(Arrays.asList(guest));

        List<Guest> guests = guestService.findGuestsByStatus(GuestStatus.ATTENDING);

        assertFalse(guests.isEmpty());
        assertEquals(GuestStatus.ATTENDING, guests.get(0).getStatus());
        verify(guestRepository).findByStatus(GuestStatus.ATTENDING);
    }
}
