package com.rocketseat.planner.repository;

import java.util.List;
import java.util.UUID;

import com.rocketseat.planner.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {
    List<Activity> findByTripId(UUID tripId);
}
