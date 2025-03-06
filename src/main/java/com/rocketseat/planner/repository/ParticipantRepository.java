package com.rocketseat.planner.repository;

import java.util.List;
import java.util.UUID;

import com.rocketseat.planner.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, UUID>{
    List<Participant> findByTripId(UUID tripId);
}
