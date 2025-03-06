package com.rocketseat.planner.repository;

import java.util.UUID;

import com.rocketseat.planner.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, UUID>{
}
