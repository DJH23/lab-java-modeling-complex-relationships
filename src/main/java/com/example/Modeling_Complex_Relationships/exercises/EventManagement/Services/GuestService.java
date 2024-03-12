package com.example.Modeling_Complex_Relationships.exercises.EventManagement.Services;

import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Guest;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.GuestStatus;
import com.example.Modeling_Complex_Relationships.exercises.EventManagement.Repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GuestService {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public Guest addGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    public List<Guest> findGuestsByStatus(GuestStatus status) {
        return guestRepository.findByStatus(status);
    }

    public List<Guest> findGuestsByEventId(Long eventId) {
        return guestRepository.findByEventId(eventId);
    }

    public void updateGuestStatus(Long guestId, GuestStatus status) {
        guestRepository.findById(guestId).ifPresent(guest -> {
            guest.setStatus(status);
            guestRepository.save(guest);
        });
    }

    // Additional methods as needed...
}
